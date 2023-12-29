package Sorting;

import java.util.Arrays;

public class insertionSort2
{
    public static int[] sort(int arr[])
    {
        int n= arr.length;
        for(int i=1;i<n;i++)
        {
           int k=i-1;
           int x=arr[i];
            while(  k>=0  && x<arr[k])
            {
                arr[k+1]=arr[k];
                k--;
             }
            arr[k+1]=x;


        }
        return arr;

    }
    public static void main(String[] args)
    {
        int arr[]={7,6,4,3,8,0};
        System.out.println(Arrays.toString(sort(arr)));


    }
}
