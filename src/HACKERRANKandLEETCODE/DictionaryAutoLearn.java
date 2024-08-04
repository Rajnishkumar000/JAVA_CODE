package HACKERRANKandLEETCODE;

import java.util.*;

public class DictionaryAutoLearn {
    public static void main(String[] args) {
        String textInput = "cat batman latt matter cat matter cat";

        // Call the method to find repeated words
        findRepeatedWords(textInput);
    }

    public static void findRepeatedWords(String textInput) {
        // Convert the text to lowercase to make the counting case insensitive
        textInput = textInput.toLowerCase();

        // Split the text into words
        String[] words = textInput.split("\\s+");

        // Use a HashMap to count the occurrences of each word
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // List to store words that appear more than once
        List<String> repeatedWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedWords.add(entry.getKey());
            }
        }

        // Sort the repeated words lexicographically
        Collections.sort(repeatedWords);

        // Print the result
        if (repeatedWords.isEmpty()) {
            System.out.println("NA");
        } else {
            for (String word : repeatedWords) {
                System.out.print(word + " ");
            }
        }
    }
}