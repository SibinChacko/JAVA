package LAB;

import java.util.Scanner;

public class ArraySumAndAverage {

	public static void main(String[] args) {
		int n = 0,sum=0,avg = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements you want ");
		
		n=s.nextInt();
		int a[]=new int [n];
		
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the elements ");
		a[i]=s.nextInt();
           sum=sum+a[i];
           avg=sum/n;
		}
		 System.out.println("The sum is "+sum);
		 System.out.println("The average is "+avg);
}
}
