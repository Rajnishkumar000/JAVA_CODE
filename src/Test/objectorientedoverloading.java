package Test;

class A
{
     A()
    {
        System.out.println("This is class A constructor");
    }
    void display()
    {
        System.out.println("This is class A display method");
    }

}
class B extends A
{
    B()
    {
        super();
        System.out.println("This is class B constructor");
    }
    void display()
    {

        System.out.println("This is class B display method");
    }
}
public class objectorientedoverloading {
    public static void main(String[] args) {
        A a=new A();
        a.display();
        System.out.println();

        B b=new B();
        b.display();
        System.out.println();

        A objbrefa=new B();
        objbrefa.display();



    }
}
