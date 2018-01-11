package JavaIOExamples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileEx {

	public static void main(String[] args) {
		String fname = "E:\\NIIT\\WriteToFileEx";
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try
		{
			fw = new FileWriter(fname);
			bw = new BufferedWriter(fw);
			bw.write("This is my first line using JAVA Programming\t");
			bw.write("This is my second line using JAVA Programming  \n");
			bw.write("This is my third line using JAVA Programming  \n");
			bw.write("This is my fourth line using JAVA Programming  \n");
			bw.write("This is my fifth line using JAVA Programming  \n");
			bw.write("This is my sixth line using JAVA Programming  \t");
			bw.write("This is my seventh line using JAVA Programming  ");
			
			bw.close();
			fw.close();
		}
        catch(IOException ee)
		{
        	System.out.println(ee.getMessage());
		}
	}

}
