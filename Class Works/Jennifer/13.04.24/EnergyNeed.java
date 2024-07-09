import java.util.Scanner;

public class EnergyNeed{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Amount of water in Kg: ");
		double amountWater = input.nextDouble();

		System.out.print("Enter initial temperature");
		double temp1 = input.nextDouble();

		System.out.print("Enter final temperature");
		double temp2 = input.nextDouble();
		
		double minus = temp2 - temp1;
		int constant = 4184;
		double energy = amountWater * minus * constant;
		System.out.printf("The Energy needed is %f", energy);
		
	}
}