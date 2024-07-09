import java.util.Scanner;

public class AverageAcceleration{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your starting velocity: ");
		double start = input.nextDouble();

		System.out.print("Enter your estimated ending velocity: ");
		double end = input.nextDouble();

		System.out.print("Enter time in seconds: ");
		double time = input.nextDouble();

		double subtract = end - start;
		double accel = subtract / time;

		System.out.printf("The average speed is %f", accel);
	}
}