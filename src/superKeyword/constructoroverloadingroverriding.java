package superKeyword;
class car
{
    car(int x)
    {
        System.out.println("This is car class constructor"+x);
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

       //super(); yaha ye cheez chupa hua rahta hai
       super(5);//aisa kar ke override kar sakte hai


       System.out.println("This is lambo class constructor");
       super.dis();//ya kaam karega

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

        car c=new car(6);
        c.dis();
        System.out.println();

        car c1=new lambo();
        c1.dis();



    }
}
