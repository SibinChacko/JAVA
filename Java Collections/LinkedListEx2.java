package JavaCollectionsEx;

import java.util.LinkedList;

public class LinkedListEx2 {
	public static void StudentData()
	{
		Student row1 = new Student("Tim",12,"Kolkata","WB");
		Student row2 = new Student("Sim",13,"Chennai","TB");
		Student row3 = new Student("Jim",14,"Punjab","MB");
		Student row4 = new Student("Vim",15,"Kerala","JB");
		Student row5 = new Student("Uim",16,"Delhi","YB");
		
		LinkedList<Student> Std = new LinkedList<Student>();
		
		Std.add(row1);
		Std.add(row2);
		Std.add(row3);
		Std.add(row4);
		Std.add(row5);
		
		for(Student obj:Std)
		{
			System.out.println("Student Details............");
			System.out.println("Name is"+obj.StdName);
			System.out.println("Age is"+obj.StdAge);
			System.out.println("City is"+obj.StdCity);
			System.out.println("State is"+obj.StdState);
		}
	}

	public static void main(String[] args) {
	
		StudentData();
	}

}
class Student
{
	String StdName;
	int StdAge;
	String StdCity;
	String StdState;
	public Student(String name,int age,String city,String state)
	{
		this.StdName=name;
		this.StdAge=age;
		this.StdCity=city;
		this.StdState=state;
	}


	}
