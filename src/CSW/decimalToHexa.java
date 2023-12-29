package CSW;

public class decimalToHexa
{
//    static String s="";
//    static void decimalToHexadecimal(int n)
//    {
//        if(n<=0)
//            System.out.println(s);
//        else{
//            if (n%16 > 9)
//                s =  (char)(55 + (n%16))+s;
//
//             else
//                s =  (n % 16) +s;
//
//            decimalToHexadecimal(n / 16);
//        }


    public static void printInt(int number) {
        String s = "0123456789ABCDEF";
        int base = 16;
        int digit =  (number % base);
        number = number / base;
        if (number != 0)
        {
            printInt(number);
        }
        System.out.print(s.charAt(digit)); }




    public static void main(String args[]){
        int n=106;
//        decimalToHexadecimal(n);

        printInt(n);
    }
}
