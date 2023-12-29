package Gene;
import java.util.*;

public class Q {
public static void main(String args[])
{
	PriorityQueue<Integer> a=new PriorityQueue<Integer>();
	a.add(15454);
	a.add(12345);
	a.add(23);
	System.out.println(a);
	
	
	PriorityQueue<String> b=new PriorityQueue<String>();
	b.add("abcd");
	b.add("aaa");
	b.add("Rajnish");
	
	b.add("rajnish");
	b.add("0");
	System.out.println(b);
	System.out.println(b.poll());
	b.add("kumar");
	System.out.println(b);
	System.out.println(b.poll());
	b.add("ajfjf");
	System.out.println(b);
	System.out.println(b.poll());//returns the pop elment
	System.out.println(b);
	System.out.println("Now peek operation");
	System.out.println(b.peek());
	System.out.println(b);
	System.out.println(b.peek());
	System.out.println(b);
	System.out.println(b.poll());
	System.out.println(b);
	System.out.println(b.peek());;
	System.out.println(b);
	System.out.println(b.poll());
	System.out.println(b);
	System.out.println(b.peek());
	System.out.println(b);
	
	
	
}
}
