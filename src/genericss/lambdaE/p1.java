package lambdaE;
//WITHOUT LAMBDA
public class p1 {
	public void T1() {
		System.out.println("hello");
	}
	
	
	public int T2(int a){
		
		return a*a;
	}
	public int T3(int a, int b)
	{
		return a+b;
	}
	public static void main(String args[]) {
	p1 ob=new p1();
	ob.T1();
	System.out.println(ob.T2(2));
	System.out.println(ob.T3(4, 6));
	
	}

}
