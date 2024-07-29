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



}