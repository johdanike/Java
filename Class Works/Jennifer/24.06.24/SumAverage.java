import java.util.Scanner;

public class SumAverage{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	double score1, score2, score3, score4, score5, score6, score7, score8, score9, score10 = 0;

	double sum = 0;

	double average = 0;

		System.out.print ("Enter first score: ");
		score1 = input.nextDouble();

		System.out.print ("Enter second score: ");
		score2 = input.nextDouble();
	
		System.out.print ("Enter third score: ");
		score3 = input.nextDouble();

		System.out.print ("Enter fourth score: ");
		score4 = input.nextDouble();

		System.out.print ("Enter fifth score: ");
		score5 = input.nextDouble();

		System.out.print ("Enter sixth score: ");
		score6 = input.nextDouble();

		System.out.print ("Enter seventh score: ");
		score7 = input.nextDouble();

		System.out.print ("Enter eight score: ");
		score8 = input.nextDouble();

		System.out.print ("Enter ninth score: ");
		score9 = input.nextDouble();

		System.out.print ("Enter tenth score: ");
		score10 = input.nextDouble();


 	sum = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10;
	
	average = sum / 10;

	System.out.println("The average score is "+average);

	System.out.println("The sum of all scores is "+sum);
	
	}
}