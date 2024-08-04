package HACKERRANKandLEETCODE;
import java.util.*;

public class amcat {
    public static void main(String[] args) {
        String textInput = "cat batman latt matter cat matter cat";

        System.out.println(Arrays.toString(findRepeatedWords(textInput)));
    }

    public static String[] findRepeatedWords(String textInput) {
        textInput = textInput.toLowerCase();

        String[] words = textInput.split("\\s+");

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

        Collections.sort(repeatedWords);

        // Convert the list to an array
        if (repeatedWords.isEmpty()) {
            return new String[] {"NA"};
        } else {
            return repeatedWords.toArray(new String[0]);
        }
    }
}
