package genee;

import java.util.*;
public class arraylistt {

    public static void main(String[] args) {
        ArrayList <Integer> a=new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(6);
//		a.add(null);cannot filter this

        a.add(4);
        a.add(66);
        System.out.println(a);

        System.out.println(a.size());//size will be according to no of elements inserted
//it allocates dynamic memory allocation

        System.out.println("USING FILTER");

        a.stream().filter(n->n%2==0).forEach(n->System.out.print(n+"  "));
    }

}
