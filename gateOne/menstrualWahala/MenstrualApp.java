import java.util.Scanner;

public class MenstrualApp{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
		//this.name = name;
		
		System.out.print("How old are you? ");
		String age = input.nextInt();

		/**if(howOldAreYou(age))System.out.println("You are not supposed to have a period, you are probvably in your menopause, consider further medical examination.");

		else{ }**/
		int beginning = firstDayOfLastPeriod();

		
	}

	

	/**public boolean howOldAreYou(String age){
		for()
		int number = Integer.parseInt(String.valueOf(age.charAt(index)))
		return mensesCalculator.length > 52;
	}
	**/

	public static int [] firstDayOfLastPeriod(int [] firstDay){
		System.out.print("Enter the firstday of your last period: ");
		firstDay [] = input.nextInt();
		
	}

	public static int [] howLongDidItLast(int [] duration){
		System.out.print("How long did it last? ");
		duration [] = input.nextInt();
	}

	public static int [] averageLengthOfCycle(int [] aveLength){
		System.out.print("On average, what is the length of your cycle? ");
		aveLength [] = input.nextInt();
	}
		
	

}