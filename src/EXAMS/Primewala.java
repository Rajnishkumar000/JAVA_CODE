package EXAMS;

import java.util.Scanner;

public class Primewala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orderValue = scanner.nextInt();
        scanner.close();

        int discountValue = calculateDiscount(orderValue);
        System.out.println(discountValue);
    }

    private static int calculateDiscount(int orderValue) {
        int sum = 0;
        String orderValueStr = String.valueOf(orderValue);

        for (char digitChar : orderValueStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            if (isPrimeDigit(digit)) {
                sum += digit;
            }
        }

        return sum;
    }

    private static boolean isPrimeDigit(int digit) {
        return digit == 2 || digit == 3 || digit == 5 || digit == 7;
    }
}
