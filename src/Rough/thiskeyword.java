package Rough;
class myclass{
    myclass(int a,int b){

        System.out.println(a*b);
    }
    myclass(){
        this(101,2);
        System.out.println("This is non-parametrized constructor");

    }
}
public class thiskeyword
{
    public static void main(String args[])
    {
        myclass ob=new myclass();

    }
}
