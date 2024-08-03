import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import java.util.Arrays;

public class TrueSnacksTest{
	@Test
	public void testToCheckLargestElement(){
		SnackTest snacktest = new SnackTest();

		int [] list = {2,6,5,2,7,8,1,2,9,45,2,5,23,12,8,6};
		int result = snacktest.largestElementFinder(list);
		assertEquals(45, result);
	}


	@Test
	public void testToReverseArray(){
		SnackTest snacktest = new SnackTest();
		int [] main = {2, 30, 6, 5, 12, 35, 8, 90, 6};
		int[] result = snacktest.reverseArray(main);
		int [] rev = {6, 90, 8, 35, 12, 5, 6, 30, 2};
		assertArrayEquals(rev, result);


	}

	@Test
	public void testThatPrintsElementsAtOddIndices(){
		SnackTest snacktest = new SnackTest();
		int [] number = {3,4,5,6,7,4,7,6,5,3,2};
		int [] result = snacktest.elementsInOddPositionsArray(number);
		int [] odd = {4, 6, 4, 6, 3};
		assertArrayEquals(odd, result);

	}

	@Test
	public void testThatPrintsElementsAtEvenIndices(){
		SnackTest snacktest = new SnackTest();
		int [] number = {3,4,5,6,7,4,7,6,5,3,2,0};
		int [] result = snacktest.elementsInEvenPositionsArray(number);
		int [] even = {3, 5, 7, 7, 5, 2};
		assertArrayEquals(even, result);
	}

	@Test
	public void testThatSumsElementsOfAList(){
		SnackTest snacktest = new SnackTest();
		int[] array  = {3,4,5,6,7,4,7,6,5,3,2};
		int result = snacktest.sumOfElementsInList(array);
		int sum = 52;
		assertEquals(sum, result);
	}



}