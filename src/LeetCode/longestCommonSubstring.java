package LeetCode;
//WRONG HAI BUT LEETCODE ACCEPT KAR RHA
public class longestCommonSubstring
{
        public static String longestCommonPrefix(String[] strs) {
            String substrings=strs[0];

            for(int i=1;i<strs.length;i++)
            {
                while (strs[i].indexOf(substrings) == -1) {
                    substrings = substrings.substring(0, substrings.length() - 1);

                    if (substrings.isEmpty()) {
                        return "";
                    }
                }


            }
            return substrings;

        }

    public static void main(String[] args) {
        String []strs = {"flower","flight","foiowerght"};
        System.out.println(longestCommonPrefix(strs));
    }
}

