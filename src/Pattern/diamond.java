package Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class diamond {
    public static void main(String[] args) throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter odd the no of rows");
        int n=Integer.parseInt(in.readLine());

        for(int i=n/2;i>0;i--)
        {
            for(int j=0;j<i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=n/2;j>=i;j--)
            {
                System.out.print("*");
            }
            for(int j=n/2-1;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();

        }


        for(int i=0;i<n/2;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=n/2-1;j>i;j--)
            {
                System.out.print("*");
            }
            for(int j=n/2;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }





    }
}
