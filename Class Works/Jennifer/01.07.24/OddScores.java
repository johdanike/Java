import java.util.Scanner;

public class OddScores{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int sum = 0;

		for(int indices = 1; indices <= 10; indices ++){
			System.out.printf("Enter the (%d) score: ", indices);
			int scores = input.nextInt();

			if(indices % 2 != 0) sum = sum + scores;			
		}
			System.out.printf("The sum of odd is = %d", sum);
	}
}