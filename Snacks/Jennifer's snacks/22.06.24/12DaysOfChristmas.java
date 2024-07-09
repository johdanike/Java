public class DaysOfChristmas{
	public static void main(String[]args){
		for(int days = 1; days <= 12; days++){
			System.out.printf("%n%nOn the %d day of christmas, %nmy true love gave to me %n%n", days);

			switch(days){
				case 12:
					System.out.println("Twelve drummers drumming,");
					
				case 11: 
					System.out.println("Eleven pipers piping,");
				
				case 10: 
					System.out.println("Ten lords a-leaping,");					
				case 9: 
					System.out.println("Nine ladies dancing,");
				case 8: 
					System.out.println("Eight maids a-milking,");
				case 7: 
					System.out.println("Seven swans a-swimming,");
				case 6: 
					System.out.println("Six geese a-laying,");
					
				case 5: 
					System.out.println("Five golden rings,");
				case 4: 
					System.out.println("Four calling birds,");
				case 3: 
					System.out.println("Three French hens,");
				case 2: 
					System.out.println("Two turtle doves,");
				case 1:
					if(days ==  1){
						System.out.println("A partridge in a pear tree!");
					}else
						System.out.println("And a partridge in a pear tree!");
					
			}
		}
	}
}