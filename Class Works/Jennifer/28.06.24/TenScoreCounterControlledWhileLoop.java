import java.util.Scanner;

public class TenScoreCounterControlledWhileLoop{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);


	int counter = 1;
	double sum = 0;

		while(counter <= 10 ){
			System.out.printf("Enter the (%d) score: ", counter);
			double scores = input.nextDouble();

			sum = sum + scores;
			counter++;
		}
			
			System.out.println("\nThe sum of the ten scores = "+sum);
	}
}