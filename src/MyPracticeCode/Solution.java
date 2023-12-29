package MyPracticeCode;
class Solution {
    public static int lengthOfLongestSubstring(String s) {


        char c,c1;

        int l=s.length();
        char ch=s.charAt(l-1);

        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                c=s.charAt(i);
                c1=s.charAt(j);
                if(c==c1)
                {
                     s = s.substring(0, j ) + s.substring(j+1, s.length());
                    j=j-1;
                }


            }

        }
        System.out.println(s);
        return s.length();
    }

    public static void main(String[] args) {
        String s="abcabcbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbdefgbbbbbbbbbbbbbbbbbbbdrfgbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
        int k=lengthOfLongestSubstring(s);
        System.out.println(k);

    }
}