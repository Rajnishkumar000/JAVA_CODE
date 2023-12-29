package hackerRank2;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int m=ob.nextInt();
        int n=1, t=1;
        while(count(t)<=m){
            n++;
            t+=n;
        }
        System.out.println(t);
    }
    public static int count(int n){
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count+=2;
                if(i*i==n){
                    count--;
                }
            }
        }
        return count;
    }

}
