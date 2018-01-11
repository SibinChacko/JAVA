package JavaCollectionsEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList5 {
	
	public static void EmpDetails()
	{   int Age,SalCount=0,a1=0,Sal;
	    String Name,City,State,n1 = null,c1=null,s1=null;
		Scanner s = new Scanner(System.in);
		for(int i=0;i<=2;i++){
		 System.out.println("Enter Student Name");
		 Name=s.next();
		 System.out.println("Enter Student City");
		 City=s.next();
	     System.out.println("Enter Student Age");
		 Age=s.nextInt();
		 System.out.println("Enter Student State");
		 State=s.next();
		 System.out.println("Enter Student Salary");
		 Sal=s.nextInt();
		 if(Sal>SalCount){
			 SalCount=Sal;
			 n1=Name;
			 a1=Age;
			 c1=City;
			 s1=State;
		 }
		}
		 Employee row1 = new Employee(n1,a1,c1,s1,SalCount);
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(row1);
		
		
		for(Employee obj:emp)
		{
			System.out.println("Student Details............");
			System.out.println("Name is"+obj.StdName);
			System.out.println("Age is"+obj.StdAge);
			System.out.println("City is"+obj.StdCity);
			System.out.println("State is"+obj.StdState);
			System.out.println("Salary is"+obj.StdSal);
		
	}
	}
	
	public static void main(String[] args) {
		 EmpDetails();

	}

}
class Employee
{
	String StdName;
	int StdAge;
	String StdCity;
	String StdState;
	int StdSal;
	public Employee(String name,int age,String city,String state,int salary123)
	{
		this.StdName=name;
		this.StdAge=age;
		this.StdCity=city;
		this.StdState=state;
		this.StdSal=salary123;
	}


	}
