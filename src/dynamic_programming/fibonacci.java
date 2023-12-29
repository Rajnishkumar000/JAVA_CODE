//package dynamic_programming;
//
//import java.sql.SQLOutput;
//import java.util.Scanner;
//
//public class fibonacci
//{
//    int n;
//    static int f[];
//   void constr(int n,int f[]){
//    this.n=n;
//    this.f[n]=f[n];
//}
//
//
//    int fib_c(int n){
//        if(f[n]==-1)
//            f[n]=fib_c(n-1)+fib_c(n-2);
//        return f[n];
//    }
//
//
//      int fibc_driver(int n){
//        int i;
//          fibonacci ob=new fibonacci();
//        f[0]=0;
//        f[1]=1;
//        for( i=2;i<=n;i++){
//            f[i]=-1;
//
//        }
//        ob.constr(n,f[]);
//
//        return fib_c(n);
//
//    }
//    public static void main(String args[])
//    {
//        Scanner in=new Scanner(System.in);
//
//        System.out.println("Enter the value till You want to print");
//         int n=in.nextInt();
//
//
//        fibonacci ob=new fibonacci();
//        ob.fibc_driver(n);
//
//
//
//
//
//    }
//}
