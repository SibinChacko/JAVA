package LAB;

import java.util.Scanner;

public class CenterCharOfString {
	public static void main(String[] args) {
	String name;
	char temp =0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		name=s.next();
		for(int i=0;i<name.length();i++)
		{
			temp = name.charAt(2);
			
		}
		if(temp=='S'){
			System.out.println("The 3rd character of the string is S");
		}
		else{
			System.out.println("The 3rd character of the string is  not S");
		}
		
		

}
}