package OOPs;
class Methods_Java31
{
    //when you creating static method then you doesn't need to make object in main method for calling method you
    // can call by the method name only ,lekin ye tabhi hoga jab wo static method aur main method dono same
    // class me ho...nahi to phir class kaa naam dot method ke naam se call kar skate h ya phir
    // object bana kr v kar sakte h. public  static int logic(int a, int b){

    //but when you creating non-static method then you have to make an object in main method to call method:
    //This is because a non-static method cannot be called by a static method(main) without creating object in main.
    //this is also for variable means if u r creating a non-static variable (which is like local) then u can access it only by creating
    //creating object of its class.But when u creating a static variable (which is like global) then u can access
    //directly by its name.
    int logic(int a, int b)
      {
        int c; //when you creating static method then int c should be inside static method.
        // and whatever variable name you declare inside method can be same as you declare in main method.
        if (a > b) {
            c = a + b;
        } else {
            c = a + b + 5;
        }
        return c;
    }
    public static void main(String[] args)
    {
        //making object so that i can call non-static method named logic:
        Methods_Java31 obj=new Methods_Java31();
        //calling static method:
//    int c= logic(45,44);
        //calling non-static method by object name:
        int c= obj.logic(45,44);
    //can use same object or you can make new object:
        int c1= obj.logic(22,40);
        System.out.print(c+" "+c1);

    }
}
