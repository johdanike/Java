import java.util.Scanner;

public class PalindromeSet{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);

		System.out.print("Enter integer set: ");
		int integerSet = input.nextInt();
		
		int lastNum = integerSet%10;
		int reverse = integerSet/100;

		if(lastNum == reverse){
		System.out.print("Number is palindrome");
		}else{System.out.print("Number is not palindrome");}
		
			
	}
}