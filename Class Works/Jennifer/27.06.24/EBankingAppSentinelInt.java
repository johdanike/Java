import java.util.Scanner;

public class EBankingAppSentinelInt{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int flag = 0;
	int userInput = 0;
	
	System.out.print("Enter any number to continue or 0 to exit!");
	userInput = input.nextInt();

	while(userInput != flag){

		System.out.print("\nENTER ONE TO CONTINUE OR ANY NUMBER TO EXIT!!! ");
		int gatePass = input.nextInt();

		switch(gatePass){
			case 1: 

				System.out.println("Welcome to JohDi Coin... Please enter your name to continue: ");
				String welcome = input.next();

				System.out.printf("%s, Press Any Number To Get Started...%n", welcome);

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
				}break;
			case 2: 
				System.out.println("EXIT");
				break;
			default: 
				System.out.println("END APP.");
		}
		System.out.print("Do you wish to continue, press any number or zero to exit!");
		userInput = input.nextInt();
	}
	}
}