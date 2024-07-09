 import java.util.Scanner;

public class Palindrome2{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);


    while(true){
    System.out.print("Enter a five digit integer set: ");
    int fiveDigits = input.nextInt();

    int lastDigit = fiveDigits % 10;
    int firstDigit = fiveDigits / 10000;
    int secondDigit = (fiveDigits / 1000) % 10;
    int fourthDigit = (fiveDigits / 10) % 10;
     
    if (fiveDigits >= 10000 && fiveDigits <= 99999){
    }
    else{
        System.out.println("Wrong Input. Please enter a five digit number!");
    }

    if (lastDigit == firstDigit, secondDigit == fourthDigit){
	System.out.printf("%d is a palindrome", fiveDigits);
    }
    else{
        System.out.printf("%d is not a palindrome%n", fiveDigits);
        break;
    }
   }

  }
}