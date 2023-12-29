package hackerrank;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();

        int n=in.nextInt();
        in.nextLine();
        String str[]=new String[n];
        int c=0;

        for(int i=0;i<n;i++){
            str[i]=in.nextLine();
        }
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length;j++){
                if(i!=j){
                    if(str[i].equals(str[j])){
                        c=1;
                        break;
                    }


                }
            }
        }
        if(c==1)
            System.out.print("Wow!");
        else
            System.out.print("LoL!");

    }
}