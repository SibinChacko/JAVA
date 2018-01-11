 package LAB;

import java.util.Scanner;

public class InheritanceEx {
	
	public static void main(String[] args) {
		
		car aobj = new car();
		aobj.display2();
           
	}
}
	class Fourwheeler
	{
		String color;
		int speed;
		int size;
		Scanner s = new Scanner(System.in);
		public void input(){
		System.out.println("Enter the color");
		color=s.next();
		System.out.println("Enter the speed");
		speed=s.nextInt();
		System.out.println("Enter the size");
		size=s.nextInt();
		}
		
		public void display(){
			System.out.println("The color is "+color);
			System.out.println("The speed is "+speed);
			System.out.println("The size is "+size);
			
		}
	} 
	class car extends Fourwheeler
	{
		String brand;
		int cc,gears;
		
		public void input2(){
			System.out.println("Enter the brand");
			brand=s.next();
			System.out.println("Enter the cc");
			cc=s.nextInt();
			System.out.println("Enter the gears");
			gears=s.nextInt();
			}
			
			public void display2(){
				System.out.println("The brand is "+brand);
				System.out.println("The cc is "+cc);
				System.out.println("The gears is "+gears);
				display();
			}
	}

