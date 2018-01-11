package LAB;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int num,i,tab;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number whose table is required");
		num=s.nextInt();
		 for(i=0;i<=10;i++){
			 tab=num*i;
			 System.out.println("The table of entered number is "+tab);
		 }
		 

	}
	
}
