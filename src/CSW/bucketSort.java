package CSW;
import java.util.*;



public class bucketSort
{


    static void bucketsrt(float arr[],int n){


        if(n<0)
            return ;

        Vector<Float> buckets[]=new Vector[n];
        for(int i=0;i<n;i++){
            buckets[i]=new Vector<>();

        }

        for(int i=0;i<n;i++){
            float idx=n*arr[i];
            buckets[(int)idx].add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }

    }

    public static void main(String args[])
    {
        float arr[]={(float) 0.6, 0.75F, (float) 0.78, (float) 0.1, (float) 0.3};
        int n=arr.length;
        bucketsrt(arr,n);

        System.out.println(Arrays.toString(arr));

    }


}
