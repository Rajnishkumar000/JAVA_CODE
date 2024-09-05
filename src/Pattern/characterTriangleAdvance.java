package Pattern;

import java.util.Scanner;

public class characterTriangleAdvance {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }



        for (int i = 0; i < n; i++) {

            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }


    }
}
