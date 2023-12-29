package Gene;
import java.util.*;
public class hasmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap1=new HashMap<Integer,String>();
		hmap1.put(14, "George");
		hmap1.put(15, "Gerge");
		hmap1.put(16, "Gge");
		hmap1.put(18, "Grge");
		hmap1.put(18, "Grge");
		System.out.println(hmap1);
		System.out.println(hmap1.values());
		System.out.println(hmap1.keySet());
		
		System.out.println(hmap1.remove(14));
		System.out.println(hmap1.containsKey(15));
		//Takes 11 as default stack value use mod
		
		
	}

}
