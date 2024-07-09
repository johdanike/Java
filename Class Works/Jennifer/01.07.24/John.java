import java.util.Scanner;

public class John{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		for(int counter = 1; counter <= 10; counter++){
			System.out.print("Enter number: ");
			int number = input.nextInt();

			if(counter == 5) continue;
			System.out.println(number);
		}
	}
}