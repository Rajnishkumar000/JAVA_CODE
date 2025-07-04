package RestartingIn2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class typeCasting {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=in.next();
        System.out.println(s);
//        System.out.println((int)(s));
        System.out.println(Integer.parseInt(s)*2);
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        int i=Integer.parseInt(br.readLine());
        System.out.println(i+2);
        String s1=br.readLine();
        System.out.println(s1);

    }
}
