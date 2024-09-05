package superKeyword;
class car
{
    car()
    {
        System.out.println("This is car class constructor");
    }
    void dis()
    {
        System.out.println("Display method in parent");
    }
}
class lambo extends car
{

   lambo()
   {
       super.dis();
       System.out.println("This is lambo class constructor");
   }
    void dis()
    {

        System.out.println("Display method in child");
    }


}
public class constructoroverloadingroverriding
{
    public static void main(String[] args) {
        lambo l=new lambo();
        l.dis();
        System.out.println();

        car c=new car();
        c.dis();


    }
}
