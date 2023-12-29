package OOPs;

import java.util.Arrays;

class Method_Overloading32
{
    //Method Overloading-> Two or more methods can have same name but different parameters having same return type.
//    Such methods are called Method Overloading:
    static void change(int []arr)
    {
       arr[0]=79;
//        Arrays.toString(arr) is a method by which we can print array:
        System.out.println(Arrays.toString(arr));
    }
    static void change(int a)
    {
//        a = 98;
        System.out.println(a);
    }
    static void change()
    {
        System.out.println("I invention a word\n" + "plagiarism");
    }

    public static void main(String[] args)
    {
        change(); //calling
        int []marks={34,76,98,100,45,77,85};
        //case 1:changing integer:
        int x = 45;
       change (x);
//       System.out.println("x after changing is "+x);

//      case 2:changing Array:
       change (marks);
       //it will change because you are passing the array which is an object.i.e marks is
        // an address of array and any change in method will reflect in main method.
        // It means when you passing any type object and any change made in custom method will reflect main method:
//       System.out.println("marks[0] after changing is "+marks[0]);
    }
}