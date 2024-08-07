import java.util.Scanner;
import java.util.ArrayList;

public class CheckOutApp2{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
		System.out.print("Welcome to SemiColon Super Stores\n");
	
		ArrayList<String> productBought = new ArrayList<String>();
		ArrayList<Integer> numOfUnits = new ArrayList<Integer>();
		ArrayList<Double> howMuchPerUnits = new ArrayList<Double>();
		ArrayList<Double> pricePerProduct = new ArrayList<Double>();

		System.out.print("MAIN BRANCH\n");
		System.out.print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS\n");
		System.out.print("TEL: 03293828343\n");

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

		System.out.println("SEMICOLON STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
		System.out.println("TEL: 03293828343");
		System.out.println("DATE : 18-AUGUST-24  8:48:11pms");
		System.out.println("Cashier: "+cashiersName);
		System.out.println("Customer Name: "+customersName);
		System.out.println("\n=========================================================\n");
		System.out.printf("%22s%10s%10s%15s", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
		System.out.print("\n---------------------------------------------------------\n");

		//TABLE CONTENTS S.OUT
		for(int index = 0; index < productBought.size(); index++ ){ 
			double indeX = (double)index;
			System.out.printf("%n %20s %10d %10.2f %10.2f %n",productBought.get(index), numOfUnits.get(index), howMuchPerUnits.get(index), pricePerProduct.get(index));
			System.out.println();
		}
		

		System.out.print("\n---------------------------------------------------------\n");
		System.out.printf("%n%45s%.2f", "Sub Total: ", totalBeforeDiscount);	
		System.out.printf("%n%45s%.2f%n", "Discount: ",discountableAmount);
		System.out.printf("%45s%.2f%n", "VAT @ 17.50%: ",vat);
		System.out.println("\n=========================================================");	
		System.out.printf("%n%45s%.2f%n", "Bill Total: ", discount);
		System.out.println("\n=========================================================");
		System.out.printf("%n%45s%.2f%n", "THIS IS NOT A RECIEPT KINDLY PAY ", discount);
		System.out.println("\n=========================================================\n");
	

	System.out.println("How much did the customer give you?");
	double deposit = input.nextDouble();


	System.out.println("\nSEMICOLON STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
		System.out.println("TEL: 03293828343");
		System.out.println("DATE : 18-AUGUST-24  8:48:11pms");
		System.out.println("Cashier: "+cashiersName);
		System.out.println("Customer Name: "+customersName);
		System.out.println("\n=========================================================\n");
		System.out.printf("%20s%10s%10s%15s", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
		System.out.print("\n---------------------------------------------------------\n");

		//TABLE CONTENTS S.OUT
		for(int index = 0; index < productBought.size(); index++ ){ 
			double indeX = (double)index;
			System.out.printf("%n %20s %10d %10.2f %10.2f %n",productBought.get(index), numOfUnits.get(index), howMuchPerUnits.get(index), pricePerProduct.get(index));
			System.out.println();
		}
		

		System.out.print("\n---------------------------------------------------------\n");
		System.out.printf("%n%45s%.2f", "Sub Total: ", totalBeforeDiscount);	
		System.out.printf("%n%45s%.2f%n", "Discount: ",discountableAmount);
		System.out.printf("%45s%.2f%n", "VAT @ 17.50%: ",vat);
		System.out.println("\n=========================================================");	
		System.out.printf("%n%45s%.2f", "Bill Total: ", discount);
		System.out.printf("%n%45s%.2f%n", "Amount Paid: ", deposit);
		double balance = deposit - discount;
		System.out.printf("%45s%.2f%n", "Balance: ", balance);
		System.out.println("\n=========================================================");
		System.out.println("\n            THANK YOU FOR YOUR PATRONAGE        ");
		System.out.println("\n=========================================================\n");





 


	}



}



		


