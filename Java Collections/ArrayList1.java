package JavaCollectionsEx;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList1 {
	public static void EmpDetails()
	{
		ArrayList emp = new ArrayList();
		emp.add("Tim");
		emp.add(23);
		emp.add("Kim");
		emp.add(24);
		emp.add("Jim");
		emp.add(25);
		emp.add("Nim");
	    emp.add(26);
	  
	    System.out.println(emp);
	   
	    ListIterator lstItr = emp.listIterator();
	    System.out.println("Get all values in the forward direction");
	    while(lstItr.hasNext())
	    {
	    	System.out.println(lstItr.next());
	    }
	    System.out.println("Get all values in the backward direction");
	    while(lstItr.hasPrevious())
	    {
	    	System.out.println(lstItr.previous());
	    }
	}

	public static void main(String[] args) {
		EmpDetails();

	}

}
