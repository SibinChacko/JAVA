package LAB;

public class EvenNoFrom1to100 {

	public static void main(String[] args) {
		int counter,num=0;
		for(counter=1;counter<=100;counter++)
		{
			if(counter%2==0)
			{
				num=counter;
			}
			System.out.println("Even nos from 1 to 100 are"+num);
		}
	
		

	}

}
