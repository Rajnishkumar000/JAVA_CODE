package Array;

import java.util.ArrayList;
import java.util.List;

public class targetsum {


    private static void findTargetSumSubsets(int[] arr, int index, int currentSum, int targetSum, List<Integer> currentSubset) {

        if (currentSum == targetSum) {
            System.out.println(currentSubset);
            return;
        }

        if (index == arr.length || currentSum > targetSum) {
            return;
        }

        currentSubset.add(arr[index]);
        findTargetSumSubsets(arr, index + 1, currentSum + arr[index], targetSum, currentSubset);

        // Exclude the current element from the subset and backtrack
        currentSubset.remove(currentSubset.size() - 1);
        findTargetSumSubsets(arr, index + 1, currentSum, targetSum, currentSubset);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int targetSum = 5;  

        System.out.println("Subsets whose sum equals " + targetSum + " are:");
        findTargetSumSubsets(arr, 0, 0, targetSum, new ArrayList<>());
    }
}
