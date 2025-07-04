package RestartingIn2025;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamVisualization {
    public static void main(String[] args) {
        // Original array
        int[] numbers = {5, 10, 15, 20, 25};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Convert to stream
        IntStream numberStream = Arrays.stream(numbers);
        System.out.println(numberStream);


        // We can't directly print the stream like this:
        // System.out.println("Stream: " + numberStream); // Would print something like "java.util.stream.IntPipeline$Head@..."

        // To see the elements, we need to process them
        System.out.print("Stream elements: ");
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
        System.out.println("\n\n");



        int arr[]=Arrays.stream(numbers).toArray();
        for(int a:arr)
        {
            System.out.print(a);
        }
    }
}