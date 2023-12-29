package LogicalBasedArrayProblelms;
import java.util.*;
public class maxminArrary
{
    public static int[] maxmin(int arr[])
    {
        int n=arr.length;
        int d=1;
        int c=0;
        int newarr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                newarr[i]=arr[n-d];
                d++;
            }
            else {
                newarr[i]=arr[c];
                c++;
            }

        }
        return newarr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int a[]=maxmin(arr);
        System.out.println(Arrays.toString(a));


    }
}
