package LAB;

import java.util.Scanner;

public class DoWhileProb {

	public static void main(String[] args) {
		String MovieId,MovieName,ActorName,DirectorName,Language;
		int Rating,Duration,Year,Income,Count=0,n,TotalIncome=0,RatingCount=0,i,Cot1=0,Cot2=0,Cot3=0,durcount=0,Dircount=0;
		
		System.out.println("Enter the total number of movies");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<n;i++){
			System.out.println("Enter the Movie id");
			MovieId=s.next();
			System.out.println("Enter the Movie name");
			MovieName=s.next();
			System.out.println("Enter the Actor name");
			ActorName=s.next();
			System.out.println("Enter the Director name");
			DirectorName=s.next();
			System.out.println("Enter the language");
			Language=s.next();
			System.out.println("Enter the Rating");
			Rating=s.nextInt();
			System.out.println("Enter the Duration");
			Duration=s.nextInt();
			System.out.println("Enter the year");
			Year=s.nextInt();
			System.out.println("Enter the Movie income");
			Income=s.nextInt();
			Count++;
			TotalIncome=TotalIncome+Income;
			if(Rating>=4){
				RatingCount++;
				
		}
			if(Language.equals("hindi"))
			{
				Cot1++;
				
			}
			
			 if(Language.equals("english"))
		 {
			 Cot2=Cot2+1;
			
	     }
		 
			if(Language.equals("chinese"))
			{
				Cot3=Cot3+1;
				
			}
		 
			if(Duration>=1.5){
				durcount++;
				
				
			}
			
			if(DirectorName.equals("JohnD"))
			{
				Dircount=Dircount+1;
				
				
			}
	
		}
		
		System.out.println("The total number of movies is"+Count);
		System.out.println("The total income of movies is"+TotalIncome);
		System.out.println("The total number of movies with Dirctor John D is"+Dircount);
		System.out.println("The total number of movies with language Hindi is"+Cot1);	
		System.out.println("The total number of movies with language English is"+Cot2);	
		System.out.println("The total number of movies with language Chinese is"+Cot3);
		System.out.println("The total number of movies with Duration greater than 1.5 is"+durcount);
		System.out.println("The total number of movies with Rating greater than 4 is"+RatingCount);
	}
	
	

	}


