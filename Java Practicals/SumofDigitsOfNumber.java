package LAB;

import java.util.Scanner;

public class SumofDigitsOfNumber {
	public static void main(String[] args) {
		int num,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		
		while(num !=0)
		{
			 
			    
			       
			        sum+= num % 10;     /* Finding the last digit of num and add to sum */
			 
			       
			        num = num / 10;      /* Removes last digit from num */
			    
		}
		System.out.println("The sum of digits of a numbers is"+sum);

}
}
 