package MyPracticeCode;
import java.util.*;

public class stringQuestion
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string ");
        String s=in.nextLine();
        s=s+" ";
        String []k=new String[s.length()];
        String p="";
        int c=0;
        char ch;

        for (int i=0;i<s.length();i++)
         {
             ch=s.charAt(i);

                 if(ch!=' '&&ch!='.'&&ch!='\''&&ch!='!'&&ch!='?'&&ch!=',')
                     p=p+ch;
                 else
                 {
                     if(p!="") {
                         k[c] = p;
                         c++;
                         p = "";
                     }
                 }
           }
        System.out.println(c);
        for(int i=0;i<c;i++)
        {
            System.out.println(k[i]);

        }

    }

    }

