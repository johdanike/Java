import java.util.Scanner;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class CheckOutApp2{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
		System.out.print("Welcome to SemiColon Super Stores");
	
		ArrayList<String> productBought = new ArrayList<String>();
		ArrayList<Integer> numOfUnits = new ArrayList<Integer>();
		ArrayList<Double> howMuchPerUnits = new ArrayList<Double>();

		System.out.print("\n\nMAIN BRANCH");
		System.out.println("\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
		System.out.println("TEL: 03293828343");

		String pass = "";

		System.out.println("What is the customer's name?");
		
		double total = 0.0;
		double discount =0;
		double discountableAmount = 0;
		double subTotal = 0;
		final double VAT = 7.5 / 100;

		System.out.println("What did the user buy? ");
			productBought.add(input.next());

			System.out.println("How many pieces?");
			int pieces = input.nextInt();
			numOfUnits.add(pieces);

			System.out.println("How much per unit?");
			double price = input.nextDouble();
			howMuchPerUnits.add(price);
			System.out.print(howMuchPerUnits);
			
			System.out.println("Add more Items?");
			pass = input.next();

			System.out.println(price);
		while(!pass.equalsIgnoreCase("no")){

			System.out.println("What did the user buy? ");
			productBought.add(input.next());
			

			System.out.println("How many pieces?");
			pieces = input.nextInt();
			numOfUnits.add(pieces);

			System.out.println("How much per unit?");
			price = input.nextDouble();
			howMuchPerUnits.add(price);
			System.out.println(price);
			
			System.out.println("Add more Items?");
			pass = input.next();
			
		}

			//System.out.print(howMuchPerUnits);
			
			for(int index = 0; index < productBought.size(); index++){	
			double amount = 0;
				total = numOfUnits.get(index) * howMuchPerUnits.get(index);
				//howMuchPerUnits.add(amount);
			}



			System.out.print("\nWhat is your name?");
			String cashiersName = input.next();

			System.out.println("How much discount will he get?");
			int discountRate = input.nextInt();
				
			//for(int index = 0; index < numOfUnits.size(); index++){
			//	total += howMuchPerUnits.get(index); 
			//}

			System.out.print(total);

			discountableAmount = total - ((discountRate * 0.01) * total);
			System.out.println(discountableAmount);

			//discount = total - discountableAmount;
			System.out.println("Discount: "+discountableAmount);
			System.out.print(total);

		
			

			

			
			
			

			
		

 


	}



}



		


