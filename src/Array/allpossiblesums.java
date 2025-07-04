package Array;

import java.util.HashSet;
import java.util.Set;

public class allpossiblesums {

    // Function to calculate all possible sums of subsets
    private static void findSubsetSums(int[] arr, int index, int currentSum, Set<Integer> sums) {
        // If we have processed all elements, add the current sum to the result set
        if (index == arr.length) {
            sums.add(currentSum);
            return;
        }

        // Include the current element in the sum
        findSubsetSums(arr, index + 1, currentSum + arr[index], sums);

        // Exclude the current element from the sum
        findSubsetSums(arr, index + 1, currentSum, sums);
    }

    // Driver function to call findSubsetSums and display all possible sums
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};  // Input array
        Set<Integer> possibleSums = new HashSet<>();  // To store unique sums

        // Function to find all possible sums
        findSubsetSums(arr, 0, 0, possibleSums);

        // Print all unique sums
        System.out.println("All possible sums of subsets are:");
        for (int sum : possibleSums) {
            System.out.println(sum);
        }
    }
}
