package LAB;

import java.util.Scanner;

public class LargestNumberEntered {

	public static void main(String[] args) {
		int num,largest=0,i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers");
		 for(i=0;i<=5;i++){
			 num=s.nextInt();
		    	if(num>largest){
		    		largest=num;
		    	}
		    }System.out.println("The largest is "+largest);
	}
	
}
