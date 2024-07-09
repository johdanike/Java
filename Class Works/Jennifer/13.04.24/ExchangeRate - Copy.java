import java.util.Scanner;

public class ExchangeRate{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter exchange rate: ");
		double exchangeRate = input.nextDouble();

		System.out.print("%nEnter 0 to converts to Dollars to RMB or  1 for vise versa: ");
		int access = input.nextInt();

		if(access == 0){
		System.out.print("Enter the Dollar amount: ");
		double amount = input.nextDouble();
		double rmbAmount = amount * exchangeRate;

		System.out.printf("$%.1f is %.1fRMB", amount, rmbAmount);
		}else{System.out.print("Please Select one");}

		if(access==1){
		System.out.print("Enter RMB amount: ");
		double amount = input.nextDouble();
		double dollarAmount = amount * exchangeRate;

		System.out.printf("%.1fRMB is $%.1f", amount, dollarAmount);
		}else{System.out.print("Please Select one");}
		

		
		
		
	}
}