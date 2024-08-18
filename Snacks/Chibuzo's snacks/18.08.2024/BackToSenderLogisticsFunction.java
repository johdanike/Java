public class BackToSenderLogisticsFunction{
	public static int payCheck(int userInput){


		int calculatedPay = 0;
		final int basePay = 5000;
		
			if(userInput > 100)throw new IllegalArgumentException("Invalid input, daily commit must be within the range of 100 ");
			if(userInput <= 0)throw new IllegalArgumentException("Invalid input, please input a positive number");
			if(userInput >= 70) calculatedPay = userInput * (500) + basePay; 
			if(userInput >= 60 && userInput <= 69) calculatedPay = userInput * (250) + basePay; 
			if(userInput >= 50 && userInput <= 59) calculatedPay = userInput * (200) + basePay; 
			if(userInput < 50) calculatedPay = userInput * (160) + basePay;

			return calculatedPay;

			
	
	}

}