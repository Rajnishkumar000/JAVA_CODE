package Abstract_Class;

abstract class vehicle
{
    abstract void accelerate(int k);
    void clutching(int j)
    {
        System.out.println(j);
    }
}
public class LearnAbstract
{
    public static void main(String[] args) {
        vehicle v=new vehicle(){
            @Override
            void accelerate(int k) {
                System.out.println("HI");
                System.out.println(k);
            }
        };
        v.accelerate(5);
        v.clutching(10);
    }
}
