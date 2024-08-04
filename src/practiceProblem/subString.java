package practiceProblem;
import java.util.*;
public class subString
{
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("The input.txt string is " + str);

        int len = lengthOfLongestSubstring(str);

        System.out.println("The length of the longest " +
                "non-repeating character " +
                "substring is " + len);
    }

}
