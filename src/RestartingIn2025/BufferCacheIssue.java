package RestartingIn2025;

import java.util.Scanner;

public class BufferCacheIssue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num1 = scanner.nextInt();  // Reads an integer, but leaves \n in buffer

        System.out.print("Enter your name: ");
        String name1 = scanner.nextLine();  // Reads leftover \n instead of waiting for input

        System.out.println("You entered: " + num1 + " and " + name1);
        System.out.println("Nothing");







        System.out.print("Enter an integer: ");
        int num2 = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        System.out.print("Enter your name: ");
        String name2 = scanner.nextLine(); // Now correctly waits for input
        System.out.println("You entered: " + num2 + " and " + name2);






        System.out.print("Enter an integer: ");
        int num3 = Integer.parseInt(scanner.nextLine()); // Read full line and parse

        System.out.print("Enter your name: ");
        String name3= scanner.nextLine(); // Works fine
        System.out.println("You entered: " + num3 + " and " + name3);





        scanner.close();
    }
}
