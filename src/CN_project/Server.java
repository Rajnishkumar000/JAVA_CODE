package CN_project;
import java.io.*;
import java.net.*;
import java.util.HashMap;

import java.util.Map;
import java.util.function.DoubleUnaryOperator;
import static CN_project.Server.functions;

public class Server {
    private Socket s = null;
    public static final Map<String, DoubleUnaryOperator> functions;

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

    private Server(int port) {
        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Server started Running...");
             s = ss.accept();

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

    public static double factorial(double n) {
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
