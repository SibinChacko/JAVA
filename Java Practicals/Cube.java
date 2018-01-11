package LAB;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		int num,i,ada = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		for(i=1;i<=num;i++)
		{
		ada=i*i*i;
			
		}
		System.out.println("The cube of numbers is"+ada);
	
	}

}
