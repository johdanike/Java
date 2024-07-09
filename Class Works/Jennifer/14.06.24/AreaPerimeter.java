import java.util.*;

public class AreaPerimeter{
  public static void main(String [] args){
  Scanner input = new Scanner(System.in);

  System.out.print("Enter raduis of circle: ");
  double radius = input.nextDouble();

  double pie = 3.14159;
  
  double perimeter = 2 * radius * pie;
  System.out.printf("The perimeter of this circle with radius of %.2f is %.2f%n",radius, perimeter);

  double area = radius * radius * pie;
  System.out.printf("The area of this circle with radius of %.2f is %.2f",radius, area);

  }
}