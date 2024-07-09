import java.util.*;

public class TabularOutput{
  public static void main(String[]args){
  Scanner input = new Scanner(System.in);

  System.out.println("Number\tSquare\tCube\tQuart");

    for (int num = 1; num <=5; num++){
      int square = num * num;
      int cube = num * num * num;
      int quart = num * num * num * num;

      System.out.println(num + "\t" + square + "\t" + cube + "\t" + quart); 
     } 

  }
}  


