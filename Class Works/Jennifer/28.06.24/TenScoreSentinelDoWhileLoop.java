import java.util.Scanner;

public class TenScoreSentinelDoWhileLoop{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int score = 0;
	int sum = 0;
	int flagValue = -1;

		do{
				
			//sum = sum + score;
			sum += score;

			System.out.print("Enter the score or -1 to quit: ");
			score = input.nextInt();

		}while(flagValue != score );
			
			System.out.println("\nThe sum of the scores = "+sum);

	}
}