public class Elements{
	public static void main(String[]args){
		int[] bucky  = {3,4,5,6,7};
		//int result = largestElementFinder(list);
		int result = largestElementFinder(bucky);
		System.out.printf("The largest element in the list is %d",result);

	}

	public static int largestElementFinder(int [] list){

		int largest = list [0];
		for(int counter = 0; counter < list.length; counter++){
			if(list[counter] > largest){
		 		largest = list[counter];
			}
		} 
		return largest;
	}

}

