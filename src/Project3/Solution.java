import java.util.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String arr[]=new String[n];
        int k=n;
        int c=0;
        while (n > 0)
        {
            String input = in.nextLine();

            Matcher m=p.matcher(input);


            while (m.find())
            {
                input = input.replaceAll(m.group(), m.group(1));
            }
            arr[c]=input;
            c++;

            n=n-1;
        }
        for(int i=0;i<k;i++)
        {
            System.out.println(arr[i]);
        }

    }
}