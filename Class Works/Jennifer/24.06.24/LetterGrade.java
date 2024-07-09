import java.util.Scanner;

public class LetterGrade{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int A = 80; int B = 70; int C = 60; int D = 50;



			System.out.print ("Enter score: ");
			int score = input.nextInt();
			
			if(score > A ){
				System.out.printf("Your score of %d is letter grade is 'A' ",score);
			}

			if(score >= B && score < A){
				System.out.printf("Your score of %d is letter grade is 'B' ",score);
			}

			if(score >= C && score < B){
				System.out.printf("Your score of %d is letter grade is 'C' ",score);
			}

			if(score < D){
				System.out.printf("Your score of %d is letter grade is 'D' ",score);
			}
	
		
	
	}
}


	

