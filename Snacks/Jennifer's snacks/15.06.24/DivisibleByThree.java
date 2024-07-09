
import java.util.Scanner;

public class DivisibleByThree{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);

		System.out.print("Enter integer: ");
		int integer = input.nextInt();
		
		int num = integer%10;

		if(num % 3 == 0){
		System.out.printf("%d is divisible by 3 and leaves no remainder", integer);
		}else{System.out.print("Number is not divisible by 3");}
		
			
	}
}