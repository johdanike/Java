
import java.util.*;

public class SquaresAndCubes{
  public static void main(String [] args){

    System.out.println("Number\tSquare\tCube");

      for (int num = 0; num <=10; num++){
        int square = num * num;
        int cube = num * num * num;

        System.out.println(num + "\t" + square + "\t" + cube);  
    }
  }
}