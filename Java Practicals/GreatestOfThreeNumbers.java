package LAB;

import java.util.Scanner;

public class GreatestOfThreeNumbers {

	public static void main(String[] args) {
		
			int n1,n2,n3;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number");
			n1=s.nextInt();
			n2=s.nextInt();
			n3=s.nextInt();
			if( n1>n2 && n1>n3 )
				 System.out.println("The greatest of three is"+n1);

		    if( n2>n1 && n2>n3 )
		    	System.out.println("The greatest of three is"+n2);

		    if( n3>n1 && n3>n2 )
		    	System.out.println("The greatest of three is"+n3);
	}

}
