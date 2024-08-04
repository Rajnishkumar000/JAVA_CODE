package HACKERRANKandLEETCODE;

public class BirthdayChocolate {
    public static int birthdayChocolate(int[] squares, int d, int m) {
        int count = 0;
        int n = squares.length;

        // If the number of squares is less than the birth month, return 0
        if (n < m) {
            return count;
        }

        // Calculate the sum of the first window
        int currentSum = 0;
        for (int i = 0; i < m; i++) {
            currentSum += squares[i];
        }

        // Check the first window
        if (currentSum == d) {
            count++;
        }

        // Slide the window over the rest of the squares
        for (int i = 1; i <= n - m; i++) {
            currentSum = currentSum - squares[i - 1] + squares[i + m - 1];
            if (currentSum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] squares = {1, 2, 1, 3, 2};
        int d = 3;  // Ron's birth day
        int m = 2;  // Ron's birth month

        int result = birthdayChocolate(squares, d, m);
        System.out.println(result);  // Output: 2
    }
}
