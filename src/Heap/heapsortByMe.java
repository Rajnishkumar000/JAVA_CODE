package Heap;

import java.util.Arrays;

public class heapsortByMe {
    public static void buildHeap(int[] a) {
        for (int i = (a.length / 2) - 1; i >= 0; i--) {
            maxHeapIfy(a, i);
        }

    }

    public static void maxHeapIfy(int[] a, int i) {
        int largest = i, l, r;
        l = (2 * i) + 1;
        r = (2 * i) + 2;
        if (l < a.length && a[l] > a[largest]) {
            largest = l;
        }
        if (r < a.length && a[r] > a[largest]) {
            largest = r;
        }


        if (largest != i) {
            a[i] ^= a[largest];
            a[largest] ^= a[i];
            a[i] ^= a[largest];
            maxHeapIfy(a, largest);
        }
    }
    public static void sort(int a[]){
        buildHeap(a);
        int l=a.length-1;

        for(int i=l;i>=1;i--){


            a[i] ^= a[1];
            a[1] ^= a[i];
            a[i] ^= a[1];

            maxHeapIfy(a,1);




        }

    }

    public static void main(String[] args) {

        int[] a = {12, 2, 34, 5, 21, 1, 90, 4, 3};
//        int[]a={12,2,34,5,21,1,90,6,7,8,9,3,30,100,120};
        sort(a);

        System.out.println(Arrays.toString(a));
    }


}
