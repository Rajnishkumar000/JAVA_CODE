package Recursion;
import java.util.*;
public class string_permutation
{
    public static String swapstring(String str, int i, int j)
    {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public static void permuteString(String str,int left,int right)
    {
        if(left==right)
        {
            System.out.println(str);
        }
        else {
            for (int i = left; i < right; i++) {
                str=swapstring(str, left, i);
                permuteString(str, left + 1, right);
                str=swapstring(str, left, i);

            }
        }

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a String");
        String str="ABC";
        permuteString(str, 0,str.length());
    }
}
