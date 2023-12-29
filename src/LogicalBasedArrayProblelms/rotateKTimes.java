package LogicalBasedArrayProblelms;
import java.util.*;

public class rotateKTimes
{
    static void  reverseHalf(int arr[],int s,int e)
    {
        int i=s,j=e,temp;
        while(i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }

    }
   static void rotateArray(int arr[],int n,int k)
    {
        reverseHalf(arr,0,k-1);
        System.out.println(Arrays.toString(arr));
        reverseHalf(arr,k,n-1);
        System.out.println(Arrays.toString(arr));
        reverseHalf(arr,0,n-1);


    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("How many times You want to rotate");
        int k= in.nextInt();
        rotateArray(arr,n,k);
        System.out.println(Arrays.toString(arr));

    }
}
