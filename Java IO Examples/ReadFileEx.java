package JavaIOExamples;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileEx {
	public static void readfile()
	{
		try
		{
			FileReader fobj = new FileReader("E:\\NIIT\\AnnuSir.txt");
			char[] filedata = new char[10000];
			fobj.read(filedata);
			for(char c : filedata)
			{
				System.out.print(c);
			}
		
	}
	catch(IOException ee)
	{
		System.out.println(ee.getMessage());
	}
}
	public static void main(String[] args) {
		readfile();
		
	}
	
}
