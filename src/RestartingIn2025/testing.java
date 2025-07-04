package RestartingIn2025;

import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char c=in.nextLine().charAt(0);
        System.out.println(c);
        System.out.println(c-'0');
        System.out.println('0'+'1');
        System.out.println('0'+2);;;
        String a="Raj";
        String b="Raj";
        String cd=a;
        System.out.println(a.equals(b));
        System.out.println(cd==a);
        System.out.println(cd.equals(a));
        System.out.println(cd==b);
        System.out.println(cd.equals(b));
        System.out.println();
        Object ob1=25;
        Object ob2=30;
        Object ob3=ob1;
        System.out.println(ob1==ob2);
        System.out.println(ob1.equals(ob2));

        System.out.println(ob1==ob3);
        System.out.println(ob1.equals(ob3));
        ob1=30;
        System.out.println(ob1.equals(ob3));
        System.out.println(ob1==ob3);
        System.out.println(ob1==ob2);
        System.out.println(ob2==ob3);
        System.out.println(ob2.equals(ob3));
        System.out.println(ob1+" "+ob2+" "+ob3);
        ob3=ob1;
        System.out.println(ob1+" "+ob2+" "+ob3);

    }
}
