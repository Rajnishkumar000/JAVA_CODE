package multith;

class mythread extends Thread{
	p2 p;
	String name;
	mythread(p2 p,String name){
		this.p=p;
		this.name=name;
	}
	public void run() {
		p.ab(name);
	}
}
 class p2 
{
	
	public  void ab(String name)
	{
	synchronized(this){
		for(int i=0;i<=5;i++)
		{
			try {
				Thread.sleep(1000);
				
			}
			catch(Exception e) {}
				System.out.println(name);
			
	}}
	}

public class p1{
	public static void main(String args[]) {
		p2 p=new p2();
		mythread m1=new mythread(p,"hello");
		mythread m2=new mythread(p,"hii");
		m1.start();
		m2.start();
		
	}
}
}


