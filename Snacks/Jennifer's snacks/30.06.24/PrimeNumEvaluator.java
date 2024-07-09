import java.util.Scanner;

public class PrimeNumEvaluator{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = input.nextInt();
	
		int primeNumber = 0;
		int count = 0;

		for(int times = 1; times <= number; times++){

			primeNumber = number % times;

			if(primeNumber == 0) count++;

		}
			if(count > 2)System.out.printf("%n%d is not a Prime number", number);
			else System.out.printf("%n%d is a Prime number", number);
	}
}