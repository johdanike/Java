import java.util.Arrays;
public class ElementsInOddPosition{
	public static void main(String[]args){
		int[] array  = {3,4,5,6,7,4,7,6,5,3,2};
		int [] result = elementsInOddPositionsArray(array);
		System.out.printf("The elements in the odd positions of this array is %s",Arrays.toString(result));

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

}
