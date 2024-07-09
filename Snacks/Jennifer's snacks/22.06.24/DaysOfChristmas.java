public class DaysOfChristmas{
	public static void main(String[]args){
		for(int days = 1; days <= 12; days++){
			System.out.printf("On the %d day of christmas, my true love gave to me", days);

			switch(days){
				case 12:
					System.out.println("Twelve drummers drumming,");
					System.out.println("Eleven pipers piping,");
					System.out.println("Ten lords a-leaping,");
					System.out.println("Nine ladies dancing,");
					System.out.println("Eight maids a-milking,");
					System.out.println("Seven swans a-swimming,");
					System.out.println("Six geese a-laying,");
					System.out.println("Five golden rings,");
					System.out.println("Four calling birds,");
					System.out.println("Three French hens,");
					System.out.println("Two turtle doves,");
				case 11: 
					System.out.println("Eleven pipers piping,");
					System.out.println("Ten lords a-leaping,");
					System.out.println("Nine ladies dancing,");
					System.out.println("Eight maids a-milking,");
					System.out.println("Seven swans a-swimming,");
					System.out.println("Six geese a-laying,");
					System.out.println("Five golden rings,");
					System.out.println("Four calling birds,");
					System.out.println("Three French hens,");
					System.out.println("Two turtle doves,");
				case 10: 
					System.out.println("Ten lords a-leaping,");
					System.out.println("Nine ladies dancing,");
					System.out.println("Eight maids a-milking,");
					System.out.println("Seven swans a-swimming,");
					System.out.println("Six geese a-laying,");
					System.out.println("Five golden rings,");
					System.out.println("Four calling birds,");
					System.out.println("Three French hens,");
					System.out.println("Two turtle doves,");
				case 9: 
					System.out.println("Nine ladies dancing,");
					System.out.println("Eight maids a-milking,");
					System.out.println("Seven swans a-swimming,");
					System.out.println("Six geese a-laying,");
					System.out.println("Five golden rings,");
					System.out.println("Four calling birds,");
					System.out.println("Three French hens,");
					System.out.println("Two turtle doves,");

				case 8: 
					System.out.println("Eight maids a-milking,");
					System.out.println("Seven swans a-swimming,");
					System.out.println("Six geese a-laying,");
					System.out.println("Five golden rings,");
					System.out.println("Four calling birds,");
					System.out.println("Three French hens,");
					System.out.println("Two turtle doves,");

				case 7: 
					System.out.println("Seven swans a-swimming,");
					System.out.println("Six geese a-laying,");
					System.out.println("Five golden rings,");
					System.out.println("Four calling birds,");
					System.out.println("Three French hens,");
					System.out.println("Two turtle doves,");
				case 6: 
					System.out.println("Six geese a-laying,");
					System.out.println("Five golden rings,");
					System.out.println("Four calling birds,");
					System.out.println("Three French hens,");
					System.out.println("Two turtle doves,");
				case 5: 
					System.out.println("Five golden rings,");
					System.out.println("Four calling birds,");
					System.out.println("Three French hens,");
					System.out.println("Two turtle doves,");
				case 4: 
					System.out.println("Four calling birds,");
					System.out.println("Three French hens,");
					System.out.println("Two turtle doves,");
				case 3: 
					System.out.println("Three French hens,");
					System.out.println("Two turtle doves,");
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