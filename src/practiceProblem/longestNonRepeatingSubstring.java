package practiceProblem;

import java.util.Scanner;

public class longestNonRepeatingSubstring {


    public static Boolean areDistinct(String str, int i, int j) {

        boolean[] visited = new boolean[127];

        for (int k = i; k <= j; k++) {
            if (visited[str.charAt(k) - ' '])
                return false;

            visited[str.charAt(k) - ' '] = true;
        }
        return true;
    }

    public static int lengthOfLongestSubstring(String str) {
        int l = str.length();

        // Result
        int max = 0;


        for (int i = 0; i < l; i++)
            for (int j = i; j < l; j++)
                if (areDistinct(str, i, j))
                    max = Math.max(max, j - i + 1);

        return max;

    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("The input string is " + str);

        int len = lengthOfLongestSubstring(str);

        System.out.println("The length of the longest " +
                "non-repeating character " +
                "substring is " + len);
    }
}

