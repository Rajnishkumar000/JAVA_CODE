package MyPracticeCode;
import java.util.*;
//        Given an array A[1..n] that is first decreasing up to some places from 1 to p (value is
//        unknown) and then increasing from (p+1) to n. More precisely, there is a coordinate 1 ≤ p ≤
//        n such that for all i < p, A[i] > A[i + 1], and for all i ≥ p, A[i] < A[i + 1]. Your goal is to find
//        the smallest element in this array. Design an efficient algorithm to find the smallest element
//        in this array that has the same asymptotic running time as Binary search. Explain the
//        operation using a suitable example.
public class Sort1
{

    public static int sort(int []arr,int f,int l) {

        int mid = (f + l) / 2;
        if ((arr[mid] < arr[mid + 1]) && (arr[mid] < arr[mid - 1])) {
            return mid;
        }

            if ((arr[mid] > arr[mid + 1]) && (arr[mid] < arr[mid - 1])) {
                 return sort(arr, mid + 1, l);

            }

        else if ((arr[mid] < arr[mid + 1]) && (arr[mid] > arr[mid - 1])) {
            return sort(arr, l, mid - 1);

        }
        else return -1;
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
//        int arr[]={10,9,8,5,4,12,13,14};
        int arr[]={100,10,9,8,6,5,-3,7,12,13,14,20,21,45};
        int f=0,l=arr.length-1;

        int ans=sort(arr,f,l);
        System.out.println(arr[ans] +" is the smallest element in array");


    }
}
