package LAB;

import java.util.Scanner;

import LAB.UserDefinedExceptionEx.AgeException;

public class UserDefinedExceptionEx2 {
	
	public void checkAge() 
	{
		Scanner s = new Scanner(System.in) ;
		String EmployeeName;
		int EmployeeAge;
		System.out.println("Enter the Employee Name");
		EmployeeName = s.next();
		System.out.println("Enter the Employee Age");
		EmployeeAge = s.nextInt();
		try
		{
		if (EmployeeAge >=40)
		{
			throw new AgeException("Age cannot be greater than 40");//here the "AgeException" is the UserDefined classname and not the constructor of class AgeException
		}
		else {
			System.out.println("Age entered is valid");	
		}
	}
	catch(AgeException ae)
	{
		System.out.println(ae.getMessage());
	}
	}
	public static void main(String[] args) {
		
		UserDefinedExceptionEx2 obj = new UserDefinedExceptionEx2();
		obj.checkAge();
	}
	class AgeException extends Exception 
	{
		AgeException(String message)//here AgeException is the constructor of the class AgeException
		{
			super(message);
		}
	}
}
//In UserDefinedExceptionEx program same question done with throws and throw where the main funtion was forced to handle the exception thrown by the funtion.
//In UserDefinedExceptionEx2 same question done with normal try catch in the funtion where the main fuction doesnt need to handle the exception since its try-catched within the funtion.