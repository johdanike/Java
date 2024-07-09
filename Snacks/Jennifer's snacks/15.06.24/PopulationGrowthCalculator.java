//World Population Growth Calculator) Search the Internet to determine the current world
//population and the annual world population growth rate. Write an application that inputs these values, then displays the estimated world population after //one, two, three, four and five years.

import java.util.*;

public class PopulationGrowthCalculator{
  public static void main(String[]args){
  Scanner input = new Scanner(System.in);
 
  System.out.print("Enter current world population: ");
  double population = input.nextDouble();

  final double growthRate = 0.7941;

  double yearOnePopulation = ((growthRate / 100) * population) + population;
  System.out.printf("The population for Year 1 is: %f%n", yearOnePopulation);

  double yearTwoPopulation = ((growthRate / 100) * yearOnePopulation) + yearOnePopulation;
  System.out.printf("The population for Year 2 is: %f%n", yearTwoPopulation);

  double yearThreePopulation = ((growthRate / 100) * yearTwoPopulation) + yearTwoPopulation;
  System.out.printf("The population for Year 3 is: %f%n", yearThreePopulation);

  double yearFourPopulation = ((growthRate / 100) * yearThreePopulation) + yearThreePopulation;
  System.out.printf("The population for Year 4 is: %f%n", yearFourPopulation);
 
  double yearFivePopulation = ((growthRate / 100) * yearFourPopulation) + yearFourPopulation;
  System.out.printf("The population for Year 5 is: %f%n", yearFivePopulation);
 
 
  }
}