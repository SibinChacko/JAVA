package JavaIOExamples;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadFromAndWriteTo {
	
	
	        static final String filePath = "E:\\NIIT\\AnnuSir.txt";
	       // static final String filePath1 = "E:\\NIIT\\bindata.txt";
	        public static void main(String[] args) 
	        {
	            try 
	            {
	                System.out.println(new String(readFromFile(filePath, 425, 23)));
	        
	                writeToFile(filePath, "ew Scanner(System.in);", 2);

	            } 
	            catch (IOException e) 
	            {    
	                e.printStackTrace();
	            }
	        }

	           private static byte[] readFromFile(String filePath, int position, int size) throws IOException
	            {
	                        RandomAccessFile file = new RandomAccessFile(filePath, "r");
	                        file.seek(position);
	                        byte[] bytes = new byte[size];

	                        file.read(bytes);
	                        file.close();

	                        return bytes;
	            }

	            private static void writeToFile(String filePath, String data, int position) throws IOException
	            {
	                       RandomAccessFile file = new RandomAccessFile(filePath, "rw");
	                       file.seek(position);
	                        file.write(data.getBytes());
	                        file.close();
	            }
	}


