package Rough;


interface calc{
    int sum(int a,int b);
    int sub(int a,int b);
    int multi(int a,int b);
    double div(int a,int b);
    void myName(String name);
}

@FunctionalInterface
interface calc1{
    int multiply(int a, int b);
}
public class p4 {
    public static void main(String args[]) {
//		ANONYMOUS
        calc ob1=new calc() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
            @Override
            public int sub(int a, int b) {
                return a-b;
            }
            @Override
            public int multi(int a, int b) {
                return a*b;
            }
            @Override
            public double div(int a, int b) {
                return a/b;
            }
            @Override
            public void myName(String name) {
                System.out.println(name);
            }
        };
        System.out.println(ob1.sum(2, 6));
        System.out.println(ob1.sub(12, 6));
        System.out.println(ob1.multi(2, 6));
        System.out.println(ob1.div(12, 6));
        ob1.myName("Rajnish");

//		LAMBDA
        calc1 ob2=(a,b)->(a*b);

        calc1 ob3=(int a, int b)->{
            return a+b;
        };
        calc1 ob=(a,b)->{
            return 5*8;
        };






        System.out.println(ob2.multiply(200, 100));

    }

}

//FUNCTONAL INTERFACE IS AN INTERFACE THAT HAS ONLY ONE FUNCTION IN INTERFACE AT A TIME OR ELSE SHOW AN ERROR
