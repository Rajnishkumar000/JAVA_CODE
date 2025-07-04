package dynamic_programming;
public class RegexMatching {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;  // Empty string matches empty pattern

        // Handle patterns like a*, a*b*, a*b*c* that can match empty string
        for (int j = 2; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);

                if (pc == '.' || pc == sc) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc == '*') {
                    char prev = p.charAt(j - 2);
                    // Zero occurrence of the previous character
                    dp[i][j] = dp[i][j - 2];
                    // One or more occurrences
                    if (prev == '.' || prev == sc) {
                        dp[i][j] |= dp[i - 1][j];
                    }
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        RegexMatching matcher = new RegexMatching();
        System.out.println(matcher.isMatch("aa", "a"));       // false
        System.out.println(matcher.isMatch("aa", "a*"));      // true
        System.out.println(matcher.isMatch("ab", ".*"));      // true
        System.out.println(matcher.isMatch("mississippi", "mis*is*p*."));  // false
    }
}
