import java.util.Scanner;
import java.util.*;

public class RaisedUpTo{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);


	int raised = 1;
	int num1 = 0;
	int num2 = 0;
			System.out.print("Enter first number: ");
			num1 = input.nextInt();

			System.out.print("Enter second number: ");
			num2 = input.nextInt();

			
			for(int assist = 0; assist < num2; assist++){
				raised *= num2;
			}
				System.out.printf("%d raised to power %d is: %d%n", num1, num2, raised);

	}
}