package random_drills;

import java.util.Scanner;

public class FactorsOfNumbers2{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Program prints the total number of the factors of any number entered ");

		
		int number = 0;

			System.out.println("\nEnter number: ");
			number = input.nextInt();


		do{
			for(int times = 1; times > 1; times++){


					for(int counts = 1; counts == times; counts++){
			
						if(number % times == 0)System.out.printf("%n%d has %d factors", number, counts);

					}		
			}

		}while(number != 0);
			
			System.out.println("Enter a valid number, Program Terminated");

	}
}