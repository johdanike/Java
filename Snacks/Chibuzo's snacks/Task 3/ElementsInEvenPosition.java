import java.util.Arrays;
public class ElementsInEvenPosition{
	public static void main(String[]args){
		int[] array  = {3,4,5,6,7,4,7,6,5,3,2,0};
		int [] result = elementsInEvenPositionsArray(array);
		System.out.printf("The elements in the even positions of this array is %s",Arrays.toString(result));

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

}
