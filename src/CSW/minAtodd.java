package CSW;

import java.util.Arrays;

public class minAtodd
{
    static void swap(int arr[],int i)
    {
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;

    }

    public static void main(String[] args) {
        int arr[]={5,8,10,2,1,6,15};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



        for(int i=0;i< arr.length-1;i=i+2)
        {
            swap(arr,i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
