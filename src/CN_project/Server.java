package CN_project;
// A Java program for a Server
import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.Math;

public class Server {
    // initialize socket and input stream
    private Socket socket = null;

    // constructor with port
    public Server(int port)
    {
        try {
            // Making a ServerSocket object
            // for receiving Client Request
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Server started Running...");
            Socket s = ss.accept();

            // dis and dos object for receiving
            // input from client send output to client
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            while (true) {
                String input = dis.readUTF();
                if (input.equals("bye"))
                    break;
                System.out.println("Equation Received");
                double result = 0;

                StringTokenizer st = new StringTokenizer(input);
                double oprnd1 = Double.parseDouble(st.nextToken());
                String operation = st.nextToken();
                double oprnd2 = Double.parseDouble(st.nextToken());

                // Calculator Operation Perform By Server
                if (operation.equals("+")) {
                    result = oprnd1 + oprnd2;
                }
                else if (operation.equals("-")) {
                    result = oprnd1 - oprnd2;
                }
                else if (operation.equals("/")) {
                    result = oprnd1 / oprnd2;
                }
                else if (operation.equals("*")) {
                    result = oprnd1 * oprnd2;
                }
                else if(operation.equals(("^")))
                {
                    result=Math.pow(oprnd1,oprnd2);
                }
                else if(operation.equals("log"))
                {

                    result=Math.log(oprnd1)/Math.log(oprnd2);
                }
                else if(operation.equals("sin"))
                {
                    oprnd1=Math.toRadians(oprnd1);

                    result=Math.sin(oprnd1);
                }



                System.out.println("Sending the Result");
                dos.writeUTF(Double.toString(result));
            }
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void main(String args[])
    {
        // Server Object and set port number 5000
        Server server = new Server(5000);
    }
}
