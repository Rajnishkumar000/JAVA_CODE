package CSW;
import java.util.*;
public class sortbyOrder
{
    public static void SortByOrder(int[] arr, int size, int arr2[], int size2) {
        HashMap<Integer, Integer> ht = new HashMap<Integer, Integer>();
        int value;
        for (int i = 0; i < size; i++) {
            if (ht.containsKey(arr[i])) {
                value = ht.get(arr[i]);
                ht.put(arr[i], value + 1);
            } else {
                ht.put(arr[i], 1);
            }
        }
        System.out.println(ht);
        for (int j = 0; j < size2; j++) {
            if (ht.containsKey(arr2[j])) {
                value = ht.get(arr2[j]);
                for (int k = 0; k < value; k++) {
                    System.out.print(arr2[j]+" ");
                }
                ht.remove(arr2[j]);
            }
        }
        for (int i = 0; i < size; i++) {
            if (ht.containsKey(arr[i])) {
                value = ht.get(arr[i]);
                for (int k = 0; k < value; k++) {
                    System.out.print(arr[i]);
                }
                ht.remove(arr[i]);
            }
        }
    }
    // Testing code
    public static void main(String[] args) {
        int arr[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
        int arr2[] = { 2, 1, 8, 3 };
        SortByOrder(arr, arr.length, arr2, arr2.length);
    }

}
