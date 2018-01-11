package LAB;

import java.util.Scanner;

public class InheritanceStudDetails {

	public static void main(String[] args) {
		

	}
}
	class Maths
	{
      String name1,name2,name3;
      int m1,m2,m3;
      Scanner s = new Scanner(System.in);
		public void input(){
		System.out.println("Enter the name1");
		name1=s.next();
		System.out.println("Enter the name2");
		name2=s.next();
		System.out.println("Enter the name3");
		name3=s.next();
		System.out.println("Enter the mark1");
		m1=s.nextInt();
		System.out.println("Enter the mark2");
		m2=s.nextInt();
		System.out.println("Enter the mark3");
		m3=s.nextInt();
}
		public void display(){
			System.out.println("The name1 is "+name1);
			System.out.println("The name2 is "+name2);
			System.out.println("The name3  is "+name3);
			System.out.println("The mark1 is "+m1);
			System.out.println("The mark2 is "+m2);
		    System.out.println("The mark3 is "+m3);
		}
	}
	class Biology
	{