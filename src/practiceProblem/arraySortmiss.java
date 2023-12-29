package practiceProblem;

public class arraySortmiss
{
    public static void main(String[] args)
    {
        int arr[]={-1,14,4,-1,13,6,0,-1,9,3,2,7,10,-1,-1,8,1};

        int p,n;
        for (int i=0;i<arr.length;i++) {
          if((arr[i]!=-1) && (arr[i]!=i)){
              p=arr[i];
              n=arr[p];
              arr[p]=p;
              arr[i]=n;
          }

        }
        for (int i=0;i<arr.length;i++) {
            if((arr[i]!=-1) && (arr[i]!=i)){
                p=arr[i];
                n=arr[p];
                arr[p]=p;
                arr[i]=n;
            }

        }

        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");

        }

    }
}
