package CSW;

import java.util.Arrays;

public class sort012
{
    static void swap(int arr[],int a ,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String args[])
    {
        int arr[]={1,0,1,2,2,2,1,0,0};
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<end;i++)
        {
            if(arr[i]==0)
            {
                swap(arr,i,start);
                start++;
            }
            else if (arr[i]==2)
            {
                swap(arr,i,end);
                end--;

            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
