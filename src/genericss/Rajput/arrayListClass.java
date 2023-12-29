package Rajput;
import java.util.*;
class employee
{
	int empId;
	String emname;
	employee(int empId,String emname)
	{
		this.empId = empId;
		this.emname = emname;
		
	}
	
}
public class arrayListClass 
{
	public static void main(String[] args)
	{
ArrayList<employee> emp = new ArrayList<>();
Scanner in = new Scanner(System.in);
System.out.println("Enter no of employee : ");
int n = in.nextInt();
int k = 0;
while(n>0)
{
	k++;
	System.out.println("Enter name of employee "+k);
	String nm = in.nextLine();
	nm = in.nextLine();
	System.out.println("Enter id of employee "+k);
	int id = in.nextInt();
	emp.add(new employee(id,nm));
	n--;
}
System.out.println("\nInformation of your employee is : \n");
//for(employee e : emp)
//{
//	System.out.println("Name of employee : "+e.emname);
//	System.out.println("Id of employee: "+e.empId+"\n");
//}
for(int i = 0; i<emp.size(); i++)
{
	System.out.println("Name of employee : "+emp.get(i).emname);
	System.out.println("Id of employee: "+emp.get(i).empId+"\n");
}
	}

}
