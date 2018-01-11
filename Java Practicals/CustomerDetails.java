package LAB;

import java.util.Scanner;

public class CustomerDetails {

	public static void main(String[] args) {
		String CustID,CustName,CustGender,CustAddr,CustCity,CustCountry,CustInterest,CustDOB;
		int CustAge,CustPin,CustPhone,i,n,count1=0,count2=0,count3=0;
		System.out.println("Enter the total number of customers");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<n;i++){
			System.out.println("Enter the customer id");
			CustID=s.next();
			System.out.println("Enter the customer name");
			CustName=s.next();
			System.out.println("Enter the customer address");
			CustAddr=s.next();
			System.out.println("Enter the customer gender");
			CustGender=s.next();
			System.out.println("Enter the customer city");
			CustCity=s.next();
			System.out.println("Enter the customer country");
			CustCountry=s.next();
			System.out.println("Enter the customer area of interest");
			CustInterest=s.next();
			System.out.println("Enter the customer DOB");
			CustDOB=s.next();
			System.out.println("Enter the customer Age");
			CustAge=s.nextInt();
			System.out.println("Enter the customer Pin");
			CustPin=s.nextInt();
			System.out.println("Enter the customer phone");
			CustPhone=s.nextInt();
			if(CustCity.equals("pune"))
			{
				count1++;
				
			}
			if(CustGender.equals("male"))
			{
				count2++;
				
			}
			else if(CustGender.equals("female"))
			{
				count3++;
			}
			else {
				System.out.println("The customer gender is invalid.Should be Male or Female");
			}
			if(CustID.length()>4){
				 System.out.println("The Customer ID should be less than 4 characters");
			}
			 if(CustID.charAt(0)!='C'){
				 System.out.println("The Customer ID should start with character C ");
			 }
		

	}
		System.out.println("Total customers within pune city is "+count1);
		System.out.println("Total customers who are male is "+count2);
		System.out.println("Total customers who are female is "+count3);
}
}