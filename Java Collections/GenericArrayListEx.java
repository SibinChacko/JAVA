package JavaCollectionsEx;

import java.util.ArrayList;

public class GenericArrayListEx {

	public static void EmpDetails()
	{
		ArrayList<String> empname = new ArrayList<String>();
		empname.add("Sibin");
		empname.add("Neha");
		empname.add("Anchal");
		empname.add("Sakshi Mam");
	//	emp.add(23); this line will show error if not commented because ArrayList is restricted to String type and we are trying to use integer value
		empname.add("Isha");
	//	emp.add(24);this line will show error if not commented because ArrayList is restricted to String type and we are trying to use integer value
		empname.add("Vikash");
	//	emp.add(25);this line will show error if not commented because ArrayList is restricted to String type and we are trying to use integer value
		for(String name:empname)
		{
			 System.out.println(name);
		}
	
	ArrayList<Integer> empage = new ArrayList<Integer>();
	
	empage.add(23); 
	empage.add(24); 
	//empage.add("Neha");this line will show error if not commented because ArrayList is restricted to Integer datatype and we are trying to use String value
	//empage.add("Anchal");this line will show error if not commented because ArrayList is restricted to Integer datatype and we are trying to use String value
	empage.add(25); 
	empage.add(26); 
	empage.add(27); 
	empage.add(28);
	System.out.println(empage.get(4));
	for(int age:empage)
	{
		 System.out.println(age);
	}
	}
	public static void main(String[] args) {
		
		EmpDetails();
	}

}
