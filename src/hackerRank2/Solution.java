package hackerRank2;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();//ye input ye batata hai ki aap kitna baar ye test krna chahte hai by taking the input

        int c=0;
        for(int i=0;i<n;i++){
            int m=ob.nextInt();
            String s[]=new String[m];
            for(int j=0;j<m;j++){
                ob.nextLine();
                s[j]=ob.next();
            }
            for(int k=0;k<m;k++){
                for(int l=k+1;l<m;l++){
                    if(s[k].equalsIgnoreCase(s[l]))
                        c++;
                }
            }
            if(c>0)
                System.out.println("Wow!");
            else
                System.out.println("Lol!");
            c=0;
        }

    }
}