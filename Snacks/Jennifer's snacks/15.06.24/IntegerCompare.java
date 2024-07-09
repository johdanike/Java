import java.util.*;

public class IntegerCompare{
  public static void main(String [] args){
  Scanner input = new Scanner(System.in);

  System.out.print("Enter integer: ");
  int integer = input.nextInt();

  int integerSqr = integer * integer;
  int intSqr = input.nextInt();


  if (integer >= 100 || intSqr >= 100){
    System.out.print("Number & square is comparable");
  }else 
  if (integer != 100 || intSqr != 100){
    System.out.print("Number & square is comparable ");
  }else 
  if(integer < 100 || intSqr < 100){
    System.out.print("Number & square is comparable");
  }

    
  }
}