package Rough;
class p1{
    int a;
    int b;
    public void func1(){
        System.out.println("THis is parent class");
    }
    public void func2(){
        System.out.println("this is parent class function to be overrided");
    }
}
class c1 extends p1{
    @Override
    public void func2(){
        System.out.println("This is child class function can be override");
    }
    public void func3(){
        System.out.println("This is child class ");
    }
}
public class ovrride
{
    public static void main(String[] args) {

        p1 obj=new c1();
        obj.func1();
        obj.func2();
//      obj.func3();

    }
}
