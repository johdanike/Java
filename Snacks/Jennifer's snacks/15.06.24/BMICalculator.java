import java.util.*;

public class BMICalculator{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter weight in kilograms: ");
    double weight = input.nextDouble();

    System.out.print("Enter height in meters: ");
    double height = input.nextDouble();

    double bmi = (weight ) / (height * height);
    
    if (bmi >= 0 && bmi <= 18.5){
      System.out.printf("Your BMI is: %f, you are underweight.%n", bmi);
    }if (bmi >= 18.5 && bmi <= 24.9){
      System.out.printf("Your BMI is: %f, your weight is normal.%n", bmi);
    }if (bmi >= 25.0 && bmi <= 29.9){
      System.out.printf("Your BMI is: %f, you are overweight.%n", bmi);
    }if (bmi >= 30){
      System.out.printf("Your BMI is: %f, you are Obese.%n", bmi);
    }
    

  }
}