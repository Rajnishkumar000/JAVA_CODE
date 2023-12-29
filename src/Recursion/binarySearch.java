package Recursion;
import java.util.*;
public class binarySearch
{
    public static int BS(int arr[],int n,int l,int r)
    {
        int mid=(l+r)/2;
        if(l<=r)
        {
            if(arr[mid]==n)
            {
                return mid;
            }
            else if(arr[mid]<n)
            {
                return BS(arr,n,mid+1,r);
            }
            else {
                return BS(arr,n,l,mid-1);
            }

        }

return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println(BS(arr,9,0,arr.length-1));

    }
}
