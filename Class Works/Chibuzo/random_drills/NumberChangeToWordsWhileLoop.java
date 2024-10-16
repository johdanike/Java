package random_drills;

import java.util.Scanner;

public class NumberChangeToWordsWhileLoop{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);

		int flag = 0;
		int number = 0;


		System.out.println("\nEnter number ranging between 1 - 10 and get the Word equivalent: ");

		while(number != flag){
			for(int iteration = 1; iteration <= 10; iteration++){
				number = input.nextInt();

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

				System.out.println("\nEnter number or 0 to end: ");
				number = input.nextInt();

			}

		}
				if(number == 0)System.out.print("Enter a valid number between 1 -10!");

	}
}