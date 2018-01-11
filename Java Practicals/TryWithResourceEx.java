package LAB;

import java.util.Scanner;

public class TryWithResourceEx {

	public static void main(String[] args) {
		String EmployeeName;
		int EmployeeAge;
		try(Scanner s = new Scanner(System.in))
				{
		System.out.println("Enter the Employee Name");
		EmployeeName = s.next();
		System.out.println("Enter the Employee Age");
		EmployeeAge = s.nextInt();
		System.out.println("The details are valid");
	}
				catch(Exception ee)
		{
					System.out.println(ee.getMessage());
		}

	}
}
