import java.util.Arrays;
public class SnackTest{
	public int largestElementFinder(int [] list){

		int largest = Integer.MIN_VALUE;
		for(int counter = 0; counter < list.length; counter++){
			if(list[counter] > largest){
		 		largest = list[counter];
			}
		} 
		return largest;
	} 

	

	public int [] reverseArray(int [] main){
		int rev [] = new int[main.length];

		int counter = 0;
		for(int reverse = main.length - 1; reverse >= 0 ; reverse--){
			rev[counter] = main[reverse];
			counter++;
		}
		return rev;
	}


	public static int [] elementsInOddPositionsArray(int [] main){
		int newLength;
		if(main.length % 2 == 1)newLength = main.length / 2;
		else newLength = (main.length / 2) + 1;

		int odd [] = new int[newLength];
		int counter = 0;
		for(int index = 1; index < main.length ; index += 2){
			odd[counter] = main[index];
			counter++;
		}
		return odd;
	}

	public static int [] elementsInEvenPositionsArray(int [] main){
		int newLength;
		if(main.length % 2 == 0)newLength = main.length / 2;
		else newLength = (main.length / 2) + 1;

		int even [] = new int[newLength];
		int counter = 0;
		for(int index = 0; index < main.length ; index += 2){
			even[counter] = main[index];
			counter++;
		}
		return even;
	}


	public int sumOfElementsInList(int [] main){
		int sum = 0;
		for(int index = 0; index < main.length ; index ++){
			sum += main[index];
		}
		return sum;
	}




}