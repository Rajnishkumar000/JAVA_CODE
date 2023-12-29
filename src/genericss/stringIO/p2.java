package stringIO;

public class p2 {
	public static void main(String args[])
	{
		String a="Raj";
		String b="Raj";
		String ob=new String("raj");
		System.out.println(ob);
		Integer ob2=new Integer(1);
		System.out.println(ob2);
		System.out.println();
		
		
		
		
		System.out.println("comparison using == operator  for literals: ");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		String key1=new String("nish");
		String key2=new String("nish");
		System.out.println("comparison using == operator using objects : ");
		System.out.println(key1==key2);
		
		System.out.println("NOW STRING FUNCTION WE WILL EXECUTE  \n\n\n\n");
		String str="my favourite programming language is java ";
		System.out.println(str+" \n\n");
		String[]arrOfstr=str.split(" ");
		for (String piece:arrOfstr) {
			System.out.println(piece);
		} 
		
		
//		StringBuilder s="keyword";
		StringBuilder s1=new StringBuilder("hello");
		StringBuilder s2=new StringBuilder("helloagain");
		long starttime =System.currentTimeMillis();
		System.out.println("starttime is "+starttime);
		for(int i=0;i<=1000000;i++)
		{
			s1.append("java");
			
		}
		System.out.println(System.currentTimeMillis()-starttime);//subtracting currenttime from starttime
		starttime=System.currentTimeMillis();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		long starttimes =System.currentTimeMillis();
		for(int i=0;i<=1000000;i++)
		{
			s2.append("java");
			
		}
		System.out.println(System.currentTimeMillis()-starttimes);
		starttimes=System.currentTimeMillis();
		
		
		
	}

}
