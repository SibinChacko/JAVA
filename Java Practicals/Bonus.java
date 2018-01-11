package LAB;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
	String Ename,Ecity,k,m,n;
	int Age,Salary,Phone,Bonus=0,Sal,Sal2,Sal3;
	 
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the name");
	Ename=s.next();
	System.out.println("Enter the age");
	Age=s.nextInt();
	System.out.println("Enter the city");
	Ecity=s.next();
	System.out.println("Enter the salary");
	Salary=s.nextInt();
	System.out.println("Enter the phone number");
	Phone=s.nextInt();
if(Salary==10000){
	Bonus=Bonus+3000;
	k=Ename;
	Sal=Salary+Bonus;
	System.out.println("The employee name is "+k);
	System.out.println("The employee salary with bonus is "+Sal);
	
}if(Salary==5000){
	Bonus=Bonus+1000;
	m=Ename;
	Sal2=Salary+Bonus;
	System.out.println("The employee name is "+m);
	System.out.println("The employee salary with bonus is "+Sal2);
	}
if(Salary==100000){
	Bonus=Bonus+10000;
	n=Ename;
	Sal3=Salary+Bonus;
	System.out.println("The employee name is "+n);
	System.out.println("The employee salary with bonus is "+Sal3);
	}
}
}
