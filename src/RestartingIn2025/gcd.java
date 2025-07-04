package RestartingIn2025;

import java.util.Scanner;

public class gcd
{
    public static int find(int a,int b)
    {
        int c;
        while(a!=0)
        {
            c=a;
            a=b%a;
            b=c;
        }
        return b;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(find(a,b));

    }
}
