import java.util.Scanner;

public class BreakScores{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);


	int sum = 0;


		for(int indices = 1; indices <= 10; indices++){
			System.out.printf("Enter the (%d) score: ", indices);
			int scores = input.nextInt();
						
			if (indices == 7 ) break;
			sum = sum + scores;
		}

			System.out.println("\nThe sum of the even indices is = "+sum);
	}
}