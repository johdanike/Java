import java.util.Scanner;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class CheckOutApp{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
		System.out.print("Welcome to SemiColon Super Stores");
	
		ArrayList<String> productBought = new ArrayList<String>();
		ArrayList<Integer> numOfUnits = new ArrayList<Integer>();
		ArrayList<Integer> howMuchPerUnits = new ArrayList<Integer>();

		System.out.print("\n\nMAIN BRANCH");
		System.out.println("\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
		System.out.println("TEL: 03293828343");

		String gatePass = "";
		while (!(gatePass.equalsIgnoreCase("no"))){
			String product = collectItemBought();
			productBought.add(product);
			String noUnits = howManyPiecesWasBought();
			numOfUnits.add(noUnits);
			int pricePerUnit = howMuchPerUnit();
			howMuchPerUnits.add(pricePerUnit);
			System.out.println("Add more item?");
			gatePass = input.next(gatePass);
		}



	}

	public static String collectItemBought(){
		System.out.println("What did the user buy? ");
		return input.next();

	}
	
	public static int howManyPiecesWasBought(){
		System.out.println("How many pieces?");
		return input.nextInt();
	}

	public static double howMuchPerUnit(){
		System.out.println("How much per unit?");
		return input.nextDouble();
	}



}