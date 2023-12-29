package Gene;
import java.util.*;
public class hashmap2 {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		HashMap<Integer,String> hmap1=new HashMap<Integer,String>();
		hmap.put(10, "A");
		hmap.put(20, "B");
		hmap.put(5, "C");
		hmap.put(10, "D");
		hmap.put(30, "A");
		hmap.put(40, null);
		hmap.put(50, null);
		hmap.put(10, "A");
		System.out.println(hmap);
		
		
		
		
		
		
		hmap1.put(15,"A");
		hmap1.put(14,"A");
		hmap1.put(13,"A");
		hmap1.put(12,"A");
		hmap1.put(11,"A");
		System.out.println(hmap1);

	}

}
