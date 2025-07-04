package RestartingIn2025;

import java.util.Scanner;

public class ExtractLargestNo {
    public static int findLargestNumber(String str) {
        int maxNumber = Integer.MIN_VALUE;
        int currentNumber = 0;
        boolean hasNumber = false;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0'); // Build the number
                hasNumber = true;
            } else {
                if (hasNumber) {
                    maxNumber = Math.max(maxNumber, currentNumber);
                    currentNumber = 0; // Reset for next number
                    hasNumber = false;
                }
            }
        }

        // Check the last accumulated number
        if (hasNumber) {
            maxNumber = Math.max(maxNumber, currentNumber);
        }

        return (maxNumber == Integer.MIN_VALUE) ? -1 : maxNumber; // If no number found, return -1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int largestNumber = findLargestNumber(input);

        if (largestNumber == -1) {
            System.out.println("No numbers found in the string.");
        } else {
            System.out.println("Largest number in the string: " + largestNumber);
        }

        sc.close();
    }
}

