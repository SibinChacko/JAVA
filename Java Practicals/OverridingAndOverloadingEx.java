package LAB;

public class OverridingAndOverloadingEx {

	public static void main(String[] args) 
	{
	         circle cobj= new circle();
				cobj.area();
				cobj.draw(2);
				rectangle robj=new rectangle();
				robj.area();
				robj.draw(4,5);
				}
}
		class Shape
		{
		   public void draw()
			{
				System.out.println("Method used to draw various shape");
			}
		   public void area(){
			   System.out.println("Method used to calculate area");
		   }
		}
		class circle extends Shape
		{
			public void draw(int radius)
			{
				System.out.println("Circle is getting created with r");
				System.out.println("Method used to draw various shape");
			}
			public void area()
			{
				int r=2;
				float PI,Area;
				PI=3.14f;
				Area = r*r*PI;
				System.out.println("It is used to calculate the area");
			}
		}
		class rectangle extends Shape
		{
			public void draw (int height,int width)
			{
				System.out.println("Rectangle is created with this height and width");
				System.out.println("Method is used to draw various shape");
			}
			public void area()
			{
				int height=2;
				int width=3;
				int area;
				area=height*width;
				System.out.println("It is used to calculate the area");
				
			}
		}

	


