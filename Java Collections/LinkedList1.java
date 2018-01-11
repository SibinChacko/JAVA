package JavaCollectionsEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
	public static void EmpDetails()
	{
		LinkedList emp = new LinkedList();
		emp.add("Tim");
		emp.add(23);
		emp.add("Kim");
		emp.add(24);
		emp.add("Jim");
		emp.add(25);
		emp.add("Nim");
	    emp.add(26);
	    emp.addFirst("Sibin");
	    emp.addLast("Neha");
	    System.out.println(emp.get(3));
	    System.out.println(emp.getFirst());
	    System.out.println(emp.getLast());
	    
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
