package LAB;

import java.util.Scanner;

public class MenuDrivenCalculator {

	public static void main(String[] args) {
		int n;
		double num1,num2,f;
		
		System.out.println("***********Calculator*********");
		System.out.println("\n\n\n1. Addition\n2. Subtraction\n3. Division\n4. Multiplication\n5. Exit");
		System.out.print("\nEnter the option to be performed ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		switch(n)
		{
		case 1:
		    System.out.print("\n\nEnter the first no. : ");
		    num1=s.nextDouble();
		    System.out.print("Enter the second no. : ");
		    num2=s.nextDouble();
		    f=num1+num2;
		    System.out.println("Final Answer is : "+f);
		    break;
		case 2:
		    System.out.print("\n\nEnter the first no. : ");
		    num1=s.nextInt();
		    System.out.print("Enter the second no. : ");
		    num2=s.nextInt();
		    f=num1-num2;
		    System.out.print("Final Answer is : "+f);
		    break;
		case 4:
		    System.out.print("\n\nEnter the first no. : ");
		    num1=s.nextDouble();
		    System.out.print("Enter the second no. : ");
		    num2=s.nextDouble();
		    f=num1*num2;
		    System.out.print("The product is : "+f);
		    break;
		case 3:
		    System.out.print("\n\nEnter the first no. : ");
		    num1=s.nextDouble();
		    System.out.print("Enter the second no. : ");
		    num2=s.nextDouble();
		    f=num1/num2;
		    System.out.print("The Quotient is : "+f);
		    break;
		
		default:
		    System.out.println("Enter the correct no.");
		    break;
		}
		
	}
}

		