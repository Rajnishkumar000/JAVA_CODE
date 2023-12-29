package OOPs;
//Why Interface when there is Abstract class:

//In Abstract class: As u know we can implement method of Abstract class by using
//extends keyword. But keep remember that we can extends only one parent class by a child means
//we cannot make one child inherited by many parents. It means we cannot implement more
// than one abstract class by a single class.

//And also keep remember that we need to declare methods of abstract classes as abstract.

//In Interface: As u know we can implement a method of interface by using implement keyword.
//But keep remember that we can implement more than one interface by using a single class,
//and also with that u can extends a class by that single class.
//for example:
// class A extends B implement C{}

// here keep remember that we not need to declare methods of interfaces as abstract.

interface Bicycle1
{
    int a=45; // when u declare a variable in interface then it automatically take
    // as a final ,it means u cannot modify it later.

    //In interfaces methods are bu default public:
void applyBracke(int decrement);
void speedUp(int increment);
}
interface Horn
{
    void blowhornCar();
    void blowhornBike();
}
class AvonCycle1 implements Bicycle1, Horn
{
    //Whenever u implement a method of interface class than it need to make it public:
   public void applyBracke(int decrement)
   {
       System.out.println("Applying Bracke");
   }
   public void speedUp(int increment)
   {
       System.out.println("Applying speedUp");
   }
    public void blowhornCar()
    {
        System.out.println("blow horn of car");
    }
    public void blowhornBike()
    {
        System.out.println("blow horn of Bike");
    }
}
class _AbstractClass_Vs_Interfaces
{
    public static void main(String[] args)
    {
        AvonCycle1 cycle1 = new AvonCycle1();
        cycle1.applyBracke(1);
        System.out.println(cycle1.a);
        //u cannot modify the properties in interfaces as they are final:
        //cycle1.a=90;
        cycle1.blowhornBike();
        cycle1.blowhornCar();
    }
}
