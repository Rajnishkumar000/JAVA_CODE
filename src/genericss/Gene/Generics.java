//package Gene;
//import java.util.*;
//public class Generics 
//{
//	static class gen<T,K>
//	{
//		public T[] print(T t[],K k[]) throws Exception
//		{
//			Arrays.sort(t);
//			for(T r:t)
//			{
//				for(K s: k)
//				{
//				System.out.println(r+" --> "+s);
//				}
//			}
//			return t;
//		}
//
//		public char[] hashcode() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//	}
//
//	public static void main(String[] args) 
//	{
//		Integer [] a = {2,34,5,67,5};
//		String[] b = {"Ram","Raju","Mukesh"};
//		
//		try {
//			
//		new gen<Integer,String>().print(a,b);
//		System.out.println();
//		new gen<String,Integer>().print(b,a);
//		System.out.println(new gen<Integer,String>());
//		System.out.println(new gen<Integer,String>().hashCode());
//		}
//		catch(Exception e)
//		{
////			e.printStackTrace();
//			System.out.println(e);
//		}
//		
//		System.out.println(new gen<Integer,Double>().hashcode());
//		
//	}
//
//}
