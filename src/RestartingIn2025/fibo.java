package RestartingIn2025;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int next;
        for(int i=0;i<n;i++)
        {
            System.out.println(a);
            next=a+b;
            a=b;
            b=next;

        }
    }
}
