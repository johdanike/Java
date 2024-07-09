import java.util.Scanner;

public class KataValidator{
	public static void mainMenu(){

	Scanner input = new Scanner(System.in);

		

		String gatePass = """
			\n\nSELECT FUNCTION:

			1: FUNCTION THAT CHECKS IF AN INTEGER IS EVEN
			2: FUNCTION THAT TAKES AN INTEGER AND CHECKS IF IT'S A PRIME NUMBER
			3: FUNCTION THAT TAKES TWO INTEGERS AND FINDS THE DIFFERENCE & ALSO RETURNS AN ABSOLUTE
			4: FUNCTION THAT TAKES TWO INTEGERS AND RETURNS THE QUOTIENT APPROXIMATED TO 2 DECIMAL PLACE
			5: FUNCTION THAT CHECKS FOR SQUARE NUMBERS
			6: FUNCTION THAT CHECKS THE NUMBER OF FACTORS OF AN INTEGER
			7: FUNCTION THAT CHECKS IF A NUMBER IS A PALINDROME 
			8: FUNCTION THAT TAKES AN INTEGER AND RETURNS THE FACTORIAL
			9: exit

					""";


		System.out.print(gatePass);

		System.out.print("Enter number: ");
		String entry = input.next();

		switch(entry){
		
			case "1": System.out.print("\nFUNCTION THAT CHECKS IF AN INTEGER IS EVEN");

				System.out.print("\nEnter integer: ");
				int number = input.nextInt();

				System.out.printf("Is %d an even integer? ", number);
				System.out.println(Kata.isEvenBoolean(number));
				
				mainMenu();
				break;

			case "2": System.out.print("\nFUNCTION THAT TAKES AN INTEGER AND CHECKS IF IT'S A PRIME NUMBER");

				System.out.print("\nEnter number: ");
				int userInput = input.nextInt();

				System.out.printf("Is %d a prime number? ", userInput );
				System.out.println(Kata.isPrimeNumber(userInput));

				mainMenu();
				break;
			

			case "3": System.out.print("\nFUNCTION THAT TAKES TWO INTEGERS AND FINDS THE DIFFERENCE & ALSO RETURNS AN ABSOLUTE ");

				System.out.print("\nEnter the First integer: ");
				int numberInput1 = input.nextInt();		
		
				System.out.print("\nEnter the Second integer: ");
				int numberInput2 = input.nextInt();

				int value =  Kata.subtract(numberInput1, numberInput2);
				System.out.print(value);
				
				System.out.printf("The difference between %d & %d is = %d%n  ", numberInput1, numberInput2, value );

				mainMenu();
				break;


			case "4": System.out.print("\nFUNCTION THAT TAKES TWO INTEGERS AND RETURNS THE QUOTIENT APPROXIMATED TO 2 DECIMAL PLACE ");

				System.out.print("\nEnter the First integer: ");
				int number1 = input.nextInt();		
		
				System.out.print("\nEnter the Second integer: ");
				int number2 = input.nextInt();
	
				float result = Kata.quotient(number1, number2);
				System.out.print(result);
				System.out.printf("\n%d divided by %d equals %.2f", number1, number2, result);

				mainMenu();
				break;



			case "5": System.out.print("\nFUNCTION THAT CHECKS FOR SQUARE NUMBERS ");

				System.out.print("\nEnter integer: ");
				int integer = input.nextInt();

				System.out.printf("Is %d a perfect square?  ", integer );
				System.out.print(Kata.square(integer));

				mainMenu();
				break;
		

			case "6": System.out.print("\nFUNCTION THAT CHECKS THE NUMBER OF FACTORS OF AN INTEGER ");

				System.out.print("\nEnter integer: ");
				int numbIn = input.nextInt();

				System.out.println(Kata.factors(numbIn));

				mainMenu();
				break;


			case "7": System.out.print("\nFUNCTION THAT CHECKS IF A NUMBER IS A PALINDROME ");
		
				System.out.print("\nEnter your 5 digit number: ");
				int numberIn = input.nextInt();

				System.out.printf("is %d palindrome?", numberIn );
				System.out.print(Kata.palindrome(numberIn)); 

				mainMenu();
				break;
		

			case "8": System.out.print("\nFUNCTION THAT TAKES AN INTEGER AND RETURNS THE FACTORIAL");

				System.out.print("\nEnter number: ");
				int factorial = input.nextInt();

				System.out.printf("The factors of %d include: ", factorial );
				System.out.println(Kata.factorial(factorial));

				mainMenu();
				break;
			
			case "9": System.exit(0);
	
	
		}

	}
		
	public static void main(String[] args){
		mainMenu();




	}
}




































