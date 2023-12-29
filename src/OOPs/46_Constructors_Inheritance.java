package OOPs;

class base1
{
    base1()
    {
        System.out.println("I am a constructor of class base");
    }
    base1(int x)
    {
        System.out.println("I am a constructor of class base with value x as :"+x);
    }
}
class Derive extends base1
{
    Derive()
    {
        //if u want to that derive class call the constructor of
        // base class which has parameter then we use super keyword.
        // You might have some question like why we are not calling that constructor
        // by direct passing the value from derive class , so the answer is
        // if we do so  then it will not work because it check the constructor with
        // parameter in derive class for execution not from base class.:
      // super(55);

        System.out.println("I am a constructor of derive class");
    }
    Derive(int x, int y)
    {
       super(x); //super keyword must be a first statement.
        System.out.println("I am a constructor of derive class with value y as : "+y);
    }
}
class childOfDerived extends Derive
{
    int x;
}
//    childOfDerived()
//    {
//        System.out.println("I am a child of derive constructor");
//    }
//    childOfDerived(int x, int y, int z)
//    {
//        super(x,y);
//        System.out.println("I am a child of derive constructor with value z: "+z);
//    }
//}
class Constructors_Inheritance46
{
    public static void main(String[] args)
    {

        //base1 b = new base1();

        //you can access constructors of base class from derive class:
        //The constructor of Base class executed first then Derive class
        //Derive d = new Derive();
       // Derive d = new Derive(45,99);
      childOfDerived chd1 = new childOfDerived();
      //agar "childOfDerived" class me koi constructor nahi v hoga phir v constructor call hoga uske base class ka.
        //in short base class ka class constructor run hoga he hoga.
//        childOfDerived chd = new childOfDerived(23,34,87);
    }
}
