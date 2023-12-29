package lambdaE;
interface lamb{
	int sum(int a,int b);
	
}

public class p3 {
	public static void main(String args[]) {
		lamb ob1=new lamb() {
			public int sum(int a,int b) {
				return a+b;
			}
		};
		
		System.out.println(ob1.sum(2, 6));
		lamb ob2=(int a, int b)->a+b;
		System.out.println(ob2.sum(100, 30));
	}

}
