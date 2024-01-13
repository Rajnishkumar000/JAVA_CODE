package CN_project;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    private Socket s = null;

    private Client(String address, int port) {
        try {
            Scanner sc = new Scanner(System.in);
            s = new Socket(address, port);
            System.out.println("Connected");

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            while (true) {
                System.out.println("Enter the expression:");
                System.out.println("Example: 3 + 5, sqrt(16) + sin(30)");

                String expression = sc.nextLine();

                if (expression.equalsIgnoreCase("Over"))
                    break;

                dos.writeUTF(expression);

                String result = dis.readUTF();
                System.out.println("Result: " + result);
            }
        }
        catch (Exception e) {
            System.out.println("Error in Connection");
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        Client client = new Client("127.0.0.1", 5000);
    }
}
