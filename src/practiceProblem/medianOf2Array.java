package practiceProblem;

public class medianOf2Array
{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int n = l1 + l2;
        int arr[] = new int[n];

        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            if (nums1[x] < nums2[y]) {
                arr[i] = nums1[x];
                x++;
            } else if ((nums1[x] > nums2[y])) {
                arr[i] = nums2[y];
                y++;
            } else {
                arr[i] = nums2[y];
                y++;
                x++;
            }
            if (x == l1) {
                int j = i + 1;
                do {
                    arr[j] = nums2[y];
                    y++;
                    j++;
                } while (j <= l2);
                break;


            }

            if (y == l2) {


                int j = i + 1;
                do {
                    arr[j] = nums1[x];
                    x++;
                    j++;
                } while (j <= l1);

                break;
            }
        }
        double median;
        System.out.println(n);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]);
        System.out.println();
        int x1=arr[(n/2)-1];
        int x2=arr[(n/2)];
       ;

        if(n%2==0){

            median=(x1+x2)/2.0;

        }
        else median=arr[(int)n/2];



        return median;

    }
    public static void main(String[] args)
    {
        int[] ar1 ={0,0};
        int[] ar2={0,0};
        System.out.println(findMedianSortedArrays(ar1,ar2)) ;

    }
}
