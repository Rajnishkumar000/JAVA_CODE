package SocketProgramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server
{
    private static DataInputStream in;
    private static DataOutputStream out;
    private static BufferedReader reader;
    private static Thread readM,writeM;
    private static Socket socket;
    private static String received="";
    private   Server(int port) throws IOException {
        ServerSocket ss=new ServerSocket(port);
        System.out.println("Connecting...");
        socket=ss.accept();
        if(socket.isConnected())
        {
            System.out.println("Connected");

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            reader = new BufferedReader(new InputStreamReader(System.in));


        }
    }
    private void read()
    {


        while(!received.equalsIgnoreCase("bye") && !socket.isClosed()) {
            try {
                received = in.readUTF();
                System.out.println("\nClient: " + received);


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
    public void write()
    {

        try {
            String sent = "";
            System.out.print("Me: ");
            if(received.equalsIgnoreCase("bye"))
            {

                return;
            }
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
    public void startchat()
    {
      readM = new Thread(new Runnable() {
            @Override
            public void run() {

                while (!socket.isClosed()) {

                    read();


                }
            }
        });
       writeM =  new Thread(new Runnable() {
            @Override
            public void run() {

                while (!socket.isClosed()) {
                    write();

                }
            }
        });

      if(!received.equalsIgnoreCase("bye"))
      {
          readM.start();
          writeM.start();
      }
      else {
          try {
              Thread.sleep(500);
              readM.stop();
              writeM.stop();
              Thread.sleep(500);
          }catch (Exception e)
          {
              System.out.println(e.getMessage());
          }
      }
    }




    public static void main(String[] args) throws IOException{
        Server server = new Server(9850);
        server.startchat();
    }
}
