package hackerrank;
import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.print(1+" "+2);
        int a=1,b=2,sum=1,c=0;
        while(n>=b)
        {

            c=b;
            b=a+b;
            a=c;
            System.out.print( " "+b);


        }


    }
}