import java.util.*;

public class PositiveNegativeZeros{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int positive = 0;
	int negative = 0;
	int zero = 0;
	int stop = 1;
	

	while(stop!=0){

		System.out.print("Enter numbers to compute: ");
		int numRange = input.nextInt();
		System.out.print("press 0 to stop or any number to continue: ");
		stop = input.nextInt();

		if(numRange == 0){
			zero++;
		}     		
		
		else if(numRange < 0){
			negative++;
		}     		

		else if(numRange > 0){
			positive++;
		}

	}

	System.out.printf("Positive's:%d%n Negative's: %d%n Zero's: %d%n", positive, negative, zero);

	}
}


