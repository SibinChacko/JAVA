package JavaCollectionsEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList4 {
	public static void EmpDetails()
	{   int Age;
	    String Name,City,State;
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter Student Name");
		 Name=s.next();
		 System.out.println("Enter Student City");
		 City=s.next();
	     System.out.println("Enter Student Age");
		 Age=s.nextInt();
		 System.out.println("Enter Student State");
		 State=s.next();
		ArrayList emp = new ArrayList();
		emp.add(Name);
		emp.add(Age);
		emp.add(City);
		emp.add(State);
		
	   
	    Iterator itr = emp.iterator();
	    while(itr.hasNext())
	    {
	    	 System.out.println(itr.next());
	    }
	}

	public static void main(String[] args) {
		EmpDetails();
           
	}

}
