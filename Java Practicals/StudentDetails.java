package LAB;

import java.util.Scanner;


public class StudentDetails {

	public static void main(String[] args) {
		int StdAge,i,Age=0,Cot=0,Cot1=0,Cot2=0;
		String StdId,StdName,StdCity,StdCountry;
		Scanner s = new Scanner(System.in);
		for(i=0;i<=5;i++){
			System.out.println("Enter the Student ID");
			StdId=s.next();
			System.out.println("Enter the Student Name");
			StdName=s.next();
			System.out.println("Enter the Student Age");
			StdAge=s.nextInt();
			System.out.println("Enter the Student City");
			StdCity=s.next();
			System.out.println("Enter the Student Country");
			StdCountry=s.next();
			if(StdAge>100){
				System.out.println("The Student Age is not valid.Should be less than 100");
			}
			if(StdCountry.equals("India")){
				System.out.println("The Student Country is valid.");
			}
				else{
					System.out.println("The Student Country is not valid.");
			}
			if(StdAge>21){
				Age++;
				
			}
			if(StdCity.equals("pune"))
			 {
				 Cot++;
				
		}
			if(StdCity.equals("mumbai"))
			 {
				 Cot1++;
				
		}
			if(StdCity.equals("delhi"))
			 {
				 Cot2++;
				 
		}
			if(StdId.length()>5){
				 System.out.println("The Students ID should be less than 5 characters");
			}
			 if(StdId.charAt(0)=='S'){
				 System.out.println("The Students ID is valid ");
			 }
			 else{
				 System.out.println("The Students ID should start with 'S'");
			 }

	}
		System.out.println("The Students with age greater than 21 is "+Age);
		 System.out.println("The Students that reside in pune is "+Cot);
		 System.out.println("The Students that reside in mumbai is "+Cot1);
		 System.out.println("The Students that reside in delhi is "+Cot2);

}
}