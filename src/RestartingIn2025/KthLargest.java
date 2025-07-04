package RestartingIn2025;
import java.util.PriorityQueue;

class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int k;

    // Constructor
    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();

        for (int num : nums) {
            add(num);
        }
    }

    // Add method
    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > k) {
            minHeap.poll(); // remove the smallest to maintain only k largest
        }
        return minHeap.peek(); // kth largest is the smallest in the heap
    }

    // Main method to simulate the example
    public static void main(String[] args) {
        int k = 3;
        int[] nums = {4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(k, nums);
        System.out.println(kthLargest.minHeap);
        kthLargest.add(3);
        System.out.println(kthLargest.minHeap);
        kthLargest.add(5);
        System.out.println(kthLargest.minHeap);
        kthLargest.add(10);
        System.out.println(kthLargest.minHeap);
        System.out.println("\n\n");

        System.out.println(kthLargest.add(3));  // Output: 4
        System.out.println(kthLargest.add(5));  // Output: 5
        System.out.println(kthLargest.add(10)); // Output: 5
        System.out.println(kthLargest.add(9));  // Output: 8
        System.out.println(kthLargest.add(4));  // Output: 8
        System.out.println(kthLargest.minHeap);
    }
}


