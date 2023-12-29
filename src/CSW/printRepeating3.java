package CSW;
import java.util.*;
class printRepeating3 {
    public static void printRepeating(int[] arr, int size) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int i;
        System.out.print("Repeating elements are");
        for (i = 0; i < size; i++) {
            if (hs.contains(arr[i])) {
                System.out.print(" " + arr[i]);
            } else {
                hs.add(arr[i]);
            }
        }
    }

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int []arr={1,5,2,6,8,4,2,2};
        printRepeating(arr,arr.length);
    }

}



