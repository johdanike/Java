import java.util.Scanner;


public class CreditCardValidator{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
		System.out.print("WELCOME TO JOHDAN'S CREDIT CARD VALIDITY CHECKER\n");
		System.out.print("Hello kindly enter your credit card details to verify: ");
		String cardNum = input.next();

		if(validate(cardNum))System.out.println("Invalid - Check number and try again");
		else {
			String cardType = getCategory(cardNum);
			double total = addTotal1Total2(cardNum);
			System.out.println("*****************************************");
			System.out.println("**Credit Card Type: "+cardType);
			System.out.println("**Credit Card Number: "+cardNum);
			System.out.println("**Credit Card Digit Length: "+cardNum.length());
			String stage5 = validityChecker(cardNum);
			System.out.println("**Credit Card Validity Status: "+stage5);
			System.out.println("*****************************************");
			//System.out.println("**Total: "+total);
			double one = secondDigitRightToLeft(cardNum);
			System.out.println("First: "+one);
			double two = firstDigitRightToLeft(cardNum);
			System.out.println("Second: "+two);
			System.out.println("**Total: "+total);

		}
	}

	private static boolean validate(String cardNum){
		return cardNum.length() < 13 || cardNum.length() > 16;
	}

	public static String getCategory(String cardNum){
		String category = "";
		if(cardNum.charAt(0) == '4')category =  "Visa Card";
		else if(cardNum.charAt(0) == '5')category =  " MasterCard";
		else if(cardNum.charAt(0) == '3'  && cardNum.charAt(1) == '7')category =  "American Express Card";
		else if(cardNum.charAt(0) == '6')category =  "Discover cards";
		else category =  "Invalid card type";
		return category;
	}


	public static double secondDigitRightToLeft(String cardNum){
		double total1 = 0;
		for(int index = cardNum.length()-2; index >= 0; index-=2){
			int number = Integer.parseInt(String.valueOf(cardNum.charAt(index)));
			number= number * 2;
			if(number > 9)number = number/10 + number%10;
			total1 += number;
			number = 0;
		}
			return total1;
	}

	public static double firstDigitRightToLeft(String cardNum){
		double total2 = 0;
		for(int index = cardNum.length()-1; index >= 0; index-=2){
			int number = Integer.parseInt(String.valueOf(cardNum.charAt(index)));
			total2 += number;
			number = 0;
		}
			return total2;
	}
	
	public static double addTotal1Total2(String cardNum){
		double sum = secondDigitRightToLeft(cardNum) + firstDigitRightToLeft(cardNum);
		return sum;
	}

	public static String validityChecker(String cardNum){
		String checker = "";
			if(addTotal1Total2(cardNum) % 10 ==0)checker = "Valid";
			else checker = "Invalid";
			return checker;
	}





}