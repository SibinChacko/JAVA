package JavaIOExamples;

import java.io.File;

public class ReadFileFromDirectory {
	
	
	    public static void main(String[] aa)
	    {
	        File fobj = new File("D:/Test/");
	        String[] filelist = fobj.list();
	        
	        for(String name:filelist)
	        {
	            System.out.println(name);
	        }
	    }
	}


