package LeetCode;

import java.util.Arrays;

class MergeTwoArrays {

    public static void merge(int[] num1, int m, int[] num2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (num1[i] > num2[j]) {
                num1[k--] = num1[i--];
            } else {
                num1[k--] = num2[j--];
            }
        }

        while (j >= 0) {
            num1[k--] = num2[j--];
        }

        System.out.println(Arrays.toString(num1));
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 0, 0, 0};
        int arr2[] = {2, 5, 6};
        merge(arr1, 3, arr2, 3);
    }
}