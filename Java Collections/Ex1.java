package JavaCollectionsEx;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class Ex1 {

	public static void main(String[] args) {
		HashMap <Integer,String> CustDetails = new HashMap<Integer,String>();
		CustDetails.put(1001,"Sibin");
		CustDetails.put(1002,"Rebin");
		CustDetails.put(1003,"Melvin");
		CustDetails.put(1004,"Merin");
		CustDetails.put(1005,"Ammu");
		CustDetails.put(1006,"Robin");
		CustDetails.put(1007,"Mekha");
		
		Set set = CustDetails.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry mapentry = (Map.Entry)itr.next();
			System.out.println(CustDetails.get(1004));
			
			System.out.println("Key is: "+mapentry.getKey());
			System.out.println("Value is: "+mapentry.getValue());
			
		}
		CustDetails.remove(1007);
		
		
		
   /*Set seta = CustDetails.entrySet();
		
		Iterator itra = seta.iterator();
		
		while(itra.hasNext())
		{
			Map.Entry mapentry = (Map.Entry)itr.next();
			
			System.out.println("Key is: "+mapentry.getKey());
			System.out.println("Value is: "+mapentry.getValue());
		}*/
	}

}


