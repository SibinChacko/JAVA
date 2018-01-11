package LAB;

import java.util.Scanner;

public class ArrayAlternateElements {

	public static void main(String[] args) {
        int n = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements you want ");
		
		n=s.nextInt();
		int a[]=new int [n]; 
		
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the elements ");
		a[i]=s.nextInt();
		}
		for(int i=0;i<n;i+=2)
		{
		System.out.println("The alternate elements are "+a[i]);
		
			
		}

}
}