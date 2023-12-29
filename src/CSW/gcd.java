package CSW;
import java.util.*;
public class gcd
{
    static void gcd(int a,int b,int c,int d){

        if(a%b==0) {
            System.out.println("GCD of "+ c+" and " + d + " is "+b);
            return;
        }
        gcd(b,a%b,c,d);




    }
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        System.out.println("Enter 2 no whose gcd you want to get");
        System.out.print("First no is ");
       int a=in.nextInt();

        System.out.print("Second no is ");
       int b=in.nextInt();

        gcd(Math.max(a,b),Math.min(a,b),Math.max(a,b),Math.min(a,b));

    }
}
