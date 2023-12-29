package lambdaE;
interface sqrt{
	double root(int a);
}
public class P5 {
	public static void main(String args[]) {
		sqrt ob1=(a)->(Math.sqrt(a));
		System.out.println(ob1.root(23));
	}

}
