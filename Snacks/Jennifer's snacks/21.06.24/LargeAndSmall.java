import java.util.Scanner;
public class LargeAndSmall{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		int number = 0;
		int exit = 1;
		int largestNum = 0;
		int smallestNum = 0;
		int num = 0;

		while(exit != 0){
			System.out.print("Please enter your numbers: ");
			num = input.nextInt();

			System.out.print("Press any number to continue(or press 0 to exit): ");
			exit= input.nextInt();

			/*if(num > largestNum){
				largestNum  = num;
			}
			
			if(num < smallestNum ){
				smallestNum = num;
			}**/

			if(num>largestNum)largestNum=num;
			if(num<smallestNum)smallestNum=num;
			
		}

		
	System.out.printf("The largest number is %d and the smallest number is %d%n.",  largestNum, smallestNum);
		
		
	}
}