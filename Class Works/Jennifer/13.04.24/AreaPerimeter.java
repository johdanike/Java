import java.util.Scanner;

public class AreaPerimeter{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Enter Width: ");
		double inWidth = input.nextDouble();

		System.out.print("Enter Height: ");
		double inHeight = input.nextDouble();

				
		double area = inWidth * inHeight;
		double perimeter = 2 * (inWidth + inHeight);

		System.out.printf("The area of the rectangle is %.2f%n", area);
		System.out.printf("The perimeter of the rectangle is %.2f", 			perimeter);


		
	}
}