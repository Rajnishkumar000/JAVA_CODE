package lambdaE;
import java.util.*;
//interface thread{
//	void run();
//	
//}
class tst implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
	}
}
public class p7 
{
	public static void main(String args[]) {
	Scanner in=new Scanner(System.in);
	tst t=new tst();
    Thread d=new Thread(t);
    d.start();//start function k ander run method call hua hoga
    for(int i=0;i<=10;i++) {
    	System.out.println("main thread");
    }
    Runnable r=()->{
    	for(int i=0;i<=10;i++) {
        	System.out.println("child thread");
        }
    };
	
	}

}
