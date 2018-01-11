package LAB;

import java.util.Scanner;

public class Reverse2 {

	public static void main(String[] args) {
		int num,reverse=0,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		while(num!=0){
		reverse=reverse*10;
		reverse=reverse+num%10;
		num=num/10;
		}
		System.out.println("The reverse is "+reverse);

	}

}
