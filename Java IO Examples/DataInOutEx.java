package JavaIOExamples;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataInOutEx {

	public static void main(String[] args) {
		float[] prices = {19.99f,9.99f};
		int[] units = {12,8};
		String[] descriptions = {"Test 1","Test 2"};
		float total = 0;
		
		try
		{   
			FileOutputStream fobj new FileOutputStream("E:\\NIIT\\testdata.txt");
			DataOutputStream doobj = new DataOutputStream(fobj);
			for(int i=0;i<prices.length;i++)
			{
				doobj.writeFloat(prices[i]);
				doobj.writeChar('\t');
                
				doobj.writeFloat(units[i]);
				doobj.writeChar('\t');
				
				doobj.writeUTF(descriptions[i]);
				doobj.writeChar('\t');
			}
			DataOutputStream doibj = new DataOutputStream(fobj);
			for(int i=0;i<prices.length;i++)
			{
				Float prices = doibj.readFloat();
				doibj.readChar();
			}
		}

	}

}
