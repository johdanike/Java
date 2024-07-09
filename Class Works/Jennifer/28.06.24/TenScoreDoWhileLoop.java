import java.util.Scanner;

public class TenScoreDoWhileLoop{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int counter = 1;
	int sum = 0;

		System.out.print("This is a Ten Score Do-While Loop Test!\n");

		do{
			System.out.printf("Enter the (%d) score: ", counter);
			int scores = input.nextInt();

			sum = sum + scores;
			counter++;
		}while(counter <= 10 );

			System.out.println("\nThe sum of the ten scores = "+sum);
	

	}
}