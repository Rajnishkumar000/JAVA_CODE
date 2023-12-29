package OOPs;
class Myemployee2
{
    private int id;
    private String name;
//    u cn also perform method overloading here in constructors
//    and also constructor have no return type.
    public  Myemployee2()
    {
        id = 46;
        name = "Aditya Raj";
    }
public Myemployee2(String myname,int myid)
{
    this.id = myid;
   this. name = myname;
}
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        this.name = n;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int i)
    {
       this. id=i;
    }
}
class Constructors42
{
    public static void main(String[] args)
    {
        //        You cannot change it from main but can be change by making constructors.
//        it automatically call when you make an object.
//        Myemployee2 prince = new Myemployee2("Prince Singh Rajput",67678);

//        When you don't pass any argument then it call constructor which have no parameters:
        Myemployee2 prince = new Myemployee2();
//        prince.setName("Aditya Raj");
//    prince.setId(4565);
        System.out.println(prince.getName());
        System.out.println(prince.getId());

    }
}
