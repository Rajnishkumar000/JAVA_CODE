package Pattern;

import java.util.Scanner;

public class crown {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=9;
        int m=2*n-2;
        int l=m;


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<m;j++)
            {
                System.out.print(" ");
            }


            for(int j=0;j<(i+1)*2-1;j++)
            {
                System.out.print("*");
            }
            m=m-2;

            for(int j=0;j<l;j++)
            {
                System.out.print(" ");
            }
            l=l-2;

            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }









            System.out.println();

        }


    }
}
