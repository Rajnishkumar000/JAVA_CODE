package SocketProgramming;

import java.io.*;
import java.net.Socket;

public class Client
{
    private static DataInputStream in;
    private static DataOutputStream out;
    private static BufferedReader reader;
    private static Socket socket;
    private   Client(String iP, int port) throws IOException {
        socket = new Socket(iP,port);
        if(socket.isConnected())
        {
            System.out.println("Connected");

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            reader = new BufferedReader(new InputStreamReader(System.in));


        }
    }
    private static void read()
    {
        String received = "";

        while(!received.equalsIgnoreCase("bye") && !socket.isClosed()) {
            try {
                received = in.readUTF();
                System.out.println("\nServer: " + received);

            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

        }
        try{

            socket.close();
            in.close();
            out.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
    private static void write()
    {

        try {
            String sent = "";
            System.out.print("Me: ");
            sent = reader.readLine();
            out.writeUTF(sent);
            if(sent.equalsIgnoreCase("bye"))
            {
                socket.close();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static void startchat()
    {
        new Thread(new Runnable() {
            @Override
            public void run() {

                while (!socket.isClosed()) {
                  read();

                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {

                while (!socket.isClosed()) {
                    write();

                }
            }
        }).start();
    }




    public static void main(String[] args) throws IOException{
        Client aditya = new Client("127.0.0.1",9850);
        startchat();
    }
}
