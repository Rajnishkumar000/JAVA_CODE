package CSW;

import java.util.Arrays;

public class permutation
{
    public static void permutations(String[] arr, int i, int length) {
        if (length == i) {
//          printArray(arr, length);
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int j = i; j < length; j++) {
            swap(arr, i, j);
            permutations(arr, i + 1, length);
            swap(arr, i, j);
        }

        return;
    }
    static String[] swap(String arr[],int i,int j)
    {
        String p=arr[i];
        arr[i]=arr[j];
        arr[j]=p;

        return arr;
    }
//    static void printArray(int []arr,int l)
//    {
//        for(int i=0;i<l;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
    public static void main(String[] args) {
//        int[] arr = new int[3];

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
        String arr[]={"0","1","2"};
        permutations(arr, 0, arr.length);
    }

}
