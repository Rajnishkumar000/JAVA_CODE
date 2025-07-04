package RestartingIn2025;

import java.util.Scanner;
import java.util.*;
import java.util.Scanner;

public class longestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Longest word: " + findLongestWord(sentence));

    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // Split sentence into words
        System.out.println(Arrays.toString(words));

        String longestWord = "";
        int c=0;

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
            c+=1;
        }
        System.out.println(c);
        return longestWord;
    }
}

