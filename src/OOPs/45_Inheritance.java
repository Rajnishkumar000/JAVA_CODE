package OOPs;
class Base2  //SuperClass or Parent class or base class
{
int x;

    public int getX() {
        return x;
    }

    public void setX(int x)
    {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe()
{
   System.out.println("I am inside base class");
}
}
//SubClass or child class or derived class. it will inherit every property of base class:
class derived  extends Base2
{
public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class Inheritance45
{
    public static void main(String[] args)
    {
        Base2 b = new Base2();
        b.setX(4);
        System.out.println(b.getX());
        //You cannot access derive class's method by base class:
//        b.setY(4);
//        System.out.println(b.getY());

        // But you can access base class's method by derived class bcoz
        // derive class hase inherit base class:
        derived d = new derived();
        d.setX(5);
        System.out.println(d.getX());
        d.setY(6);
       System.out.println(d.getY());
    }
}
