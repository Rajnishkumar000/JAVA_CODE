package LogicalBasedArrayProblelms;

public class union2arrayandfinding_k_in_sortedformat
{
    public static void main(String args[])
    {
        int arr1[]={4,8,12,16,19};
        int arr2[]={40,41,42,43,46,80};
        int k=7;
        int a=0,b=0;
        int n=0;
        for(int i=0;i<k;i++)
        {

            if(a< arr1.length && b<arr2.length) {
                if (arr1[a] < arr2[b]) {
                    a++;
                    n = arr1[a - 1];
                } else {
                    b++;
                    n = arr2[b - 1];
                }
            }
            else {
                if(a< arr1.length) {

                        a++;
                        n = arr1[a - 1];
                }
                    if(b<arr2.length)
                    {
                        b++;
                        n = arr2[b - 1];
                    }

            }


            }
        System.out.println(n);
    }
}
