import java.util.Scanner;
public class SumOfIntegers{
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);

	int sum = 0;
	int number1 = 0;
	int number2 = 0;
	String end = "";

	do{

		System.out.print(" Enter the first number of the sum: ");
		number1 = input.nextInt();
	
		System.out.print(" Enter the second number of the sum: ");
  		number2 = input.nextInt();
	
		sum = number1 + number2;
		System.out.printf(" The sum of the two integers is %d%n", sum);
	
		System.out.print("Enter 'yes' to continue and 'no' to quit ");
		end = input.next();
	}

		while(!end.equals("no"));
    }	
}