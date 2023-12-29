package CSW;
import java.util.*;

public class rotateSearch
{

     static int rotateSearcH(int arr[],int start,int end,int key) {
         if (start < end) {

             int mid = (start + end) / 2;
             if (arr[mid] == key) {
                 return mid;
             }

             if (arr[start] < arr[mid]) {
                 if (key < arr[mid] && arr[start] <= key)
                     return rotateSearcH(arr, start, mid - 1, key);
                 else
                     return rotateSearcH(arr, mid + 1, end, key);
             } else {
                 if (arr[mid] < key && key <= arr[end])
                     return rotateSearcH(arr, mid + 1, end, key);
                 else
                     return rotateSearcH(arr, start, mid - 1, key);

             }
         }
         return -1;
     }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no to search");
        int n=in.nextInt();
        int arr[]={30,40,50,60,10,20};
        int s=rotateSearcH(arr,0,arr.length-1,n);
        if(s==-1)
            System.out.println("Not found");
        else
            System.out.println("element is at index "+s);

    }
}
