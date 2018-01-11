package JavaCollectionsEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
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
