package LAB;

import java.util.Scanner;

public class FactorsOfANumber {

	public static void main(String[] args) {
		int counter,num,num1=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		
		for(counter=1;counter<=num;counter++)
		{
			if(num%counter==0)
			{
				num1=counter;
			}
			System.out.println("Factors of the given number are"+num1);
		}
		
		

	

	}

}
