package OOPs;
import java.util.*;
class Recursion34
{
    static int factorial(int n){
        if(n==0||n==1)
        {
            return 1;
        }
        else{
            return n*(factorial(n-1));
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number");
        int n=in.nextInt();
        System.out.println("The factorial of "+n+" is "+factorial(n));
    }
}
