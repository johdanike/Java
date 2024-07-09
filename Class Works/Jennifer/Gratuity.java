import java.util.*;

public class Gratuity{
	public static void main(String[]args){
	Scanner in = new Scanner(System.in);

	double gratuity;
	double total;

	System.out.print("Enter the subtotal: ");
	double subTotal = in.nextDouble();

	System.out.print("Enter the gratuity rate: ");
	double gratRate = in.nextDouble();

	gratuity = (gratRate / 100) * subTotal;
	total = gratuity + subTotal;

	System.out.printf("The gratuity is %.1f and the total is $%.2f", gratuity, total);
	

	}
}