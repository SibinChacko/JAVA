package LAB;

import java.util.Scanner;

public class LastCharOfString {

	public static void main(String[] args) {
		String name;
	char temp =0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		name=s.next();
		for(int i=0;i<name.length();i++)
		{
			temp = name.charAt(i);
			
		}
		System.out.println("The last character of the string is "+temp);
		

	}

}
