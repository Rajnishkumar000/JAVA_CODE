package LogicalBasedArrayProblelms;
import java.util.*;
public class maxminIn1space
{
    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int[] maxminInConsSpace(int arr[])
    {
        int n= arr.length-1;
        int c=0;
        for(int i=0;i<n/2;i++)
        {

            swap(arr,c,n-i);
            c=c+1;
            swap(arr,c,n);
            c++;


        }
        swap(arr,n,n-1);

        return arr;
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7};
        int arr1[]=maxminInConsSpace(arr);
        System.out.println(Arrays.toString(arr1));

    }
}
