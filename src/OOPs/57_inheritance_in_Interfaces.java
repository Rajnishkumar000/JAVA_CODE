package OOPs;
interface camera{
    void takeSnap();
    void record();

    //When u add a new method in Interface then it show error in that classes by which this
    //interface is implemented. This error is saying to implement that new method ,
    //so when there many classes implementing a single interface then u need to update all
    //those classes which are implementing that interface ,this is the reason why java introduced "default"
    //method, by this u can add a new method in that interface and implement there only:
    default void record4kVideo(){
        System.out.println("Recording in 4k");
    }

    //Why we r using private method when this cannot be implemented ?
    //We r using private method because when there large code in default method then
    //u can use private method to write all that code in it. And pass the method to default
    //so that other classes which are implementing this interface can do
    // implementation on this method
    //u cannot directly run this private method.It can only run through default method:
    private void greet()
    {
        System.out.println("Good Morning!");
    }
    default void greet1(){
        greet();
    }
}
interface wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class cellphone{
    void callNumber(int phnNo)
    {
        System.out.println("calling.... "+phnNo);
    }
    void pickCall()
    {
        System.out.println("Connecting....");
    }
}
class SmartPhn extends cellphone implements wifi,camera
{
       public void takeSnap()
    {
        System.out.println("Taking snap");
    }
    public void record()
    {
        System.out.println("Taking snap");
    }
    // if u re-implement that method, then this method will work:
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
}
class _inheritance_in_Interfaces
{
    public static void main(String[] args)
    {
    SmartPhn smrt=new SmartPhn();
    smrt.record4kVideo();
    smrt.greet1();
   String arr[]= smrt.getNetwork();
   for (String item:arr){
       System.out.println(item);
   }
    }
}
