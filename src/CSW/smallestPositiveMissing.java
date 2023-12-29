package CSW;
import java.util.*;
public class smallestPositiveMissing
{
    public static int SmallestPositiveMissingNumber2(int[] arr, int size){
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        for(int i = 0;i< size; i++) {
            hs.put(arr[i], 1);
        }
        System.out.println(hs);
        for(int i=1;i< size+1; i++) {
            if (hs.containsKey(i) == false){

                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,4,3,5,6,2,7,9,10};
       int k= SmallestPositiveMissingNumber2(arr,arr.length);
        System.out.println(k);

    }

}
