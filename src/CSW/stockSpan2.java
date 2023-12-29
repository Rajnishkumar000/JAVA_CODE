package CSW;
import java.util.*;
public class stockSpan2
{

    public static int[] StockSpanRange(int[] arr) {
        Stack<Integer> stk = new Stack<Integer>();

        int[] SR = new int[arr.length];
        stk.push(0);
        SR[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            while (!stk.isEmpty() && arr[stk.peek()] <= arr[i]) {
                stk.pop();

            }
            SR[i] = (stk.isEmpty()) ? (i + 1) : (i - stk.peek());
            stk.push(i);
        }
        return SR;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 5, 4, 3, 9, 4, 5, 7, 2};
        int size = arr.length;
        int[] value = StockSpanRange(arr);
        System.out.print("StockSpanRange : ");
        for (int val : value)
            System.out.print(" " + val);
    }
}
