import java.util.Scanner;

public class DoWhile{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);


	int sum = 0;
	int flag = 0;


		do{
			System.out.printf("Enter -1 to quit or score: ");
			int scores = input.nextInt();
					
			if (scores % 2 == 0 ) sum = sum + scores;

		}while(flag != scores);

			System.out.println("\nThe sum of the even indices is = "+sum);
	}
}