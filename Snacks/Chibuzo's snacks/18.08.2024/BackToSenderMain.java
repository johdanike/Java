import java.util.Scanner;

public class BackToSenderMain{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

		int flag = -1;
		int userInput = 0;


		System.out.print("\nEnter Number OfDeliveries Made To Calculate Daily Payment");

		while(userInput != -1){
			System.out.println("\nEnter number of delivery(s) or -1 to quit: ");
			userInput = input.nextInt();

			if(userInput == -1)System.out.print("Program Successfully Exited!");

			int riderCommission = BackToSenderFunction.payCheck(userInput);
			System.out.printf("\nThe pay for this rider that made %d is = %d", userInput, riderCommission);
		
		}

	
	}
}

		