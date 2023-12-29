package LeetCode;
import java.util.*;



public class longestCommonPre
{
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return prefix;
                }
            }
            prefix += c;
        }

        return prefix;
    }



    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s[]={"avc","avc","avcgg","av"};
        System.out.println(longestCommonPrefix(s));

    }
}
