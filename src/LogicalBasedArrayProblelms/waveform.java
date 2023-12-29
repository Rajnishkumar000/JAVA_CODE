package LogicalBasedArrayProblelms;
import java.util.*;
public class waveform {
    public static void WaveArray2(int[] arr) {


        int size = arr.length;
        /* Odd elements are lesser then even elements. */
        for (int i = 1; i < size; i += 2) {
            int temp = 0;
            if ((i - 1) >= 0 && arr[i] > arr[i - 1]) {
                temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            if ((i + 1) < size && arr[i] > arr[i + 1]) {

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
