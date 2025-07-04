package Rough;

import java.util.Arrays;
import java.util.List;

public class jyotibmp1 {

        public static int maxSum(int N, int[] A) {
            int maxSum = Integer.MIN_VALUE;

            // Loop through each possible starting index (1 to N)
            for (int start = 1; start <= N; start++) {
                int currentSum = 0;
                int index = start;

                // Calculate the index sum for this starting index
                while (index <= N) {
                    currentSum += A[index - 1]; // Adjusting for 0-based indexing in Java
                    index += start; // Increment index by the starting index
                }

                // Update maxSum if the currentSum is greater
                maxSum = Math.max(maxSum, currentSum);
            }

            return maxSum;
        }

        public static void main(String[] args) {
            // Test case 1
            int N1 = 4;
            int[] A1 = {1, 2, 3, 4};
            System.out.println("Maximum Index Sum for Test Case 1: " + maxSum(N1, A1)); // Output: 10

            // Test case 2
            int N2 = 9;
            int[] A2 = {67, 22, 81, 67, 86, 98, 97, 47, 7};
            System.out.println("Maximum Index Sum for Test Case 2: " + maxSum(N2, A2)); // Output: 572
        }
    }



