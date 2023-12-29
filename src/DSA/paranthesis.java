//package DSA;
//import java.util.*;
//public class paranthesis {
//    int top = -1;
//    char []stack;
//     void initialise(int l){
//         this.stack=new char[l];
//     }
//
//
//
//    boolean isEmpty(char arr[])
//        {
//        if (top == -1)
//        {
//        return true;
//        }
//        else
//        {
//        return false;
//        }
//        }
//
//        boolean isFull( char arr[])
//        {
//        if (top == arr.length - 1)
//        {
//        return true;
//        }
//        else
//        {
//        return false;
//        }
//        }
//
//    void push( char val) {
//        if (isFull(stack)) {
//            System.out.println("Stack Overflow! Cannot push " + val + " to the stack\n");
//        } else {
//            top++;
////            System.out.println("pushing at "+(top));
//            stack[top] = val;
//        }
//    }
//
//    void pop() {
//        if (isEmpty(stack)) {
//            System.out.println("Stack Underflow! Cannot pop from the stack");
//
//        }
//        else
//        {
//
////            System.out.println("popping paranthesis at " +(top));
//            top--;
//         }
//
//    }
//
//    void matchingParan(char arr[])
//    {
//        for(int i=0;i<arr.length;i++)
//        {
//            if (arr[i]=='('){
//                push('(');
//            }
//             else if (arr[i]==')')
//            {
//                pop();
//
//            }
//
//        }
//        if(top==-1)
//            System.out.println("paranthesis Matched");
//        else
//            System.out.println("paranthesis does not matched");
//
//    }
//
//    public static void main(String args[])
//    {
//        Scanner in =new Scanner(System.in);
//        System.out.println("Enter the length of arrray ");
//        int l=in.nextInt();
//        char []arr=new char[l];
//        paranthesis obj=new paranthesis();
//
//        obj.initialise(l);
//
//        System.out.println("Enter the elements of array ");
//        for(int i=0;i<l;i++)
//        {
//            arr[i]=in.next().charAt(0);
//        }
//        obj.matchingParan(arr);
//
//
// }
//}
//
//
//
