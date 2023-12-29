// Java program for implementation of Heap Sort

 package CSW;
 class heapSort {
    public void sort(int arr[])
    {
        int N = arr.length;

        // Build heap (rearrange array)
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);

        // One by one extract an element from heap
        for (int i = N - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int N, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;


        if (l < N && arr[l] > arr[largest])
            largest = l;

        if (r < N && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int N = arr.length;

        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver's code
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int N = arr.length;

        // Function call
        heapSort ob = new heapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}