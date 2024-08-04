package HACKERRANKandLEETCODE;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inputStreamtakingINPUT {
    public static void main(String[] args) throws IOException//THis is needed or try catch
     {
//        Scanner in=new Scanner(System.in);
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        try {
            int x = Integer.parseInt(in.readLine());
            System.out.println(x);
        }
        catch(Exception e)
        {
            System.out.println("Error hai code me");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

    }
}
