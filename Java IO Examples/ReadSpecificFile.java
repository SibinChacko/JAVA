package JavaIOExamples;

import java.io.File;
import java.io.FilenameFilter;

public class ReadSpecificFile {
	
	    public static void main(String a[])
		{
	        File fobj = new File("D:/harish/");
	    
	        String[] files = fobj.list
	        (
	            new FilenameFilter() 	
	            {
	                           @Override
	            public boolean accept(File dir, String name) {
	                if(name.toLowerCase().endsWith(".jpg")){
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });
	        for(String f:files){
	            System.out.println(f);
	        }
	    }
	}

