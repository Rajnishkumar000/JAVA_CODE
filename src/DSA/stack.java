package DSA;
import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int temp;
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack : "+stack);
        System.out.println("Stack size : "+stack.size());
        System.out.println("Stack pop : "+stack.pop());
        System.out.println("Stack top : "+stack.peek());
        System.out.println("Stack isEmpty : "+stack.isEmpty());
    }
}
