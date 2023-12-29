package OOPs;
interface sample
{
    void meth1();
    void meth2();
}
//A class cannot extends interface but an interface can extends another interface
//and also keep remember that an interface cannot implement another interface.
// It can only done by classes:
interface childSample extends sample{
    void meth3();
    void meth4();
}
class mysample implements childSample
{
   public void meth3()
    {
        System.out.println("Meth3");
    }
    public void meth4()
    {
        System.out.println("Meth4");
    }
    //Can also implement meth1 and meth2 as interface childSample has extends interface sample:
    public void meth1()
    {
        System.out.println("Meth1");
    }
    public void meth2()
    {
        System.out.println("Meth2");
    }
}
class _Inheritance_in_Interfaces2
{
   public static void main(String[]args)
   {
    mysample sam = new mysample();
    sam.meth1();
    sam.meth2();
    sam.meth3();
    sam.meth4();
   }
}
