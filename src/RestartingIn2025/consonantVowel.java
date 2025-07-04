package RestartingIn2025;

public class consonantVowel {
    public static String countMissingLetters(String input1) {
        String s = input1.toLowerCase();

        boolean[] vowelsPresent = new boolean[5];
        boolean[] consonantsPresent = new boolean[21];

        // Define vowels for easy reference
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {

                boolean isVowel = false;
                for (int j = 0; j < vowels.length; j++) {
                    if (c == vowels[j]) {
                        vowelsPresent[j] = true;
                        isVowel = true;
                        break;
                    }
                }

                if (!isVowel) {
                    int index = getConsonantIndex(c);
                    if (index != -1) {
                        consonantsPresent[index] = true;
                    }
                }
            }
        }

        int missingConsonants = 0;
        for (boolean present : consonantsPresent) {
            if (!present) {
                missingConsonants++;
            }
        }

        int missingVowels = 0;
        for (boolean present : vowelsPresent) {
            if (!present) {
                missingVowels++;
            }
        }
        return missingConsonants + " " + missingVowels;
    }


    private static int getConsonantIndex(char c) {
        String consonants = "bcdfghjklmnpqrstvwxyz";
        return consonants.indexOf(c);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example 1
        String input1 = "a quick brown fox jumps over the lazy dog";
        System.out.println("Example 1 input: " + input1);
        System.out.println("Output: " + countMissingLetters(input1));

        // Example 2
        String input2 = "a quick brown fox jumps over the lazy dog";
        System.out.println("\nExample 2 input: " + input2);
        System.out.println("Output: " + countMissingLetters(input2));
    }
}