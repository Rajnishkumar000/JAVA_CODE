package Recursion;

public class decimalToHexaStoringInString
{
    static String str="";
    public static String conversion(int n)
    {
        String s= "0123456789ABCDEF";
        if(n<16) {
           str=s.charAt(n)+str;
            return str;
        }
        return conversion(n/16)+s.charAt(n%16);

    }

    public static void main(String[] args)
    {
       String s= conversion(7231);
        System.out.println(s);
    }
}

