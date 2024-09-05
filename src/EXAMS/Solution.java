package EXAMS;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the number of days (M) and products (N)
        int days = sc.nextInt();
        int products = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Array to store the maximum revenue for each day
        int[] maxRevenues = new int[days];

        // Reading sales records and calculating maximum revenue for each day
        for (int i = 0; i < days; i++) {
            int maxRevenue = Integer.MIN_VALUE; // Initialize to a very small value
            for (int j = 0; j < products; j++) {
                int revenue = sc.nextInt();
                if (revenue > maxRevenue) {
                    maxRevenue = revenue;
                }
            }
            maxRevenues[i] = maxRevenue;
        }

        // Output the maximum revenue for each day
        for (int i = 0; i < days; i++) {
            System.out.print(maxRevenues[i]);
            if (i < days - 1) {
                System.out.print(" ");
            }
        }
    }
}

