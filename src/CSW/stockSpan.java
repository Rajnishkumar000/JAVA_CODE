package CSW;

public class stockSpan
{
    public static int[] StockSpanRange(int[] arr) {
        int[] SR = new int[arr.length];
        SR[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            SR[i] = 1;
            for (int j = i - 1; (j >= 0) && (arr[i] >= arr[j]); j--) {
                SR[i]++;
            }
        }
        return SR;
    }
    public static void main(String[] args) {
        int[] arr = { 6, 5, 4, 3, 2, 4, 5, 7, 9 };
        int size = arr.length;
        int[] value = StockSpanRange(arr);
        System.out.print("StockSpanRange : ");
        for (int val : value)
            System.out.print(" " + val);
    }

}
