package Test;

import java.util.Arrays;

public class indexsubstr
{
    public static void main(String[] args) {
        String s="Flower";


        String p=s.substring(0, s.length() - 1);
        System.out.println(p);

        System.out.println(s.indexOf("Flight"));
        System.out.println(s.indexOf("ower"));
        System.out.println("Fl".indexOf(s));

        String []strs = {"flower","flight","floiowerght"};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        String s1 = strs[0];
        String s2 = strs[strs.length-1];

        System.out.println(s1);
        System.out.println(s2);


    }
}
