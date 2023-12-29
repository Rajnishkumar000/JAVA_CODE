package DSA;


import java.util.Scanner;

public class InfixToPostfix
{
    int top=-1;
    char stack[]=new char[10];
    //-------------------------------------------------------------------------------------------------------------------------
    boolean isOperator(char ch){
        if(ch=='+' || ch=='-' ||ch=='*' || ch=='/')
        return true;
        else
        return false;
        }

    //-------------------------------------------------------------------------------------------------------------------------

    void push(char val){

            top++;
            stack[top] = val;
        }

      //-------------------------------------------------------------------------------------------------------------------------

    char pop(){
            char val =stack[top]; ;
            top--;
            return val;
        }

    //-------------------------------------------------------------------------------------------------------------------------
    int precedence(char ch)
      {

        if(ch == '*' || ch=='/')
        return 3;
        else if(ch == '+' || ch=='-')
        return 2;
        else
        return 0;
      }
    boolean isEmpty()
    {
        if (top == 0)
        {
            return true;
        }//xyz/-kd*-
        else
        {
            return false;
        }
    }

      //-------------------------------------------------------------------------------------------------------------------------
         char[] postfixx(String infix)
       {
        int l=infix.length();
           char postfix[]=new char[l] ;
           int a=0,b=0;
        for(int i=0;i<l;i++)
        {
            char ch=infix.charAt(i);
            if(!isOperator(ch))
            {
              postfix[b] = infix.charAt(a);
              b++;
              a++;
            }
          else
       {
        top=0;
        if(precedence(infix.charAt(a))> stack[top]){
        push(infix.charAt(a));
        a++;
        }
        else{
        postfix[b] = pop();
        b++;
        }
        }
        }
        while (!isEmpty())
        {
        postfix[b] = pop();
        b++;
        }
        return postfix;
        }
    //-------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Expression");
        String exp = in.nextLine();
        InfixToPostfix obj=new InfixToPostfix();
        char c[]=new char[exp.length()-1];
         c=obj.postfixx(exp);

       for(int i=0;i<exp.length();i++)
           System.out.print(c[i]);
    }
}





