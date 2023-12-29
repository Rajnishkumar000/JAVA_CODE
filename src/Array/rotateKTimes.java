package Array;

import java.util.Arrays;

public class rotateKTimes
{
     rotateKTimes(int arr[],int k)
    {
        int temp=0;
        while (k > 0)
        {
            temp=arr[0];

            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i + 1];
            }


            arr[arr.length-1]=temp;

            k--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[])
    {
        int arr[]={10,20,30,40,50,60};
        rotateKTimes ob=new rotateKTimes(arr,4);
    }
}
