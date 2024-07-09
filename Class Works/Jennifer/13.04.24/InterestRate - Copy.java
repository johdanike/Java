import java.util.Scanner;

public class InterestRate{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter balance due: ");
		double balanceDue = input.nextDouble();

		System.out.print("Enter percentage interest rate: ");
		double percentIntRateUser = input.nextDouble();

		double monthlyIntRate = balanceDue * (percentIntRateUser / 1200);

		System.out.printf("Your interest rate for next month is: %f", monthlyIntRate);
		

		
		
		
	}
}