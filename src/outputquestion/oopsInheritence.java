package outputquestion;

public class oopsInheritence {
    public static void main(String[] args) {
        A a=new C();
        B b=(B)a;
        b.display();

    }
}

class A
{
    void display()
    {
        System.out.println("Display function in A");
    }
}
class B extends A
{
    void display()
    {
        System.out.println("Display functin in B");
    }
}
class C extends A{
    void display()
    {
        System.out.println("Display function in C");
    }
}

