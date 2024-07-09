import java.util.*;

public class LargestNum{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int largestNum = 0;
	int smallestNum = 0;


	for(int count = 0; count < 5; count++){

		System.out.print("enter numbers from 1 - 10: ");
		int number = input.nextInt();

		if(number > largestNum){
			largestNum = number;

		}
		if(number < smallestNum){
			smallestNum = number;
		}


	}
			System.out.println("The largest number is: "+largestNum);
			System.out.println("The smallest number is: "+smallestNum);


	}
}


		/*if(numRange.equalsIgnoreCase("e")){
			break;
		}
**/
		//int number = Integer.parseInt(numRange);