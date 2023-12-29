package OOPs;

class EkClass1{
    int a;
    public int getA() {
        System.out.println("I am a Ek class constructor");
        return a;
    }
    EkClass1(int a){
        System.out.println("Mai hu asli ek class constructor");
        this.a = a;
    }
}


class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a Do class constructor");
    }
}
public class cwh_47_this_super {
    public static void main(String[] args) {
      //EkClass e = new EkClass(65);
       // System.out.println(e.getA());


        DoClass d  =new DoClass(5);
        System.out.println(d.getA()); } }