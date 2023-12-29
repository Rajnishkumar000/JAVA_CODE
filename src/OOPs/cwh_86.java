package OOPs;//import java.util.Scanner;
//
//class prob_03 {
//    public static void main(String[] args) throws MaxRetry {
//        int marks[] = new int[5];
//        marks[0] = 28;
//        marks[1] = 85;
//        marks[2] = 98;
//        marks[3] = 18;
//        marks[4] = 82;
//        Scanner sc = new Scanner(System.in);
//        boolean flag = true;
//        int i = 0;
//        while (flag && i < 5) {
//            System.out.print("Enter index: ");
//            int ind = sc.nextInt();
//            try {
//                System.out.println("Value at index is: " + marks[ind]);
//                flag = false;
//            } catch (Exception e) {
//                System.out.println("Error");
//                i++;
//            }
//        }
//        if (i >= 5) {
//            try {
//                throw new MaxRetry();
//            } finally {
//                System.out.println("Thanks For Using The Program!");
//
//            }
//        }
//
//    }
//}
//
//class MaxRetry extends Exception{
//    public String getMessage(){
//        return "Error";
//    }
//}
//
//
//
//
//
//
//
//        PROBLEM 5
//
//
//        import java.util.Scanner;
//class MaxRetriesException extends Exception{
//    @Override
//    public String toString() {
//        return "Max attempts reached";
//    }
//
//    @Override
//    public String getMessage() {
//        return "Max attempts reached";
//    }
//}
//public class cwh_86_excerise {
//    public static int error(int a) throws MaxRetriesException{
//        if(a<=5){
//            throw new MaxRetriesException();
//        }
//        return a;
//
//    }
//    public static void main(String[] args) {
//        int [] a = new int[3];
//        a[0] = 10;
//        a[1] = 20;
//        a[2] = 30;
//        boolean flag = true;
//        Scanner sc = new Scanner(System.in);
//        int ind;
//        int i = 0;
//        while(flag && i<5){
//            try {
//                System.out.print("Enter value : ");
//                ind = sc.nextInt();
//                System.out.println("The value of choosen index is : " + a[ind]);
//                flag = false;
//            }
//            catch (Exception e){
//                System.out.println("Invalid Index.");
//                i++;
//            }
//
//        }
//        try {
//            error(i);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//    }
//}