package rough;
import java.util.*;
public class addwithoutArith
{
    public static void main(String[] args) {
        long a=1234567812;
        long b=456789123;
        double x=System.currentTimeMillis();
        int i=0;
        while(i<1000000) {
            double y = Math.log(Math.pow(2, a) * Math.pow(2, b)) / Math.log(2);


            i++;
        }
//        while(i<1000000) {
//           long c=a+b;
//
//            i++;
//        }
//        while(i<1000000)
//        {
//            while(b!=0) {
//                long carry = a & b;
//                a = a ^ b;
//                b=carry <<1;
//
//
//            }
//
//
//            i++;
//        }
        double z = System.currentTimeMillis();
        System.out.println(z-x);

    }
}
