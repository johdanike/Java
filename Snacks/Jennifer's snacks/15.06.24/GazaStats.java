import java.util.*;

public class GazaStats{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter estimated number of stones used: ");
    double stoneNum = input.nextDouble();

    System.out.print("Enter average weight of each stone: ");
    double stoneWeight = input.nextDouble();

    System.out.print("Enter the number of years taken to build the pyramid: ");
    double yearNum = input.nextDouble();

    double oneStoneWeight = (stoneWeight * stoneNum) / yearNum;

    double year1 = oneStoneWeight;

    double numBuiltEveryHour = oneStoneWeight / 8760;

    double numBuiltEveryMinute = numBuiltEveryHour / 60;
 

    System.out.printf("The weight of the pyramid built each year was: %f tons%n", oneStoneWeight);
 
    System.out.printf("The weight of the pyramid built each hour was: %f tons%n", numBuiltEveryHour);  

    System.out.printf("The weight of the pyramid built each minute was: %f tons%n", numBuiltEveryMinute);

    
  }
}