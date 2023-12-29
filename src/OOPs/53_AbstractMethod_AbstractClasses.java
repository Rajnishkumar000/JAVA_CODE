package OOPs;
//Abstract means khyali polaaw
//Abstract method : A Method that is declared without an implementation.
//for example:
// abstract void moveTo(int x, int y);
//in the above example, you have just declared a method but u have not said to do any thing
// "Implementation" this is called Abstract method.
//Abstract class : If a class includes abstract method , then the class itself must be
//declared abstract as in:
//public abstract class PhoneModel{
// abstract void switchof();
// }
//You cannot create an object for an abstract class.
//you must need a concrete "Opposite of abstract" class for implement of abstract class.
abstract class Parent2
{
    public Parent2()
    {
        System.out.println("I am a constructor of Parent2");
    }
    public void sayHello()
    {
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child2 extends Parent2
{
    /*
    agar tum kissi abstract class ko extends kr rahe ho
     toh tumhe yaa toh jiss class se tum extend kr rahe ho
     usse v abstract declare krna hoga nahi toh usske ander uss abstract method ko override jo
    abstract class ke ander.
    */
    @Override
    public void greet()
    {
        System.out.println("Good morning");
    }
    @Override
    public void greet2()
    {
        System.out.println("Good afternoon");
    }
}
    abstract class child3 extends Parent2
{
    public void th()
    {
        System.out.println("I am good");
    }
}
class AbstractMethod_AbstractClasses53
{
    public static void main(String[] args)
    {
    child2 c2 = new child2();
//      You cannot do this "Parent2' is abstract; cannot be instantiated":
//       Parent2 p2 = new Parent2();
//       Similarly:
//       You cannot do this "child3' is abstract; cannot be instantiated":
//         child3 c3 = new child3();
//        We can also assign reference of an abstract class to the object of a concrete
//    subclass.
    }
}
