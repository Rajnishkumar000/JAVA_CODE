package superKeyword;
class Animal2{
    void eat()
    {
        System.out.println("eating...");
    }
    void bark()
    {
        System.out.println("barking...");
    }
}
class Dog2 extends Animal2{
    void eat()
    {
        System.out.println("eating bread...");
    }
    void bark()
    {
        System.out.println("Dog barking...");
    }
    void work(){
        super.eat();
        super.bark();
        bark();
    }
}
class TestSuper2{
    public static void main(String args[]){
        Dog2 d=new Dog2();
        d.work();
    }
}