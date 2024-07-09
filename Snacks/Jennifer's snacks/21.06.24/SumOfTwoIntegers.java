import java.util.Scanner;

public class SumOfTwoIntegers{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		int repeat = 1;
		int first = 0;
		int second = 0;
		int sum = 0;
		

		while(repeat!=0){
			for(int loop = 0; loop < 2; loop++){
				System.out.printf("Input the first integer: ");
				first = input.nextInt();
		
				System.out.printf("Input the second integer: ");
				second = input.nextInt();

				sum = first + second;
				System.out.printf("%nThe sum of %d and %d is: %d%n", first, second, sum );

		System.out.println("\nWish to repeat? If 'YES', press any number to continue(or 0 to quit)");
		repeat = input.nextInt();
		break;
			}

		}

	}
}