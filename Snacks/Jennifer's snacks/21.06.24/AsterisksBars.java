import java.util.*;//PASSED

public class AsterisksBars{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int num1, num2, num3, num4, num5 = 0;
	int userInput = 1;		

		for(int numberInput1 = 1; numberInput1 <= 5; numberInput1++){

		System.out.printf("%nEnter integer( %d) b/w 1 and 30: ", numberInput1);
		userInput = input.nextInt();

			while (userInput < 1 || userInput > 30) {           
       				System.out.println("Value is out of range 1-30");
       		 		System.out.println("Please set required range!");

				System.out.printf("%nEnter integer( %d) b/w 1 and 30: ", numberInput1);
				userInput = input.nextInt();
			}


			if(numberInput1==1)num1=userInput;
			if(numberInput1==2)num2=userInput;
			if(numberInput1==3)num3=userInput;
			if(numberInput1==4)num4=userInput;
			if(numberInput1==5)num5=userInput;


			for(int star = 1; star <= userInput; star++){
				System.out.print("*");
			}
		
		}
	}
}