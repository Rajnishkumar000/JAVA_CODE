package STRIVER;

import java.util.Scanner;
public class targetsumSubArray {
    public static int countSubsets(int[] arr, int n, int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= arr[i]; j--) {
                dp[j] =dp[j]+ dp[j - arr[i]];
            }
        }

        return dp[sum];
    }
    int s;

    public static void main(String[] args) {
        int[] arr = {3,2,1,1};
        int n = arr.length;
        int sum = 3;
        System.out.println("Number of subsets with sum " + sum + " is " + countSubsets(arr, n, sum));
    }
}