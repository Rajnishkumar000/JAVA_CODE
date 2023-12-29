package DSA;
import java.util.*;
public class multipleMatchingP {
     static int top = -1;
    char []stack;
    void initialise(int l)
    {
        this.stack=new char[l];
    }



    static boolean isEmpty(char arr[])
    {
        if (top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isFull( char arr[])
    {
        if (top == arr.length - 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void push(char val) {
        if (isFull(stack)) {
            System.out.println("Stack Overflow! Cannot push " + val + " to the stack\n");
        } else {
            top++;

            stack[top] = val;
        }
    }

     static char pop(char stack[])
    {
        char d=' ';
        if (isEmpty(stack))
        {
            System.out.println("Stack Underflow! Cannot pop from the stack");

        }
        else
        {
            d=stack[top];
            top--;
        }

        return d;
    }


    static boolean match(char a, char b){
        if(a=='{' && b=='}'){
        return true;
        }
        if(a=='(' && b==')'){
        return true;
        }
       if(a=='[' && b==']'){
       return true;
       }
        return false;
        }

    void matchingParan(char arr[]) {
        char popped_ch;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[')
            {
                push(arr[i]);

            }
            else if(arr[i] == ')' || arr[i] == '}' || arr[i] == ']' )
            {
                if (isEmpty(stack))
                {
                    top='r';
                    return;
                }

                popped_ch = pop(stack);
                System.out.println(popped_ch+"--->"+arr[i]);
                if(!match(popped_ch, arr[i]))
                    top='r';
                    return;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the length of arrray ");
        int l=in.nextInt();
        char []arr=new char[l];
        multipleMatchingP obj=new multipleMatchingP();

        obj.initialise(l);

        System.out.println("Enter the elements of array ");
        for(int i=0;i<l;i++)
        {
            arr[i]=in.next().charAt(0);
        }

        obj.matchingParan(arr);
        if (top == -1)
            System.out.println("paranthesis Matched");
        else
            System.out.println("paranthesis does not matched");
     }
}



