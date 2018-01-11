package LAB;

import java.util.Scanner;

public class UserDefinedExceptionEx {
	
	public void checkAge() throws AgeException
	{
		Scanner s = new Scanner(System.in) ;
		String EmployeeName;
		int EmployeeAge;
		System.out.println("Enter the Employee Name");
		EmployeeName = s.next();
		System.out.println("Enter the Employee Age");
		EmployeeAge = s.nextInt();
		if (EmployeeAge >=40)
		{
			throw new AgeException("Age cannot be greater than 40");//here the "AgeException" is the UserDefined classname and not the constructor of class AgeException
		}
		else {
			System.out.println("Age entered is valid");	
		}
	}
	
	public static void main(String[] args) {
		UserDefinedExceptionEx obj = new UserDefinedExceptionEx();
		try
		{
			obj.checkAge();
		}
		catch(AgeException ae)//here the AgeException is the class and ae is the object of the class AgeException
		{
			System.out.println(ae.getMessage());//here getMessage is the inbuilt method to get the message from the userdefined class AgeException
		}
	}
	class AgeException extends Exception 
	{
		AgeException(String message)//here AgeException is the constructor of the class AgeException
		{
			super(message);
		}
	}

}
