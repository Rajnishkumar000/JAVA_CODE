package Rough;
import java.util.*;
public class valueofstringfunction
{
    public static void main(String[] args) {
        char ch[]={'A','B','C'};
        String str=String.valueOf(ch);//converts char array or any object to string
        System.out.println(str);

        int arr[]={1,2,3,4,5,0};
        String n=(Arrays.toString(arr));
        System.out.println(n);


        String a=Arrays.toString(arr);
        char ch1[]=a.toCharArray();
        String s=String.valueOf(ch1);
        System.out.println(s);

        int i=1432;
        String nInString=String.valueOf(i);
        System.out.println(nInString);
        System.out.println(nInString.charAt(2));

    }
}
