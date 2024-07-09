import java.util.Scanner;

public class LetterGradeSwitchCase{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);


	int score;
	System.out.print("ENTER SCORE: ");
	score = input.nextInt();


		switch(score){
			case 80: 
				System.out.printf("%nYour score of %d is graded 'A'", score);
				break;
			case 70: 
				System.out.printf("%nYour score of %d is graded 'B'", score);
				break;
			case 60: 
				System.out.printf("%nYour score of %d is graded 'C'", score);
				break;
			case 50: 
				System.out.printf("%nYour score of %d is graded 'D'", score);
				break;
			case 40: 
				System.out.printf("%nYour score of %d is graded 'E'", score);
				break;
			case 30: 
				System.out.printf("%nYour score of %d is graded 'F'", score);
				break;
			case 20: 
				System.out.printf("%nYour score of %d is graded 'FAIL WITHOUT REDEMPTION'", score);
				break;
		}

	}
}