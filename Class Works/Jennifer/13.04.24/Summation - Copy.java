import java.util.Scanner;

public class Summation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter integer: ");
		int num = input.nextInt();
		
		int firstDigit = num / 10 % 10;
		int lastDigit = num / 100 % 10;
		int middleDigit = num % 10;
		
		int sum = firstDigit + lastDigit + middleDigit;

		if(num>0 && num>1000){
			System.out.print("Entyer a valid number!");
		}else{System.out.print(sum);}
		
	}		

	
}
