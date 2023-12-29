package CSW;

import java.util.*;
public class minheap
{
    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void heapify(int arr[],int parent)
    {


        int left=2*parent +1;
        int right=2*parent +2;
        int max=parent;

        if(arr.length>left&&arr[parent] >arr[left])
        {
            max=left;
        }
        if(arr.length>right&&arr[max]>arr[right])
        {
            max=right;
        }
        if(max!=parent) {
            swap(arr,max,parent);
            heapify(arr,max);
        }

    }

    static void buildHeap(int arr[])
    {
        int l=arr.length;

        for(int i=l/2;i>=0;i--)
        {
            heapify(arr,i);
        }

    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int []arr= {4,7,0,2,5,6,8,1};
        buildHeap(arr);
        System.out.println(Arrays.toString(arr));

    }

}

