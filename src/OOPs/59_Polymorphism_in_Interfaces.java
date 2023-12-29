package OOPs;
//Polymorphism means you can perform a single action in different ways:
//let understand clearly:
//suppose u have a class with name smartPhone and this class extends another class
//with name cellPhone and also implementing three different interfaces name Gps, camera,
//and MediaPlayer.So know you can say that this smartPhone also a cellPhone and also act
//as Gps, camera and mediaPlayer.It means a single class has different forms.
//This is called Polymorphism.
//let understand by a another example:
//suppose your mother asking u to clean your room,then at that time u are a cleaner,
//and when ur sister asking u to drop school then at that time u r a driver.
//It means u are a single man act as cleaner and driver.This is called polymorphism.
interface camera2{
    void takeSnap();
    void record();
    private void greet()
    {
        System.out.println("Good Morning!");
    }
    default void greet1(){
        greet();
    }
}
interface wifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class cellphone2{
    void callNumber(int phnNo)
    {
        System.out.println("calling.... "+phnNo);
    }
    void pickCall()
    {
        System.out.println("Connecting....");
    }
}
class SmartPhn2 extends cellphone2 implements wifi2,camera2
{
    public void takeSnap()
    {
        System.out.println("Taking snap");
    }
    public void record()
    {
        System.out.println("Taking snap");
    }
    public void record4kVideo(){
        System.out.println("Recording in 4k and Taking Snap");
    }
    public String[] getNetwork()
    {
        System.out.println("Getting list of Network");
        String[]networklist={"Airtel","BSNL","IDEA","JIO"};
        return networklist;
    }
    public void connectToNetwork(String network)
    {
        System.out.println("Connecting to "+network);
    }
    public void sampleMeth()
    {
        System.out.println("Meth");
    }
}
class _Polymorphism_in_Interfaces
{
    public static void main(String[] args)
    {
        //here u r using smartphone as a camera, so u can only use the methods of camera:
        camera2 cam2= new SmartPhn2();
        cam2.takeSnap();
        //cam2.getNetwork(); ---> Not allowed.
        //came2.sampleMeth();  ---> Not allowed.

    }
}
