package HACKERRANKandLEETCODE;
import java.util.*;
public class paranthesismatching
{
    public static void match(String s)
    {
        int counter=-1;
        int c=0;
        for(int i=1;i<s.length();i++)
        {
            char b=s.charAt(i);
            char prev=s.charAt(i-1);
            if(prev=='{' || prev=='(' || prev=='[')
            {
                c++;
            }

            if(b=='}' || b==')' || b==']')
            {
                if(prev=='(' && b==')') {
                    counter = 0;
                    c--;

                }
                else if(prev=='{' && b=='}') {
                    counter = 0;
                    c--;
                }
                else if(prev=='[' && b==']') {
                    counter = 0;
                    c--;
                }
                else
                    counter=-1;

            }


        }
        if(counter==0 && c==0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.nextLine();
        match(s);

    }
}
