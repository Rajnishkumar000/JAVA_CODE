package OOPs;
//Super keyword is use to refer immediate parent class object.
//can be use to refer immediate parent class instance variable.
//can be used to invoke parent class methods.
// can be use to invoke parent class constructors.
class EkClass
{
    int a;

    public int getA() {
        return a;
    }
    EkClass(int a)
    {
   // a = a;  so we use this keyword:
        this.a = a;
    }
    public int returnone()
    {
        return a;
    }
}
class doclass extends EkClass
{
    doclass(int c)
    {
        //super keyword must be a first statement:
        super(c);// we use here super becoz when u create object it will call
        //by default constructors of super class which is not present so it throw error.
        System.out.println("I am a constructor");
    }
}
class this_super_keyword47
{
    public static void main(String[] args)
    {
//    EkClass e = new EkClass(65);
    doclass d = new doclass(5);
        System.out.println(d.getA());
    }
}
