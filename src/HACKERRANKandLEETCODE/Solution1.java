package HACKERRANKandLEETCODE;
import java.util.*;

public class Solution1 {
    static void fib(int n) {
        int sum=0;
        if(n==0)
        {
            System.out.println(n);
            return;
        }

        int f=1, s=2;
        int t=f+s;
        sum=t;
        while(sum<n) {
            f=s;
            s=t;
            t=f+s;
            sum=sum+t;
        }
        int c=((sum-n)>0)?sum-t+3:sum;
        System.out.println(c);

    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        fib(n);
    }
}