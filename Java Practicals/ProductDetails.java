package LAB;

import java.util.Scanner;

public class ProductDetails {

	public static void main(String[] args) {
		String ProdId,ProdName;
		int ProdPrice,ProdQuant,Total;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Product ID");
		ProdId =s.next();
		System.out.println("Enter the Product Name");
		ProdName=s.next();
		System.out.println("Enter the Product Price");
		ProdPrice=s.nextInt();
		System.out.println("Enter the Product Quantity");
		ProdQuant=s.nextInt();
		Total=ProdPrice*ProdQuant;
		System.out.println("The total amount to be paid by customer is "+Total);
	}

}
