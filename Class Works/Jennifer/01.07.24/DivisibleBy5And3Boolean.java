import java.util.Scanner;

public class DivisibleBy5And3Boolean{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = input.nextInt();

		if(number % 5 == 0 & number % 3 == 0)System.out.printf("%d is divisible by 5 and 3", number);
		else System.out.printf("%d is not divisible by 5 nor 3", number);



	}
}