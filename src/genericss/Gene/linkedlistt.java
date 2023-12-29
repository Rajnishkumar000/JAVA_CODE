package Gene;
import java.util.*;
public class linkedlistt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <Integer> v=new LinkedList<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(3);
		v.add(null);
		v.add(0);
		System.out.println(v);
		System.out.println(v.size());
		
		v.add(100);
		System.out.println(v);
		System.out.println(v.size());
		
		v.add(200);
		System.out.println(v);
		System.out.println(v.size());
		
		v.add(300);
		System.out.println(v);
		System.out.println(v.size());
		
		v.add(400);
		System.out.println(v);
		System.out.println(v.size());
		//has many functions
		//time complexity is less
		//searching time complexity is more 
		
		

	}

}
