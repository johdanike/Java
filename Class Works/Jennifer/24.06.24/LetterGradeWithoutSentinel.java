import java.util.Scanner;

public class LetterGradeWithoutSentinel{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int counter = 1;

	while(counter<=5){
 
		System.out.println("Enter score: ");
		double score = input.nextDouble();

			if(score > 80){
				System.out.printf("Your score of %.0f is letter graded as 'A'", score);
			}else

			if(score >= 70 && score < 79){
				System.out.printf("Your score of %.0f is letter graded as 'B'", score);
			}else 

			if(score >= 50 && score < 69){
				System.out.printf("Your score of %.0f is letter graded as 'C'", score);
			}

			if(score <= 49){
				System.out.printf("Your score of %.0f is letter graded as 'D'", score);
			}
		counter = counter + 1;

		}
	}
}