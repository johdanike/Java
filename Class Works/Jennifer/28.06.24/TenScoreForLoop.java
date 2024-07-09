import java.util.Scanner;

public class TenScoreForLoop{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);


	double sum = 0;

		for(int counter = 1; counter <= 10; counter++){
			System.out.printf("Enter the (%d) score: ", counter);
			double scores = input.nextDouble();

			sum = sum + scores;
		}
			
			System.out.println("\nThe sum of the ten scores = "+sum);
	}
}