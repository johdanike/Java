import java.util.Arrays;
public class SumOfList{
	public static void main(String[]args){
		SumOfList sumOfList = new SumOfList();
		int[] array  = {3,4,5,6,7,4,7,6,5,3,2};
		int result = sumOfList.sumOfElementsInList(array);
		System.out.printf("Sum: %d",result);

	}

	public int sumOfElementsInList(int [] main){
		int sum = 0;
		for(int index = 0; index < main.length ; index ++){
			sum += main[index];
		}
		return sum;
	}

}


