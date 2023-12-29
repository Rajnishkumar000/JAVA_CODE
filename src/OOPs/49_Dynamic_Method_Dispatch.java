package OOPs;
class Phone
{
    public void Showtime()
    {
        System.out.println("Time is 8 am");
    }
    public void on()
    {
        System.out.println("Turning on phone....");
    }
}
class SmartPhone extends Phone
{
    public void music()
    {
        System.out.println("Playing music...");
    }
    public void on()
    {
        System.out.println("Turning on Smartphone....");
    }
}
class Dynamic_Method_Dispatch49
{
    public static void main(String[] args)
    {
//        Phone obj = new Phone();
//        obj.name();
//        SmartPhone smobj = new SmartPhone();

        //whenever u create a object , the name of object is a reference variable.
        //when your reference "Phone" is of super class and object "SmartPhone"
        // is of subclass then you can do this:
        //super obj = new sub():
        Phone obj = new SmartPhone(); //Remember-: objects runs at runtime.i.e when ur program is running.
        //But you cannot do this:
//        SmartPhone obj2 = new Phone();
//agar jo method derived me v h aur super me v tab to derived wala he call hoga aur agar nahi tab super class wala.
        obj.Showtime();
        obj.on(); //on smartPhone ka hoga.
        //obj.music(); Not allowed. it will run only when the same method is also in super class.
        //so the method is decide to run on runtime this is called Dynamic Method Dispatch.

        //Also remember : when there is use new keyword it means it runs at runtime not at
        //compile time.
    }
}
