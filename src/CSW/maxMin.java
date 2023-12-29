package CSW;

import java.util.Arrays;

public class maxMin
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11};
        int n=arr.length;

        int arr1[]=new int[n];
        int k=0;
        int i;
        for( i=0;i<n-2;i+=2)
        {
            arr1[i]=arr[n-1-k];
            arr1[i+1]=arr[k];
            k++;
        }
        arr1[i]=arr[n-1-k];
        if(n%2==0)
        arr1[i+1]=arr[k];

        System.out.println(Arrays.toString(arr1));
    }
}
