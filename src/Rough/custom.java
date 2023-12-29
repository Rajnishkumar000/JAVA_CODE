package Rough;
import java.util.*;


class ex extends Exception {
    String s;

    public ex(String s) {
        super(s);
    }


        public String toString()
        {
        return super.toString()+" I am to String";
        }
}
    public class custom {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the no");
            int n = in.nextInt();
            int b = 4;
            if (b < n) {
                try {
//                    throw new ArithmeticException();
                throw new ex("chup");
                }
                catch (Exception e) {
                    System.out.println(e);
//                    System.out.println(e.toString());
                    System.out.println(e.getMessage());
//                System.out.println(e);
//                System.out.println(e.toString());
//                e.printStackTrace();
                }
            }

        }
    }

