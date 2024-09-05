package STRIVER;

import java.util.Arrays;

public class zero_one_two_sort
{
    public static void swap(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
    public static void main(String[] args) {
//        int arr[]={0,1,2,1,2,1,0,0,0,2,1};
        int arr[]={0,2};
        int len=arr.length;
        int l=0;
        int r=arr.length-1;
        int j=arr.length-1;
        for(int i=0;i<len;i++)
        {
            if(arr[i]==0)
            {
                swap(arr,i,l);
                l+=1;
            }


        }
        for(int i=r;i>=0;i--)
        {
            if(arr[i]==2)
            {
                swap(arr,i,r);
                r-=1;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
