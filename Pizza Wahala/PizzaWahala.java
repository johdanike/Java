import java.util.Scanner;
import java.util.ArrayList;

public class PizzaWahala{
	public static void main(String[]args){
	
		System.out.print("WELCOME TO IYA ABIMBOLA PIZZA JOINT YABA");
		System.out.println("Breathetaking Pizza Desert just for you ):");
		Scanner input = new Scanner(System.in);
		String calalogy = "";


		System.out.print("Pizza type \tNumber Of Slices \tPrice Per Box");
		System.out.printf("%s%8s%15s%20s","1", "Sapa Size","  4","  2000");
		System.out.printf("%s%n%8s%14s%20s","2", "Small Money" ,"  6" ,"  2400");
		System.out.printf("%s%n%8s%15s%20s","3", "Big Boys" ,"  8" ,"  3000");
		System.out.printf("%s%n%8s%15s%20s","4", "Odogwu", "  12", "  4200");
			
		System.out.println();
		productCatalogy();

		public static void productCatalogy(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please select a Pizza type");
		String pizzaType = input.next();
		String guestNumber = "";
		int numberOfBoxes = 0;
		int price = 0; 
		int guestNo = 0;

		switch(pizzaType){
			case "1":
				System.out.println("How may we be of service?\nHow many guest will you be serving?");
				guestNumber = input.next();
				guestNo = Integer.valueOf(guestNumber);
				numberOfBoxes = guestNo / 4 + guestNo % 4;
				price = 2000 * numberOfBoxes;
				System.out.printf("Number Of Boxes = %d\nPrice = N%d",numberOfBoxes,price);
				productCatalogy();
			case "2":
				System.out.println("How may we be of service?\nHow many guest will you be serving?");
				guestNumber = input.next();
				guestNo = Integer.valueOf(guestNumber);
				numberOfBoxes = guestNo / 6 + guestNo % 6;
				price = 2400 * numberOfBoxes;
				System.out.printf("Number Of Boxes = %d\nPrice = N%d",numberOfBoxes,price);
				productCatalogy();
			case "3":
				System.out.println("How may we be of service?\nHow many guest will you be serving?");
				guestNumber = input.next();
				guestNo = Integer.valueOf(guestNumber);
				numberOfBoxes = guestNo / 8 + guestNo % 8;
				price = 3000 * numberOfBoxes;
				System.out.printf("Number Of Boxes = %d\nPrice = N%d",numberOfBoxes,price);
				productCatalogy();
			case "4":
				System.out.println("How may we be of service?\nHow many guest will you be serving?");
				guestNumber = input.next();
				guestNo = Integer.valueOf(guestNumber);
				numberOfBoxes = guestNo / 12 + guestNo % 12;
				price = 4200 * numberOfBoxes;
				System.out.printf("Number Of Boxes = %d\nPrice = N%d",numberOfBoxes,price);
				productCatalogy();
			default: System.out.println("Invalid input, your satisfaction is our business, please try again.");
		}
			
	}
}
