package Recursion;

public class decimalToHexadecimal
{
    public static String conversion(int n)
    {
        String s= "0123456789ABCDEF";
        if(n<16) {
//            System.out.print(s.charAt(n));
            return s.charAt(n)+"";
        }
//        conversion(n/16);
//        System.out.print(s.charAt(n%16));
        return conversion(n/16)+s.charAt(n%16);

    }

    public static void main(String[] args)
    {
       String s=conversion(16);
        System.out.println(s);
    }
}
