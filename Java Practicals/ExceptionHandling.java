package LAB;

public class ExceptionHandling {

	public static void main(String[] args) {
		try{
			int abc[]=new int [4];
			abc[5]=50/0;
		}
	    catch(ArithmeticException e)
		{
	    	System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
	    	System.out.println(e);
		}
		finally
		{
			System.out.println("Program ends here");
		}
	}
	

}
