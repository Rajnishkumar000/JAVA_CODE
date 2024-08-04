package HACKERRANKandLEETCODE;

import java.util.Scanner;
import java.util.Stack;

public class matchingparanthesis {
    public static boolean isParenthesisBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray())//without character array also it can be done by iterating through the string
//            and using str.charAt() to get ch
             {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(isParenthesisBalanced(s));
    }
}
