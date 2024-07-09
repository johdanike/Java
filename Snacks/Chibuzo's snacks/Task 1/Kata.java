public class Kata{

	public static boolean isEvenBoolean(int number){
		if(number % 2 == 0) return true; 
			return false;

	}

	
	public static boolean isPrimeNumber(int userInput){
		int count = 0;
		for(int iteration = 1; iteration <= userInput; iteration++){

			int factors = userInput % iteration;
			if(factors == 0) count++;

		}
			if(count > 2) return false;
			return true;
	}

	
	public static int subtract(int numberInput1, int numberInput2){

		int total = numberInput2 - numberInput1;
		if(total < 0) total = total * (-1);
		return total;
	}

	
	public static float quotient(int number1, int number2){
		if (number2 == 0)return 0;
		float quotient = number1 / number2;return quotient;
		

	}


	public static boolean square(int integer){
		int counter = 0;
		for(counter = 1; counter < integer; counter++)

			if(counter * counter == integer ) return true;
			return false;
			
	}


	public static int factors(int numbIn){
		int count = 0;
		for(int loop = 1; loop <= numbIn; loop++)
			if(numbIn % loop == 0) count++;
			return count;
	}


	public static boolean palindrome(int numberIn){
		
		int num1 = numberIn / 1 % 10;
		int num2 = numberIn / 10 % 10;
		int num3 = numberIn / 100 % 10;
		int num4 = numberIn / 1000 % 10;
		int num5 = numberIn / 10000 % 10;
		
		if(num1 == num5 && num4 == num2)return true;
		return false;
	}


	public static int factorial(int factorial){
		int iteration;
		int loop = 1;
		for(iteration = 1; iteration <= factorial; iteration++){
			loop*=iteration;

		}
			return loop;
	}



}

