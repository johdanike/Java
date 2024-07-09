import java.util.Scanner;

public class BackToSenderLogistics{
	public static void main(String[]args){

	Scanner input = new Scanner(System.in);

		System.out.print("\nEnter Number OfDeliveries Made To Calculate Daily PAyment");



		int flag = -1;
		int userInput = 0;
		int calculatedPay = 0;
		final int basePay = 5000;
		

		while(userInput != -1){
			System.out.println("\nEnter number of delivery(s) or -1 to quit: ");
			userInput = input.nextInt();

			if(userInput >= 70)calculatedPay = userInput * (500) + basePay;
			if(userInput >= 60 && userInput <= 69)calculatedPay = userInput * (250) + basePay;
			if(userInput >= 50 && userInput <= 59)calculatedPay = userInput * (200) + basePay;
			if(userInput < 50)calculatedPay = userInput * (160) + basePay;


			if(userInput == -1)System.out.print("Program Successfully Exited!");
			else System.out.printf("\nThe pay for this rider that made %d deliveries is = %d", userInput, calculatedPay);

		}

	
	}
}

		