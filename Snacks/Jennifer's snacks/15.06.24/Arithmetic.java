import java.util.*;

public class Arithmetic{
  public static void main(String [] args){
  Scanner input = new Scanner(System.in);

  System.out.print("Enter first integer: ");
  int firstInt = input.nextInt();

  System.out.print("Enter second integer: ");
  int secondInt = input.nextInt();

  int squared1 = firstInt * firstInt;
  int squared2 = secondInt * secondInt;

  int sum = squared1 + squared2;
  int dif = squared1 - squared2;

  System.out.printf("The square of the first integer is: %d%n, and the square of the second integer is %d%n", squared1, squared2);
  
  System.out.printf("The sum of the two squared integers is: %d%n", sum);

  System.out.printf("The difference betweenthe two squared integers is: %d%n", dif);
  



  }
}