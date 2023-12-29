package Gene;

import java.util.HashSet;
import java.util.TreeSet;

public class treesett {

	public static void main(String[] args) {
		TreeSet<Integer> t1=new TreeSet<Integer>();
		TreeSet<String> t2=new TreeSet<String>();
		
		t1.add(10);
		t1.add(5);
		t1.add(20);
		t1.add(1);
		System.out.println(t1);
		//Prints in ascending order like a treemap
		t2.add("rajnish");
		t2.add("kumar");
		t2.add("Rajnish");
//		t2.add(null);
		t2.add("Rajnish");
		System.out.println(t2);
	}
	//Arranges according to ASCII code
	//OR we can say that 

}
