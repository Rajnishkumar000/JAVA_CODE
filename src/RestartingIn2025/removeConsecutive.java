package RestartingIn2025;

public class removeConsecutive {
    public static String removeConsecutivePairs(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int len = sb.length();

            if (len > 0 && sb.charAt(len - 1) == ch) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeConsecutivePairs("abba"));
        System.out.println(removeConsecutivePairs("abbacddc"));
        System.out.println(removeConsecutivePairs("bbaabcddcbab"));
    }
}

