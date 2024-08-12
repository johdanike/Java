import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Calendar;



public class MenstrualApp2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-M-yyyy");
        String dateToday = today.format(formatter);

        System.out.println("Today's date is: " + dateToday);
	
	System.out.print("How old are you? ");
	int age = input.nextInt();

	if(age < 12)System.out.println("Ypu are specifically underage to be seeing your period!");
	else if(age > 52)System.out.print("You are most likely undergoing menopause, see a Doctor for more investigation");
	else{
		System.out.println("Enter the first day of your last period in this format (dd-M-yyyy): ");
        	LocalDate firstDayOfMenses = LocalDate.parse(input.next(), formatter);

        	System.out.print("How long did it last? ");
        	int duration = input.nextInt();

       		System.out.print("On average, what is the length of your cycle? ");
        	int aveLength = input.nextInt();

       		LocalDate nextMensesDate = firstDayOfMenses.plusDays(aveLength);
        	System.out.println("Your next menses is on " + nextMensesDate.format(formatter));

//		LocalDate halfOfPeriod = LocalDate.parse(nextMensesDate.minusdays(1)) / 2;
//		System.out.println(halfOfPeriod);

		LocalDate ovulationDateMinus2 =  nextMensesDate.plusDays(12);
		LocalDate ovulationDate =  nextMensesDate.plusDays(14);
		LocalDate ovulationDatePlus2 =  nextMensesDate.plusDays(16);
		
		System.out.printf("%nYour ovulation day is between %s and %s, but could most likely be on the %s. You might want to avoid forms of sexual contact as can lead to pregnancy",ovulationDateMinus2,ovulationDate,ovulationDatePlus2  );

		//LocalDate safePeriod = nextMensesDate.format.plusDays(18)
		//LocalDate safePeriod = nextMensesDate.format.plusDays(2)

	}
	
    }
}

