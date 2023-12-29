package lambdaE;
import java.util.*;
interface avg{
	double average(int n[]);
}
public class p6 {
public static void main(String args[]) {
	avg ob1=(n)->{
		int s=0;
		for(int i=0;i<n.length;i++) {
			 s=n[i]+s;
		}
		return s/n.length;
	};
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int l=in.nextInt();
	int n[]=new int[l];
	System.out.println("Enter the array elements");
	for(int i =0 ;i<l;i++) {
		n[i]=in.nextInt();
		
	}
	System.out.println("The average of all no's is "+ob1.average(n));
	
}
}
