package random_drills;

import java.util.Scanner;

public class NumberChangeToWordsSentinel{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);

		int number = 0;


		System.out.println("\nEnter number ranging between 1 - 10 and get the Word equivalent ");

		do{

				if(number == 1)System.out.print("ONE");
				if(number == 2) System.out.print("TWO");
				if(number == 3) System.out.print("THREE");
				if(number == 4) System.out.print("FOUR");
				if(number == 5) System.out.print("FIVE");
				if(number == 6) System.out.print("SIX");
				if(number == 7) System.out.print("SEVEN");
				if(number == 8) System.out.print("EIGHT");
				if(number == 9) System.out.print("NINE");
				if(number == 10) System.out.print("TEN");				
				if(number > 10)System.out.print("Enter a valid number between 1 -10!");

				System.out.println("\nEnter number or 0 to end: ");
				number = input.nextInt();



		}while(number != 0);

				if(number == 0)System.out.print("Thanks for using; Program Terminated!!! ");

	}
}