package LeetCode;

import java.util.Arrays;

public class merge2Array
{
    public static void main(String[] args) {
        int arr1[]={1,3,5,7};
        int arr2[]={2,4,6,8};

        int []finalArray=mergeIT(arr1,arr2);
        System.out.println(Arrays.toString(finalArray));
    }

    private static int[] mergeIT(int[] arr1, int[] arr2) {

        int l1=arr1.length;
        int l2=arr2.length;
        int k=0;
        int merged[]=new int[l1+l2];
        int a1=0;
        int a2=0;

        while(a1<l1 && a2<l2)
        {
            if(arr1[a1]>arr2[a2])
            {
                merged[k++]=arr2[a2];
                a2++;
            }
            else {
                merged[k++]=arr1[a1];
                a1++;
            }

        }
        while (a1 < l1)
            merged[k++] = arr1[a1++];
        // Push the remaining elements of arr2
        while (a2 < l2)
            merged[k++] = arr2[a2++];





        return merged;
    }
}
