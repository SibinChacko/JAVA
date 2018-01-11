package LAB;

import java.util.Scanner;

public class ArrayEvenNumber {

	public static void main(String[] args) {
    int n = 0,num=0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements you want ");
		
		n=s.nextInt();
		int a[]=new int [n];
		int b[] =new int[50];		
		int c[] =new int[50];
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the elements ");
		a[i]=s.nextInt();
          if( a[i]%2==0){
        	 
        	   b[i]=a[i];
        	  }
          else{
        	  c[i]=a[i];
          }
         
		} 
		for(int i=0;i<n;i++){
		 System.out.println("The even elements are "+b[i]);
		 
}for(int i=0;i<n;i++){
	 System.out.println("The odd elements are "+c[i]);
	 
}

	
	}
}

