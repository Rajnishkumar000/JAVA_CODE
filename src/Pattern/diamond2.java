package Pattern;

import java.util.Scanner;

public class diamond2
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=in.nextInt();
        int t=n;
        int m=0;

        //UPPER PART HAI YE

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<t;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=m;j++)
            {
                System.out.print("*");
            }
            m=m+2;
            t--;
            System.out.println();
        }

        //LOWER PART HAI YE

        int x=n*2-3;

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<=i+1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<x;j++)
            {
                System.out.print("*");
            }
            x=x-2;
            System.out.println();
        }



    }
}
