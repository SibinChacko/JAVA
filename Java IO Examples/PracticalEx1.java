package JavaIOExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalEx1 {
	public void checkSal() throws SalException, IOException
	{      
		    String name;
	        int salary = 0;
	        InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            
            System.out.println("Enter Name");
            
				name = br.readLine();
		System.out.println("Enter salarys");
            
				salary = Integer.parseInt(br.readLine());
			
            if(salary<0)
            {
            	throw new SalException("Not eligible for loan");
            }
            else if(salary>10000)
            {
            	System.out.println("You are eligible for loan of 100000");
            }
            else if(salary>50000)
            {
            	System.out.println("You are eligible for loan of 500000");
            }
            else if(salary>100000)
            {
            	System.out.println("You are eligible for loan of 1000000");
            }
            
	}
	public static void main(String[] args) throws IOException {  
		PracticalEx1 obj = new PracticalEx1();
	
	        try
	        {
	           obj.checkSal();
	        }
	        catch(SalException ex)
	        {
	            System.out.println(ex.getMessage());
	        }
	        
	}
	class SalException extends Exception 
	{
		SalException(String message)//here AgeException is the constructor of the class AgeException
		{
			super(message);
		}
	}

}

