package LAB;

import java.util.Scanner;

public class CountOfDigitsOfInteger {

	public static void main(String[] args) {
		int num,count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		 while(num != 0)
		    {
	
		        num /= 10;
		        ++count;
		    }

		 System.out.println("The count of digits of a numbers is"+count);


	}

}
