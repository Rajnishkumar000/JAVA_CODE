package Rough;
public class binary {
    public static void main(String[] args) {
        int negativeNumber = -5;

        // Use Integer.toBinaryString() to get the binary representation
        String binaryRepresentation = Integer.toBinaryString(negativeNumber);

        System.out.println("Binary representation of " + negativeNumber + ": " + binaryRepresentation);
    }
}
