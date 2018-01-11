package LAB;

import java.util.Scanner;

public class FirstDigitOfInteger {

	public static void main(String[] args) {
		int counter,num,num1=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		while(num>10)
		{
			num=num/10;
			
		}
		System.out.println("First Digit is"+num);
	}

}
