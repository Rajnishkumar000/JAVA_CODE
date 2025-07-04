package RestartingIn2025;

import java.util.Scanner;
import java.util.Arrays;

public class EqualizeThreeNumbers {
    public static int makeEqual(int a, int b, int c) {
        // Sort numbers
        int[] nums = {a, b, c};
        Arrays.sort(nums);

        // Optimal target value = median of three numbers
        int target = nums[1];

        // Compute steps required to reach the target
        int steps = (nums[2] - target) + (target - nums[0]);

        return steps / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.print("Enter three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int result = makeEqual(a, b, c);
            System.out.println("Minimum iterations needed: " + result);
        }

        sc.close();
    }
}