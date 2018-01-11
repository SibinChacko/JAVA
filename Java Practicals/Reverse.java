package LAB;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int num,reverse=0,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		while(num!=0){
		temp=num%10;
		reverse=reverse*10+temp;
        num=num/10;
	}
		System.out.println("The reverse of the given number is "+reverse);
}
}