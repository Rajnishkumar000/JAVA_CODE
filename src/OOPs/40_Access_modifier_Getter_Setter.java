package OOPs;
class Myemployee
{
   private int id;
   private String name;
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
       id=i;
   }
}
class Access_modifier_Getter_Setter40
{
    public static void main(String[] args)
    {
    Myemployee psr = new Myemployee();
//    shows error as you cannot access directly private int and private string. You can only access
//        it by method (Getter - Setter):
//    psr.id = 35;
//    psr.name = "Aditya Raj";
        psr.setId(78);
        psr.setName("Aditya Raj");
        String n= psr.getName();
        int id = psr.getId();
        System.out.println("My name is "+n);
        System.out.println("My id is "+id);
    }
}
