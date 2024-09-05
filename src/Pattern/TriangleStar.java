package Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleStar {
    public static void main(String[] args) throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter the no of rows");
        int n=Integer.parseInt(in.readLine());

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=-0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
