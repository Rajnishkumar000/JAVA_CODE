package CN_project;
import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleUnaryOperator;
import static CN_project.Server.functions;
class Parser {
    private String[] tokens;
    private int index;
    public Parser(String[] tokens) {
        this.tokens = tokens;
        this.index = 0;
    }
    public double parse() {
        return parseAddSub();
    }
    private double parseAddSub() {
        double leftResult = parseMulDiv();
        while (index < tokens.length && (tokens[index].equals("+") || tokens[index].equals("-"))) {
            String operator = tokens[index];
            index++;

            double rightResult = parseMulDiv();

            if (operator.equals("+")) {
                leftResult += rightResult;
            } else {
                leftResult -= rightResult;
            }
        }
        return leftResult;
    }

    private double parseMulDiv() {
        double leftResult = parsePower();

        while (index < tokens.length && (tokens[index].equals("*") || tokens[index].equals("/"))) {
            String operator = tokens[index];
            index++;

            double rightResult = parsePower();

            if (operator.equals("*")) {
                leftResult *= rightResult;
            } else {
                if (rightResult != 0) {
                    leftResult /= rightResult;
                } else {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
            }
        }

        return leftResult;
    }

    private double parsePower() {
        double leftResult = parseFunction();

        while (index < tokens.length && tokens[index].equals("^")) {
            index++;

            double rightResult = parseFunction();

            leftResult = Math.pow(leftResult, rightResult);
        }

        return leftResult;
    }

    private double parseFunction() {
        if (index < tokens.length && functions.containsKey(tokens[index])) {
            String functionName = tokens[index];
            index++;

            if (index < tokens.length && tokens[index].equals("(")) {
                index++;

                double argument = parseAddSub();

                if (index < tokens.length && tokens[index].equals(")")) {
                    index++;
                    // Use degrees for trigonometric functions
                    if (functions.containsKey(functionName) && functionName.matches("sin|cos|tan")) {
                        argument = Math.toRadians(argument);
                    }
                    return functions.get(functionName).applyAsDouble(argument);
                } else {
                    System.out.println("Error: Missing closing parenthesis");
                }
            } else {
                System.out.println("Error: Missing opening parenthesis");
            }
        }

        return parseAtom();
    }

    private double parseAtom() {
        if (index < tokens.length) {
            if (tokens[index].equals("(")) {
                index++;
                double result = parseAddSub();
                if (index < tokens.length && tokens[index].equals(")")) {
                    index++;
                    return result;
                } else {
                    System.out.println("Error: Missing closing parenthesis");
                }
            } else {
                try {
                    double value = Double.parseDouble(tokens[index]);
                    index++;
                    return value;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Invalid number format");
                }
            }
        }

        System.out.println("Error: Invalid expression");
        return 0;
    }
}

public class Server {
    private Socket socket = null;
    static final Map<String, DoubleUnaryOperator> functions;

    static {
        // Register additional functions
        functions = new HashMap<>();
        functions.put("sqrt", Math::sqrt);
        functions.put("sin", Math::sin);
        functions.put("cos", Math::cos);
        functions.put("tan", Math::tan);
        functions.put("log", Math::log);
        functions.put("fact", Server::factorial);
    }

    public Server(int port) {
        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Server started Running...");
            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            while (true) {
                String input = dis.readUTF();
                if (input.equals("bye"))
                    break;
                System.out.println("Equation Received");
                double result = evaluateExpression(input);

                System.out.println("Sending the Result");
                dos.writeUTF(Double.toString(result));
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    private double evaluateExpression(String expression) {
        try {
            expression = expression.replaceAll("\\s", ""); // Remove all whitespace
            String[] tokens = expression.split("(?=[-+*/^()])|(?<=[-+*/^()])");
            Parser parser = new Parser(tokens);
            return parser.parse();
        } catch (Exception e) {
            System.out.println("Error: Invalid expression");
            return 0;
        }
    }

    private static double factorial(double n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String args[]) {
        Server server = new Server(5000);
    }
}
