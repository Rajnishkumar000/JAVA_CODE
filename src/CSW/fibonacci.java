package CSW;
import java.util.*;
public class fibonacci
{
//    static void fib(int a,int b,int n)
//    {
//        if(a>n)
//            return;
//        System.out.print(a+ " ");
//        fib(b,a+b,n);
//    }
//
//    static void fib(int a,int b,int n,int c)
//    {
//        if(c>=n)
//            return;
//
//        System.out.print(a+ " ");
//        c=c+1;
//        fib(b,a+b,n,c);
//    }


    static void fib(int a,int b,int n,int c,int sum)
    {
        if(c>=n) {
            System.out.println(sum);
            return;
        }

        c=c+1;
        sum+=a;
        fib(b,a+b,n,c,sum);


    }




    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        fib(0,1,n,0,0);


    }
}
