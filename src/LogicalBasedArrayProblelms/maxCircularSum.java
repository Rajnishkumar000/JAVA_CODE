package LogicalBasedArrayProblelms;

public class maxCircularSum
{

    public static int circularSum(int []arr) {
        int n = arr.length;
        int sum = 0,max;
        int currsum=0;
        for (int i = 0; i < n; i++) {
            currsum = currsum + (arr[i] * (i+1));
            sum=sum+arr[i];
        }
        max=currsum;
        for (int i = 1; i < n; i++) {
           currsum=(currsum+sum)-(arr[n-i]*n);

           if(max<currsum)
               max=currsum;
        }

       return max;
    }
    public static void main(String[] args)
    {
        int[] arr = {5,7,8};
        System.out.println(circularSum(arr));


    }
}
