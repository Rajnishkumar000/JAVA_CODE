package HACKERRANKandLEETCODE;

public class OutputwrapperClassQuantifi {
    public static void main(String[] args) {
        Integer i = new Integer(257);
        Short y=i.shortValue();
        y=y.reverseBytes(y) ;
        System.out.println(y) ;
//        Short z=256;
//        System.out.println(z.reverseBytes(z));
//        System.out.println(3<<2);
    }
}
