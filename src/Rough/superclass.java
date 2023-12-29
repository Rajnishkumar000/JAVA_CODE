package Rough;
class parent{
     parent(int a)
    {
        System.out.println("This is parent class ka constructor "+a);
    }
}
class child extends parent
{
    child(){
        super(5);
        System.out.println("This is child class constructor");
    }

}
public class superclass
{
    public static void main(String[] args) {
        child ob=new child();
    }
}
