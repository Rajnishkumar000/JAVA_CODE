package MyPracticeCode;

import java.util.Locale;
import java.util.Scanner;
  
public class Anagram {

//    static boolean isAnagram(String a, String b) {
//        // Complete the function
////        int count1[] = new int[200];
////        int count2[] = new int[200];
//         int l1=a.length();
//         int l2=b.length();
//        if(a.length()!=b.length())
//            return false;



//        for(int i=0; i<a.length(); ++i)
//        {
//            System.out.println(count1[a.charAt(i)]++);
//            System.out.println(count2[b.charAt(i)]++);
////            count1[i]=(int)(a.charAt(i));
////            count2[i]=(int)(b.charAt(i));
//
//
////            count1[a.charAt(i)]++;
////            count2[b.charAt(i)]++;
//
//
//        }
//
//
//        // compare two arrays
//        if(java.util.Arrays.equals(count1, count2)){
//            return true;
//        }

   //     return false;
  //  }



     static boolean isAnagram(String a, String b) {
        // Complete the function
        char ch1,ch2;
        int c=0;
        a=a.toLowerCase();
        b=b.toLowerCase();

        char y=0,z=1;
        int l=a.length();
        char[] arr1=new char[l];
        char[] arr2=new char[l];
        if(a.length()!=b.length())
            return false;

        for(int i=0;i<l;i++)
        {
            arr1[i]=a.charAt(i);
            arr2[i]=b.charAt(i);
        }
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    c++;
                    arr1[i]=y;
                    arr2[j]=z;
                    y++;
                    z++;
                    break;
                }
            }
        }
        if(c==l)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

