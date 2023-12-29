package OOPs;

class Abc
{
    public int a;
    public int harry()
    {
        return 4;
    }
    public void meth2()
    {
        System.out.println("I am method 2 of class A");
    }
}

class gkg extends Abc
{

    public void meth2()
    {
        System.out.println("I am method 2 of class B");
    }
    public void meth3()
    {
        System.out.println("I am method 3 of class B");
    }
}
 public class cwh_48_overriding
{
    public static  void main(String args[])
    {
        gkg b = new gkg();
        b.meth2();

    }
}



