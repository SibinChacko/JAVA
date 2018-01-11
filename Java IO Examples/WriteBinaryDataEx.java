package JavaIOExamples;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryDataEx {

	public static void main(String[] args) {
		String datafile = "E:\\NIIT\\bindata.txt";
		String bytedata = "This is the example of binary data file";
		byte[] buffer = bytedata.getBytes();
		
		 
		try
		{
			FileOutputStream fous = new FileOutputStream(datafile);
			fous.write(buffer);
			fous.close();
		}
	catch(IOException ee)
		{
		System.out.println(ee.getMessage());
		}
	
	}
	

}
