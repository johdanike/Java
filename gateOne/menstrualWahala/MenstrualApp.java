import java.util.Scanner;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.Format.DateTimeFormater;


public class MenstrualApp{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		//this.name = name;
		
		System.out.print("How old are you? ");
		String age = input.nextInt();

		/**if(howOldAreYou(age))System.out.println("You are not supposed to have a period, you are probvably in your menopause, consider further medical examination.");

		else{ }**/
		int beginning = firstDayOfLastPeriod();

		howOldAreYou(age);

		
	}

	

	public boolean howOldAreYou(String age){
		for()
		int number = Integer.parseInt(String.valueOf(age.charAt(index)))
		return mensesCalculator.length > 52;
	}
	
	//date of last period
	public static int firstDayOfLastPeriod(int firstDay){
		System.out.print("Enter the firstday of your last period: ");
		firstDay = input.nextInt();
		
		
	}

	//1-10 days
	public static int howLongDidItLast(int duration){
		System.out.print("How long did it last? ");
		duration = input.nextInt();
	}

	//how many days circle 21 - 45
	public static int averageLengthOfCycle(int aveLength){
		System.out.print("On average, what is the length of your cycle? ");
		aveLength = input.nextInt();
		
	}

	//expected next period start date == last period date + circle(averageLengthOfCycle)
	public static int expectedNextDate(int nextDate){
		date = firstDayOfLastPeriod(firstDay) + averageLengthOfCycle(aveLength);
		return date;
	}

	
	//expected period stop date
	public static int nextStopDate(int periodStop){
		int stopDate =  expectedNextDate(date) + howLongDidItLast(duration);

		return stopDate;
	}

	//expected ovulation day(+- 2 days)
	public static int [] ovulationDay (int ovulDate){
		int [] ovulDate = new int[2];
		ovulDate = (expectedNextDate(date) + 14);
		int firstDate = ovulDate + 2;
		int secondDate = ovulDate - 2;
		
		
		return ;
	}

	//safe days
	public static int safeDays(int safe){
		safe = expectedNextDate(date ) - 10;

		return safe;
	}








	
		
	

}