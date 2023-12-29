package OOPs;
class A
{
    public int a;
    public int psr()
    {
        return 4;
    }
    public void method2()
    {
        System.out.println("I am method 2 of class A");
    }
    }
    class B extends A //Inheriting B from A.
    {
        //Method overriding is a process by which you can overwrite any method of parent
        //class and can give your own implementation.
        //just like below method2 which i have override:
        //but you cannot override Static , final methods.
        @Override // this is a notation of overriding.
        public void method2()
        {
            System.out.println("I am method 2 of class B");
        }
        public void method3()
        {
            System.out.println("I am method 3 of class B");
        }
    }
class Method_Overriding48
{
    public static void main(String[] args)
    {
    A a = new A();
    a.method2();
    B b =new B();
    b.method2();
    }
}
