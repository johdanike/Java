import java.util.Arrays;
public class ReverseArrays{
	public static void main(String[]args){
		int[] bucky  = {3,4,5,6,7};
		int [] result = reverseArray(bucky);
		System.out.printf("The reversed array in the is %s",Arrays.toString(result));

	}

	public static int [] reverseArray(int [] main){
		int rev [] = new int[main.length];

		int counter = 0;
		for(int reverse = main.length - 1; reverse >= 0 ; reverse--){
			rev[counter] = main[reverse];
			counter++;
		}
		return rev;
	}

}

