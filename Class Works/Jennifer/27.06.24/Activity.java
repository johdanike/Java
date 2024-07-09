import java.util.Scanner;

public class Activity{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	
	int number = 0;	
	int count = 1;
	

	while(count <= 2){
	
		System.out.println("Enter number: ");
		number = input.nextInt();

		if(number == 0)System.out.println("ZERO");
		else if(number == 1)System.out.println("ONE");
		else if(number == 2)System.out.println("TWO");
		else if(number == 3)System.out.println("THREE");
		else if(number == 4)System.out.println("FOUR");
		else if(number == 5)System.out.println("FIVE");
		else if(number == 6)System.out.println("SIX");
		else if(number == 7)System.out.println("SEVEN");
		else if(number == 8)System.out.println("EIGHT");
		else if(number == 9)System.out.println("NINE");
		else if(number == 10)System.out.println("TEN");
		else System.out.println("INVALID!!!");
	
	count++;
	
	}





	
	

	}
}