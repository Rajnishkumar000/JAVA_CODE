package CSW;
class qsort{
    int A[]={2,6,9,4,1};
    static void swap(int A[],int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
 static int Partition(int A[],int l,int h) {
         int pivot = A[l];
         int i=l; int j=h;

         while(i<j) {
        do {
        i++;
        } while(A[i]<=pivot);

        do {
        j--;
        } while(A[j]>pivot);

        if(i<j) {
        swap(A,i,j);
        }
        }

        swap(A,l, j);

        return j;
        }

        // quicksort
         static void QuickSort(int A[],int l,int h) {
        int pi = Partition(A,l, h);
        QuickSort(A,l, pi);
        QuickSort(A,pi+1, h);
        }

    public static void main(String[] args) {
       int A[]={2,6,9,4,1};
        QuickSort(A,0,A.length-1);
    }
}
