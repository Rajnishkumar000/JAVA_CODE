package Recursion;

import java.util.Arrays;

public class numberPermutation
{
    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void permutation(int[] arr, int i, int length) {
        if (length == i) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int j = i; j < length; j++) {
            swap(arr, i, j);
            permutation(arr, i + 1, length);
            swap(arr, i, j);
        }
        return;
    }
    public static void main(String[] args) {
        int[] arr={1,2};
        permutation(arr, 0, arr.length);
    }

}
