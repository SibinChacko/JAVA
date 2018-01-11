package LAB;

import java.util.Scanner;

public class AddSubMulDiv {
	

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();

	}
	public static void add()

	{
		int num1,num2,num3;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers");
		num1=s.nextInt();
		num2=s.nextInt();
		num3=num1+num2;
		System.out.println("The addition result is"+num3);
	}
	public static void sub()
	{ 
	int num1,num2,num3;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the numbers");
	num1=s.nextInt();
	num2=s.nextInt();
		num3=num1-num2;
		System.out.println("The subtraction result is"+num3);
		}
	public static void mul()
	{
		int num1,num2,num3;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers");
		num1=s.nextInt();
		num2=s.nextInt();
		num3=num1*num2;
		System.out.println("The multiplication result is"+num3);
	}
	public static void div()
	{
		int num1,num2,num3;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers");
		num1=s.nextInt();
		num2=s.nextInt();
		num3=num1/num2;
		System.out.println("The division result is"+num3);
	}

}
