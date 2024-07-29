import java.util.Scanner;
import java.util.Arrays;

public class SnacksValidator{
	public static void main (String...args){
		Snacks();
	}

	public static void Snacks(){
	Scanner input = new Scanner(System.in);

		String gatePass = """
			\n\n Select a function:
			1: Function that returns the largest element in a list
			2: Function that reverses a list
			3: Function that checks whether an element occurs in a list
			4: Function that returns the elements on odd positions in a list
			5: Function that returns the elements on even positions in a list
			6: Function that computes the running total of a list
			7: Function that checks whether a list is a palindrome
			8: Function that computes the sum of the numbers in a list: using a for-loop, a while-loop, and a do-while loop
			9: Function that concatenates two lists [a,b,c],[1,2,3] --> [a,b,c,1,2,3]
			10: Function that combines two lists by alternatingly taking elements, e.g. [a,b,c],[1[2[3] --> [a,1,b,2,c,3]
			11: Function that takes a number and returns a list of its digits. i.e 2342 ==> [2,3,4,2] 
		""";

	System.out.print(gatePass);
	System.out.println("Enter selection (1 - 11)");
	String entry = input.next();

	switch(entry){
		case "1": System.out.print("\nFunction that returns the largest element in a list");
		System.out.println("Enter numbers to compute");
		int numbers = input.nextInt();

		int [] list = new int[numbers];		
		//int largest = list[0];
		System.out.print(SnacksFunction.largestElement(list));
		System.out.printf("The largest element in this list is %d",largest);

	}


	}
}