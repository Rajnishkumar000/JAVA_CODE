package LogicalBasedArrayProblelms;

import java.util.Arrays;

public class indexArray {
    public static void indexArray2(int[] arr, int size)
    {
        int temp;
        for (int i = 0; i < size; i++)
        {
            if (arr[i] != -1 && arr[i] != i)
            {
                /* swap arr[i] and arr[arr[i]] */
                temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;

            }
        }
        for (int i = 0; i < size; i++)
        {
            if (arr[i] != -1 && arr[i] != i)
            {
                /* swap arr[i] and arr[arr[i]] */
                temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;

            }
        }
    }

    public static void main(String[] args) {
//        int[] arr = {8, -1, 6, 1, 9, 3, 2, 7, 4, -1};
//          int arr[]= {2, 1, 4, -1,6, 3};
//        int[] arr = {2, -1, 1, 4, -1, 3};
//        int[] arr = {2, 3, 1, 4, -1, 6, 5};
            int []arr={-1, -1, -1, -1, 5, 1};
        int size = arr.length;

        indexArray2(arr, size);
        System.out.println(Arrays.toString(arr));
    }

}
