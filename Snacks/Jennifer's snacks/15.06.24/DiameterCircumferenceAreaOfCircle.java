import java.util.Scanner;

public class DiameterCircumferenceAreaOfCircle{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
 
    System.out.print("Enter radius of the circle: ");
    double radiusInput = input.nextDouble();

    double diameter = 2 * radiusInput;
    System.out.printf("%nThe diameter of the circle with radius %f is %f.%n", radiusInput, diameter); 

    double circumference = 2 * Math.PI * radiusInput;
    System.out.printf("The circumference of this circle with radius %f, is %f.%n", radiusInput, circumference);

    double area = Math.PI * Math.pow(radiusInput, 2);
    System.out.printf("The area of the circle with radius of %f is %f.%n", radiusInput, area);
    
  }
}