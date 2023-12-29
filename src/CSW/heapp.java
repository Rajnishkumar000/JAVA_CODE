package CSW;

import java.util.Arrays;

public class heapp
{
   static int len;

    static void swap(int arr[],int i,int j )
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }







    static void heapify(int[] arr,int i,int len){
        int min=i;
        int l=i*2+1;
        int r=l+1;

        if(l<len && arr[min]>arr[l])
            min=l;

        if(r<len && arr[min]>arr[r])
            min=r;

        if(min!=i){
            swap(arr,min,i);
            heapify(arr,min,len);
        }


    }


    static void buildHeap(int arr[]){
         len=arr.length;
        for(int i=(len/2)-1;i>=0;i--)
        {
            heapify(arr,i,len);

        }

    }

    static void heapSort(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[0]+" ");
                swap(arr,0,len-1);
                len=len-1;
                heapify(arr,0,len);
            }
    }

    public static void main(String args[])
    {

//            int arr[]={4,3,6,9,11,0,2,-2,23,1000,-244,64,6,12,11,34,-400,-500,8,-64,-300,-1000};
        int arr[]={5,1,-3,0,-2};
            buildHeap(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println();
            heapSort(arr);





    }





}
