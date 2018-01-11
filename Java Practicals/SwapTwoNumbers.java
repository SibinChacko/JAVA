package LAB;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
	
			int num1,num2,temp;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the numbers");
			num1=s.nextInt();
			num2=s.nextInt();
			temp=num1;
			num1=num2;
			num2=temp;
			
			System.out.println("After swapping we get"+num1+"and"+num2);


	}

}
