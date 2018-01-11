package LAB;

public class ConstructorAreaOfRectangle {

	public  ConstructorAreaOfRectangle(int length,int breadth){      //parametrized constructor created
		int l,b;
		double area;
		l=length;
		b=breadth;
		area=l*b;
		System.out.println("The area of rectangle is "+area);
		
	}
	
	public static void main(String[] args) {
		
		ConstructorAreaOfRectangle obj=new ConstructorAreaOfRectangle(5,6);   //when object created the constructor is called itself.
	}

}
