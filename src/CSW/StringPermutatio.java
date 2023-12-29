package CSW;

import java.util.Arrays;

public class StringPermutatio
{
    static void permut(String arr[],int l,int r){

        if (l == r) {
//          printArray(arr, length);
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i=l ;i<r;i++){
            swap(arr,i,l);
            permut(arr,l+1, r);
            swap(arr,i,l);
        }
    }

    static String[] swap(String arr[],int i,int j)
    {
        String p=arr[i];
        arr[i]=arr[j];
        arr[j]=p;

        return arr;
    }
    public static void main(String[] args) {
        String arr[]={"0","1","2"};
        permut(arr, 0, arr.length);
    }
}
