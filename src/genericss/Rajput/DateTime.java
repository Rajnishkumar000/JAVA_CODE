package Rajput;


import java.time.ZoneId;
import java.time.*;
import java.time.format.*;
import java.util.*;
public class DateTime
{

public static void main(String args[]) 
{
	Scanner in = new Scanner(System.in);
	LocalDate t = LocalDate.now();
	System.out.println("Enter your Date of Birth in dd-mm-yyy: ");
	String str = in.nextLine();
	LocalDate d = LocalDate.parse(str);
	
	Period p = Period.between(d,t);
	System.out.println(p);
	
	
	
}
}