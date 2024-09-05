package Test;

public class output1 {


        static void abc(int a)
        {
            System.out.println(a);
        }


    public static void main(String[] args) {
        int i=5;

        {
            System.out.println(i);
        };

            abc(7);
        {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
        };



    }
}
