import java.util.*;

public class PositiveNegativeZero2{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int positive = 0;
	int negative = 0;
	int zero = 0;
	int numRange = 0;

	while(true){

		System.out.print("Enter numbers to compute: ");
		numRange = input.nextInt();

		if(numRange == 0){
			zero++;
		}     		
		
		else if(numRange < 0){
			negative++;
		}     		

		else if(numRange > 0){
			positive++;
		}

	System.out.printf("The number of zero's are %d%n", zero);
	System.out.printf("The negative numbers are %d%n", negative);   
	System.out.printf("The positive numbers are %d%n", positive);



	}


	}
}


