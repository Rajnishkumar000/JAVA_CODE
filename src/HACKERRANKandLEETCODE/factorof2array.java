package HACKERRANKandLEETCODE;
import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result1 {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int l1=a.size();
        int l2=b.size();
        int sum=l1+l2;
        int l=Math.max(l1,l2);
        int maxa=a.get(l1-1);
        int maxb=b.get(l2-1);
        int min=Math.min(maxa,maxb);
        int start=0;
        int end=0;
        boolean way=true;
        if(min==maxa)
        {
            start=min;
            end=b.get(0);
            way=false;
        }
        else
        {
            start=min;
            end=a.get(0);


        }
        int x=0;
        System.out.println(start+" "+end+" "+min);
        int p=start;



        for(int i=start;i<=end;i+=p)
        {
            int counter=0;


            for(int j=0;j<l;j++)
            {
                if(!way)
                {
                    if(j<l1 && i%a.get(j)==0)
                    {
                        counter=counter+1;
                    }

                    if(j<l2 && b.get(j)%i==0)
                    {
                        counter=counter+1;
                    }
                }
                else
                {

                    if(j<l1 && a.get(j)%i==0)
                    {
                        counter=counter+1;

                    }

                    if(j<l2 && i%b.get(j)==0)
                    {
                        counter=counter+1;
                    }
                }
            }

            System.out.println(i+" "+counter);

            if(counter==sum)
                x+=1;

        }
        return x;

    }

}



public class factorof2array {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        Vector<Integer> a=new Vector<>();
        Vector<Integer> b=new Vector<>();
        a.add(2);
        a.add(4);
        b.add(16);
        b.add(32);
        b.add(96);

        int total = Result1.getTotalX(a, b);
        System.out.println(total);


    }
}

