import java.util.Scanner;

public class EBankingApp{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.println("Press Any Number To Get Started...");
	String inputs = """
			    1: Transfer
			    2: Buy Airtime 
			    3: Buy Data
			    4: Share Data
			    #: Go Back
					""";
	System.out.println(inputs);


	System.out.print("Enter number: ");
	String value = input.next();

	switch(value){
		case "1": System.out.print("Transfer");
			break;
		case "2": System.out.print("Buy Airtime");
			break;
		case "3": System.out.print("Buy Data");
			break;
		case "4": System.out.print("Share Data");
			break;
		case "#": System.out.print("Go Back");
			break;
		default: System.out.print("Invalid");
		}	

	}
}