package LAB;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		int EmpAge,i,Age=0,EmpSal,n,SalMax=0,AgeMax=0;
		String EmpId,EmpName,EmpDept,k,m;
		System.out.println("Enter the total number of customers");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<=n;i++){
			System.out.println("Enter the Emp ID");
			EmpId=s.next();
			System.out.println("Enter the Emp name");
			EmpName=s.next();
			System.out.println("Enter the Emp Age");
			EmpAge=s.nextInt();
			System.out.println("Enter the Emp Salary ");
			EmpSal=s.nextInt();
			System.out.println("Enter the Emp Department");
			EmpDept=s.next();
			if(EmpSal>SalMax){
				SalMax=EmpSal;
				k=EmpName;
				System.out.println("Employee with maximum salary is "+k);
			}
			if(EmpAge>AgeMax){
				AgeMax=EmpAge;
				m=EmpName;
				System.out.println("Employee with highest age is "+m);
			}


	}

}
}