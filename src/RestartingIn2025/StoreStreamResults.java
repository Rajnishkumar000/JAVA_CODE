package RestartingIn2025;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StoreStreamResults {
    public static void main(String[] args) {
        // Original array
        int[] numbers = {5, 10, 15, 20, 25};

        // Method 1: For primitive int arrays - store in another int array

        Object obj = Arrays.stream(numbers);  // autoboxing
        System.out.println(obj.getClass().getName());
        System.out.println("\n\n\n");

        int[] numbersArray = Arrays.stream(numbers).toArray();
        System.out.print("Stored in int array: ");
        for (int n : numbersArray) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Method 2: Convert to List of Integer objects
        List<Integer> numbersList = Arrays.stream(numbers)
                .boxed()  // Convert int to Integer
                .collect(Collectors.toList());
        System.out.print("Stored in List<Integer>: ");
        for (Integer n : numbersList) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Method 3: For specific results (like sum)
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum stored in variable: " + sum);
    }
}