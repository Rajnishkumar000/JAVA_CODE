import java.util.*;
public class arraylistreverse
{
    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        int l = a.size();
        int k = l - 1;
        int x, y, z;
        for (int i = 0; i <= l / 2; i++) {
            x = a.get(i);
            y = a.get(k);

            a.set(i, y);
            a.set(k, x);
            k--;
        }
        return a;
    }

        public static void main(String args[])
        {
            Scanner in = new Scanner(System.in);
            ArrayList<Integer> e=new ArrayList<>();
            e.add(1);
            e.add(2);
            e.add(3);
            e.add(4);

            System.out.println(e);

            System.out.println(reverseArray(e));



        }
    }







