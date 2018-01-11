package LAB;

import java.util.Scanner;

public class ReplaceThirdChar {
	public static void main(String[] args) {
		String name,name1 = null;
		char temp =0;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the name");
			name=s.next();
			for(int i=0;i<name.length();i++)
			{
				temp = name.charAt(2);
				name1=name.replace(temp, 'T');
			}System.out.println("the replaced is "+name1);
	}
}
