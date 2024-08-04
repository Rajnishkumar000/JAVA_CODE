package HACKERRANKandLEETCODE;
import java.io.*;
public class inputStreamTakinginput2 {
    public static void main(String[] args) throws IOException//THis is needed or try catch
    {
//        Scanner in=new Scanner(System.in);
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i=Integer.parseInt(in.readLine());
        String s=in.readLine();
        System.out.println(i);
        System.out.println(s);



        }
    }


