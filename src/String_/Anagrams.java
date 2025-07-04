package String_;

import java.util.HashSet;
import java.util.Set;

public class Anagrams {


    private static void findAnagrams(String str, String ans, Set<String> resultSet) {
        if (str.length() == 0) {
            resultSet.add(ans);
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            findAnagrams(ros, ans + ch, resultSet);
        }
    }

    public static void main(String[] args) {
        String input = "123";
        Set<String> anagrams = new HashSet<>();



        findAnagrams(input, "", anagrams);

        // Print all unique anagrams
        System.out.println("Anagrams of the string \"" + input + "\" are:");
        for (String anagram : anagrams) {
            System.out.println(anagram);
        }
    }
}

