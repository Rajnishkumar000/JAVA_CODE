package RestartingIn2025;


import java.util.*;

public class inputScannerHasNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userInputList = new ArrayList<>();
        System.out.println("Enter integers (type 'done' to finish):");

        while (true) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                userInputList.add(input);
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
                }
            }
        }


        System.out.println("You entered:");
        for (int item : userInputList) {
            System.out.println(item);
        }
    }
}



