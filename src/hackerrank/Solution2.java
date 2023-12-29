package hackerrank;

import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int a=1,b=2,sum=1,c=0;
        int x =0;
        while(n>=sum)
        {
            x=sum;
            c=b;
            sum=sum+b;
            b=a+b;
            a=c;

        }
        System.out.println(x);



    }
}