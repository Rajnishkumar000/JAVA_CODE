package MultiThreadingConcept;


import java.util.HashSet;
import java.util.Set;
//
//class A extends Thread
//{
//    @Override
//    public void run()
//    {
//            while (true) System.out.println("Raj");
//    }
//}
//class B extends Thread
//{
//    @Override
//    public void run()
//    {
//        while (true) System.out.println("Nishhhhhhhhh");
//    }
//}
class ABC{
    public void anagrams(String str,String ans,Set<String> res)
    {
        if (str.length() == 0) {
            res.add(ans);
            return;
        }
        for(int i=0;i<str.length();i++) {
            char ch= str.charAt(i);
           String s=str.substring(0,i)+str.substring(i+1);
           anagrams(s,ans+ch,res);

        }

    }
}

public class RunningThread {
    public static void main(String[] args) {
        Set<String> anagrams = new HashSet<>();
//        A a = new A();
//        Thread t = new Thread(a);
//        B b = new B();
//
//        Thread t1 = new Thread(b);
//
//        t1.start();
//        t.start();
    ABC obj=new ABC();
    obj.anagrams("RAJ","",anagrams);
    for (String anagram : anagrams) {
            System.out.println(anagram);
        }

    }
}
