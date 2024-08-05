import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import java.util.Arrays;

public class SnacksTest{
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
		int [] number = {2,5,3,5,7,8,9,2};
		String [] result = snacktest.OddPosition(number);
		assertEquals(odd, result);

	}

	@Test
	public void testThatPrintsEvenElementsAtEvenIndices(){
		SnackTest snacktest = new SnackTest();
		int [] number = {2,5,3,5,7,8,9,2};
		String [] result = snacktest.EvenPosition(number);
		assertEquals(even, result);
	}


}