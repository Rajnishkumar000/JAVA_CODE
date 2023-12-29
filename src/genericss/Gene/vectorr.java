package Gene;
import java.util.*;
public class vectorr {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(3);
		v.add(null);
		v.add(0);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(100);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(200);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(300);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(400);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(500);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(600);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
	//unlike arraylist it may increase capacity from current to double or add only 2
		//order preserve
		//null le rha
		
	}

}
