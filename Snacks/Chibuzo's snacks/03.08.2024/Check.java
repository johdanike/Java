import java.util.Arrays;
public class Check{

	public static void main(String[] args){
		int[] array = {34. 59, 39};
		System.out.println(Arrays.toString(getPositions(array));
	}

	public static int[] getPositions(double[] array){
	  double temp = array;
	  Arrays.sort(temp);
	  int[] positions = new int[array.length];
	  for(int count=0; count<array.length; count++){
		for(int index=0; index<array.length; index++){
		   if(array[count]==temp[index])position[count]=array.length-index;
		}
	  }
		return positions;
	}
}