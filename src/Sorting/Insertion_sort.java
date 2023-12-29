package Sorting;
import java.util.*;
public class Insertion_sort
{
    public static void isort(int []arr)
    {
       for(int j=1;j<arr.length;j++)
       {
           int key = arr[j];
           int i=j-1;
           while(i>=0 && key<arr[i])
           {
               arr[i+1]=arr[i];
               i--;
           }
           arr[i+1]=key;
       }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={20, 40, 60, 10, 30, 50};
        isort(arr);
        printarray(arr);


    }
}
