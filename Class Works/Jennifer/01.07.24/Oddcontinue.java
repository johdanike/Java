import java.util.Scanner;

public class OddContinue{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int sum = 0;
		for(int indice = 1; indice <=10; indice++){
			System.out.print("Enter the value of your score: ");
			int score = input.nextInt();

			if(indice % 2 == 0) continue;
		        sum = sum + score;
			
		}

			System.out.printf("The value of the score is : %d",sum);
	}
}