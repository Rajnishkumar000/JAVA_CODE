package CSW;
import java.util.*;
public class sorting
{

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    static int partition(int arr[],int start ,int end){

        int pivot=start;

        int p=arr[pivot];
        do{
             do{
                start++;
            }while(arr[start]<=p);

             do{
                end--;
            }while(arr[end]>p);

            if(start<end)
                swap(arr,start,end);

        }while(start<end);
        swap(arr,end,pivot);

        return end ;

    }
    static void qsort(int arr[],int start , int end) {
        if (start < end) {
            int x = partition(arr, start, end+1);
            qsort(arr, start, x - 1);
            qsort(arr, x + 1, end);
        }

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        int arr[]={4,3,8,1,7,1000};
//        int arr[]={19,20,5,6,4,1};
//        int arr[]={5,99,70,2,3,2,1};
//        int arr[]={100,1009,18,-2,0,9,1,-18,12,99,2000,-1000,50,88,200,-68,70,420,120,-80,0,10000};
        System.out.println("Enter the size of array");
        int n=in.nextInt();
        int arr[]=new int[n+1];
        System.out.println("Enter the array elements ");
        for(int i=0;i< arr.length-1;i++)
        {
           arr[i]=in.nextInt();
        }
        arr[arr.length-1]=2147483647;



        qsort(arr,0,arr.length-1);


        for(int i=0;i< arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
