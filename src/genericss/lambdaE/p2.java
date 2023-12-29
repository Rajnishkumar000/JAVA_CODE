package lambdaE;
interface ab{
	int add(int a,int b);
	int sub(int a, int b);
}
class test implements ab{
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
}


public class p2 {
public static void main(String args[]) {
ab ob=new test();
test ob2=new test();
System.out.println(ob.add(1, 3));
System.out.println(ob2.add(2, 5));	
}
}
