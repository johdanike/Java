import java.util.Scanner;

public class ClassTask{
	public static void main(String[]args){
	Scanner input =  new Scanner(System.in);

	System.out.print("Enter 1 to be greeted in English or 0 to be greeted in Hausa: ");
	int userEntry = input.nextInt();


		//if(userEntry == 1)System.out.print("Welcome");
		//else System.out.print("Nagode!");

		System.out.print(userEntry == 1?"Welcome":"Nagode");
	}
}