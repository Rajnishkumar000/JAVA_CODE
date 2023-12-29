package Gene;
import java.util.*;

public class Hashsett {

	public static void main(String[] args) {
		
		HashSet<Integer> h1=new HashSet<Integer>();
		HashSet<String> h2=new HashSet<String>();
		
		h1.add(10);
		h1.add(5);
		h1.add(20);
		h1.add(null);
		h1.add(40);
		h1.add(2);
		h1.add(40);
		h2.add("Rajnish");
		h2.add("Kumar");
		h2.add("rajnish");
		h2.add(null);
		System.out.println(h1);
		System.out.println(h2);
		//duplicate nahi leta hai null nahi leta hai
		//prints in random order

	}

}
