import java.util.Scanner;
public class SumOfIntegersNumbers{
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);

	int sum = 0;
	int number1 = 0;
	int number2 = 0;
	int end = 0;

	do{
		System.out.print(" Enter the first number of the sum: ");
		number1 = input.nextInt();
	
		System.out.print(" Enter the second number of the sum: ");
  		number2 = input.nextInt();
	
		sum = number1 + number2;
		System.out.printf(" The sum of the two integers is %d%n", sum);
	
		System.out.print("Enter any number to continue, and 0 to quit");
		end = input.nextInt();
	 
		}
		while(end!=0);
	}
}	
