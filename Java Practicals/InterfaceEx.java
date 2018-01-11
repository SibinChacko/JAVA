package LAB;

public class InterfaceEx {

	public static void main(String[] args) 
	{
		child obj = new child();
		obj.messageshow("rebin");
		obj.calc(5, 6);
		obj.display("ammu");
		}
}
    abstract class myclass
    {
    	public abstract void display(String msg2);
    	
    }
 class child extends myclass implements newdemo,olddemo
 {
	 public void display(String msg)//overriding the abstract method "display" of myclass
	 {
		 System.out.println(msg);
	 }
 public void calc(int x,int y)//overriding the abstract method "calc" of interface newdemo
 {
 int c=x+y;
 System.out.println(c);
 }
 public void messageshow(String msg1)//overriding the abstract method "messageshow" of interface olddemo
 {
	 System.out.println(msg1);
 }
 }

