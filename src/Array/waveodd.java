package Array;
import java.util.*;
public class waveodd {
    public static void WaveArray2(int[] arr) {
        int size = arr.length;
        int temp;
        /* Odd elements are lesser then even elements. */
        for (int i = 1; i < size; i += 2) {
            if ( arr[i] > arr[i - 1]) {
//              swap(arr, i, i-1);
                temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            if ((i + 1) < size && arr[i] > arr[i + 1]) {
//              swap(arr, i, i+1);
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 3, 4, 5, 6, 4, 2};
        WaveArray2(arr);
        System.out.println(Arrays.toString(arr));
    }
}

