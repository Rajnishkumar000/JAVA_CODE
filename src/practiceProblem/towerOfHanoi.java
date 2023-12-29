package practiceProblem;
//// JAVA recursive function to
//// solve tower of hanoi puzzle
//
import java.math.*;
import java.util.*;
class towerOfHanoi {

    static void towerOfHanoi(int n, char A,
                             char C, char B)
    {

        if (n < 1) {
            return;
        }

        towerOfHanoi(n - 1, A, B, C);

        System.out.println(" Move disk " + n + " from rod " + A + " to rod " + C);

        towerOfHanoi(n - 1, B, C, A);
    }

    // Driver code
    public static void main(String args[])
    {
        int N ;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of disk ");
        N=in.nextInt();

        // A, B and C are names of rods
        towerOfHanoi(N, 'A', 'C', 'B');
    }
}




//package practiceProblem;
//import java.math.*;
////import java.util.*;
//class towerOfHanoi {
//    public static void towerOfHanoi(int num, char src, char dst, char temp) {
//        if (num < 1) {
//            return;
//        }
//        towerOfHanoi(num - 1, src, temp, dst);
//        System.out.println("Move " + num + " disk from peg " + src + " to peg " +
//                dst);
//        towerOfHanoi(num - 1, temp, dst, src);
//    }
//
//    public static void main(String[] args) {
//        int num = 3;
//        System.out.println("The sequence of moves are :\n");
//        towerOfHanoi(num, 'A', 'C', 'B');
//    }
//}

