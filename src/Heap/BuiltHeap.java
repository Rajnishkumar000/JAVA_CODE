package Heap;
import java.util.*;
public class BuiltHeap
{
    public static void maxHeapIfy(int[] a,int i)
    {
        int largest = i,l,r;
        l = (2*i)+1;
        r = (2*i)+2;
        if(l<a.length && a[l]>a[largest])
        {
            largest = l;
        }
        if(r<a.length && a[r]>a[largest])
        {
            largest = r;
        }


        if(largest!=i)
        {
            a[i]^=a[largest];
            a[largest]^=a[i];
            a[i]^=a[largest];
            maxHeapIfy(a,largest);
        }
    }
    public static void buildHeap(int[] a)
    {
        for(int i = (a.length/2)-1; i>=0; i--)
        {
            maxHeapIfy(a,i);
        }

    }
    public static void main (String[] args)
    {

//        int[]a={12,2,34,5,21,1,90,4,3};
//        int[]a={12,2,34,5,21,1,90,6,7,8,9,3,30,100,120};
        int a[]={1,14,10,8,7,9,3,2,4,16};
        buildHeap(a);
        System.out.println(Arrays.toString(a));
    }
}
