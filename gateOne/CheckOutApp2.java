import java.util.Scanner;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class CheckOutApp2{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
		System.out.print("Welcome to SemiColon Super Stores");
	
		ArrayList<String> customersName = new ArrayList<String>();
		ArrayList<String> productBought = new ArrayList<String>();
		ArrayList<Integer> numOfUnits = new ArrayList<Integer>();
		ArrayList<Double> howMuchPerUnits = new ArrayList<Double>();
		ArrayList<Double> pricePerProduct = new ArrayList<Double>();

		System.out.print("\n\nMAIN BRANCH");
		System.out.println("\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
		System.out.println("TEL: 03293828343");

		String pass = "";

		System.out.println("What is the customer's name?");
		customersName.add(input.next());
		
		double total = 0.0;
		double discount =0;
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

			System.out.print(howMuchPerUnits);
			
			double amount = 0;
			for(int index = 0; index < productBought.size(); index++){	
				amount = numOfUnits(index) * howMuchPerUnits(index);
				howMuchPerUnits.size() += amount;

			}

			System.out.print(howMuchPerUnits);


		

 


	}



}



		


