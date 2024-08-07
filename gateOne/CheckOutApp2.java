import java.util.Scanner;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class CheckOutApp2{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
		System.out.print("Welcome to SemiColon Super Stores");
	
		//ArrayList<String> customersName = new ArrayList<String>();
		ArrayList<String> productBought = new ArrayList<String>();
		ArrayList<Integer> numOfUnits = new ArrayList<Integer>();
		ArrayList<Double> howMuchPerUnits = new ArrayList<Double>();
		ArrayList<Double> pricePerProduct = new ArrayList<Double>();

		System.out.print("\n\nMAIN BRANCH");
		System.out.println("\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
		System.out.println("TEL: 03293828343");

		String pass = "";

		System.out.println("What is the customer's name?");
		String customersName = input.next();
		
		double total = 0.0;
		double totalBeforeDiscount = 0;
		double discount =0;
		double discountableAmount = 0;
		double subTotal = 0;
		final double VAT = 7.5 / 100;


	
		while(!(pass.equalsIgnoreCase("no"))){

			System.out.println("What did the user buy? ");
			productBought.add(input.next());

			System.out.println("How many pieces?");
			numOfUnits.add(input.nextInt());

			System.out.println("How much per unit?");
			howMuchPerUnits.add(input.nextDouble());
			
			System.out.println("Add more Items?");
			pass = input.next();
			
		}
		for(int index = 0; index < productBought.size(); index++){	
		double amount = 0;
			total = numOfUnits.get(index) * howMuchPerUnits.get(index);
			pricePerProduct.add(total);
		}

		System.out.print("\nWhat is your name?");
		String cashiersName = input.next();

		System.out.println("How much discount will he get?");
		int discountRate = input.nextInt();
		double rate = (double)discountRate / 100;
		
		System.out.print(howMuchPerUnits);
		System.out.print(pricePerProduct);
		for(int index=0; index < productBought.size(); index++){
			totalBeforeDiscount += pricePerProduct.get(index);
		}
		discountableAmount = rate * totalBeforeDiscount;
		double vat = (17.50/100) * totalBeforeDiscount;		
		discount = (totalBeforeDiscount - discountableAmount) + vat;

		System.out.println("\nSEMICOLON STORES");
		System.out.println("\nMAIN BRANCH");
		System.out.println("\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
		System.out.println("\nTEL: 03293828343");
		System.out.println("\nDATE : 18-AUGUST-24  8:48:11pm");
		System.out.println("\nCashier: "+cashiersName);
		System.out.println("\nCustomer Name: "+customersName);
		System.out.println("\n=======================================================\n");
		System.out.printf("%20s%10s%10s%15s", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
		System.out.print("\n-------------------------------------------------------\n");

		//TABLE CONTENTS S.OUT
		for(int index = 0; index <productBought.size(); index++ ){
			System.out.printf("%20s%10d%.2f",productBought.get(index),numOfUnits.get(index),howMuchPerUnits.get(index) );
		}
		

		System.out.print("\n-------------------------------------------------------\n");
		System.out.printf("%n%60s%.2f", "Sub Total: ", totalBeforeDiscount);	
		System.out.printf("%n%60s%.2f", "Discount: ",discountableAmount);
		System.out.printf("%n%60s%.2f", "VAT @ 17.50%: ",vat);
		System.out.println("\n=======================================================\n");	
		System.out.printf("%n%60s%.2f", "Bill Total: ", discount);
		System.out.println("\n=======================================================\n");
		System.out.printf("%n%60s%.2f", "THIS IS NOT A RECIEPT KINDLY PAY ", discount);
		System.out.println("\n=======================================================\n");
	
 


	}



}



		


