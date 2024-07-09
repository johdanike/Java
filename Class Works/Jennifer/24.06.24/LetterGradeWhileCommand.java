import java.util.Scanner;

public class LetterGradeWhileCommand{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.println("\nEnter score or -1 to quit: ");
	double score = input.nextDouble();
		
	while(score != -1){
			if(score > 80){
				System.out.printf("Your score of %.0f is letter graded as 'A'", score);
			}else

			if(score >= 70 && score < 79){
				System.out.printf("Your score of %.0f is letter graded as 'B'", score);
			}else 

			if(score >= 50 && score < 69){
				System.out.printf("Your score of %.0f is letter graded as 'C'", score);
			}else
		
			if(score <= 49){
				System.out.printf("Your score of %.0f is letter graded as 'D'", score);
			}

		}
	}
}