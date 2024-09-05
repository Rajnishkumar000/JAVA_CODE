package MyPracticeCode;

public class decimalToBinary
{
    public static void main(String[] args) {


        int c=0;
        String s="";


        for(int a=0;a<10;a++) {
            StringBuilder binary=new StringBuilder();


            while (a > 0) {
                c = a % 2;
                binary.append(c);
                a = a / 2;
            }
            System.out.println(binary.reverse());


        }
    }
}
