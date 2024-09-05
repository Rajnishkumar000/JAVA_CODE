package STRIVER;

import java.util.*;

class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        // Sort the array to use the two-pointer technique
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();


        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move left and right pointers to avoid duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4,2};
        List<List<Integer>> l=threeSum(arr);
        System.out.println(l);

    }
}

