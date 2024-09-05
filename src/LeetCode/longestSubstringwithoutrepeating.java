package LeetCode;

import java.util.Scanner;

public class longestSubstringwithoutrepeating {

    public int lengthOfLongestSubstring(String s)
    {
        int n=s.length();
        int index[]=new int[128];
        int ans=0;
        int i,j;

        for(j=0,i=0;j<n;j++)
        {
            i=Math.max(index[s.charAt(j)],i);
            ans=Math.max(ans,j-i+1);
            index[s.charAt(j)]=j+1;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        longestSubstringwithoutrepeating obj=new longestSubstringwithoutrepeating();
        int l=obj.lengthOfLongestSubstring(s);
        System.out.println(l);
    }
}
