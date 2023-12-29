package LogicalBasedArrayProblelms;

public class smallestPosit
{
    public static int SmallestPositiveMissingNumber4(int[] arr, int size)
    {
        int temp;
        for (int i = 0; i < size; i++)
        {
            while (arr[i] != i + 1 && arr[i] > 0 && arr[i] <= size)
            {
                temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        for (int i = 0; i < size; i++)
        {
            if (arr[i] != i + 1)
                return i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={8, 5, 6, 1, 9, 11, 2, 7, 4, 10};
        int x=SmallestPositiveMissingNumber4(arr,10);
        System.out.println(x);
    }

}
