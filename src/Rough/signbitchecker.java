package rough;

public class signbitchecker {
    public static void main(String[] args) {
        int number = -90;

//        if ((number & (1 << 31)) == 0) {
//            System.out.println(number + " is positive.");
//        } else {
//            System.out.println(number + " is negative.");
//        }
        int n=1+(number>>31)-(-number>>31);
        System.out.println(n);
        System.out.println((number & (1 << 31)));
    }
}
