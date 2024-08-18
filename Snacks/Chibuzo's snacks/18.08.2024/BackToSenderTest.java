import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BackToSenderTest{
	@Test
	public void testChecksForNegativeInputAndZeros(){
		BackToSenderFunction func = new BackToSenderFunction();
		int userInput = 0;
		assertThrows(IllegalArgumentException.class, () -> func.payCheck(userInput));
	}

	@Test
	public void testChecksForInputsAbove100(){
		BackToSenderFunction func = new BackToSenderFunction();
		int userInput = 102;
		assertThrows(IllegalArgumentException.class, () -> func.payCheck(userInput));
	}


	@Test
	public void testChecksForInputsBetween60And69(){
		BackToSenderFunction func = new BackToSenderFunction();
		int userInput = 67;
		int value = func.payCheck(userInput);
		int result = 21750;
		assertEquals(result, value);
	}
	
	@Test
	public void testChecksForInputsBetween50And59(){
		BackToSenderFunction func = new BackToSenderFunction();
		int userInput = 52;
		int value = func.payCheck(userInput);
		int result = 15400;
		assertEquals(result, value);
	}
	
	@Test
	public void testChecksForInputsLessThan50(){
		BackToSenderFunction func = new BackToSenderFunction();
		int userInput = 45;
		int value = func.payCheck(userInput);
		int result = 12200;
		assertEquals(result, value);
	}	

}