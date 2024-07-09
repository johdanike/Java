import java.util.Scanner;

public class RunWayLenght{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter take-off speed: ");
		double speed = input.nextDouble();

		System.out.print("Enter max acceleration: ");
		double accel = input.nextDouble();

		double squared = speed * speed;
		double multiply = accel * 2;
		

		double lenghtRunway = squared / multiply;
		System.out.printf("Minimum runway lenght is %f", lenghtRunway);
	}
}