package LogicalBasedArrayProblelms;

import java.util.Scanner;

public class maxContiniousSum
{

    static int maxSum(int arr[],int n)
    {
        int currsum=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            currsum=currsum+arr[i];

            if(currsum>max)
            {
                max=currsum;
            }


        }

        return max;

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
            int maxSum=maxSum(arr,arr.length);
            System.out.println("Maximum continious element sum is "+ maxSum);
        }
}

