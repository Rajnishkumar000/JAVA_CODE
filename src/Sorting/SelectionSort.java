package Sorting;

public class SelectionSort {
    public static void sort(int[] arr)// sorted array created from back.
    {
        int size = arr.length;
        int i, j, max, temp;
        for (i = 0; i < size - 1; i++) {
            max = 0;
            for (j = 1; j < size - 1 - i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            temp = arr[size - 1 - i];
            arr[size - 1 - i] = arr[max];
            arr[max] = temp;
        }
    }
    public static void main(String[] args) {
        int[] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
        SelectionSort.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
