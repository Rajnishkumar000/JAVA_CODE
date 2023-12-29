package practiceProblem;

public class recursion1
{

    static void func(int n){
        if(n<1) {
            return;
        }
        System.out.print(n+" ");
        func(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=5;
        func(n);
    }
}
