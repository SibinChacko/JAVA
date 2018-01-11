package LAB;

import java.util.Scanner;

public class ConstructorAreaOfCircle {
	public ConstructorAreaOfCircle(int rad){
		int num1=rad;
		double area;
		area=3.14*num1*num1;
		System.out.println("Area of circle "+area);
	}

	public static void main(String[] args) {
		
		
		ConstructorAreaOfCircle obj = new ConstructorAreaOfCircle(4);
		

	}

}
