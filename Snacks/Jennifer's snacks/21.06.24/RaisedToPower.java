import java.util.Scanner;

public class RaisedToPower{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);


		int userInput = 0;
		int num1 = 0;
		int num2 = 0;
		//int stop = 0;

		for(int number = 1; number > num2; number++){
			System.out.printf("Enter your (%d) integers: ", userInput);
			userInput = input.nextInt();

			while(userInput > number){
				System.out.println("Please enter only 2 numbers (or exit)");

				System.out.printf("%nEnter your (%d) integers: ", userInput);
				userInput = input.nextInt();
			}


			if(number == 1)num1=userInput;
			if(number == 2)num2=userInput;

			for(int raised = 1; raised >= userInput; raised++){
			int result = num1 *= raised;
			System.out.printf("%d raised to %d equals %d", num1, num2, result);
			}

		}
	}
}