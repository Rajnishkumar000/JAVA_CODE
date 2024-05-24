package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int partition(int a[],int low,int high)
    {
        int pivot=a[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(a[j]<=pivot)
            {
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,high);
        return i+1;
    }
    public static void QuiCkSort(int a[],int low,int high)
    {
        int p;
        if(low<high)
        {
            p=partition(a,low,high);
            QuiCkSort(a,low,p-1);
            QuiCkSort(a,p+1,high);
        }
    }

    public static void main(String[] args) {
        int arr[]={2,1,3,2,8,0,7,5,6,2,1,-1};
        QuiCkSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
}
