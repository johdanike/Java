import java.util.Scanner;

public class FactorsOfNumbers{
	public static void main (String...args){
		Scanner input = new Scanner(System.in);

		System.out.println("Program prints the total number of the factors of any number entered ");

		
		int number = 0;
		int factors = 0;
		int counts = 0;

			System.out.println("\nEnter number: ");
			number = input.nextInt();

			for(int times = 2; times <= number/2; times++){
			//for(int times = 2; times <= number; times++){ 
				
				factors = number % times;
				if(factors == 0) counts++;

			}
				System.out.printf("%n%d has %d factors", number, counts);
	}
}