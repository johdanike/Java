import java.util.*;

public class SpecifiedSum{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);


	System.out.print("Enter firstinteger (or -1 to exit): ");
	int firstNum = input.nextInt();

	int number = 0;
	int sum = 0;

	while(sum <= firstNum){

		System.out.print("Enter integer: ");
		number = input.nextInt();

		sum = sum + number;	
	}

	System.out.printf("The sum of the numbers is: %d%n", sum);

	}
}