package LAB;

import java.util.Scanner;

public class PassPercentage {

	public static void main(String[] args) {
		double sub1,sub2,sub3,sum,percent;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks of three subjects");

		sub1=s.nextFloat();
		sub2=s.nextFloat();
		sub3=s.nextFloat();
		sum=sub1+sub2+sub3;
		percent=sum*0.3;
		if(percent>=50){
			System.out.println("The students has Passed");
		}
		else{
			System.out.println("The students has Failed");
	}

}
}