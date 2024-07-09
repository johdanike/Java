import java.util.Scanner;

public class Gasmileage2{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

			int milesDriven = 0;
			int gallonsUsed = 0;
			//int counter = 0;
			int miles = 0;
			double cummulativeMilesGallon = 0;

		do{
			System.out.println("\nEnter miles driven or -1 to quit: ");
			miles = input.nextInt();

			if (miles < 1){
				break;
			}

			System.out.print("Enter amount of gallons used: ");
			int gallons = input.nextInt();

			double milesPerGallons = (double) miles / gallons;
			System.out.printf("Miles per gallon for this trip is: %.2f%n.", milesPerGallons);

			milesDriven += miles;
			gallonsUsed += gallons;
			cummulativeMilesGallon += milesPerGallons;
			//counter ++;

			if(milesDriven > 0){
 				//double average = (double) milesDriven / gallonsUsed;
				System.out.printf("The total miles driven is: %d%n.", milesDriven);
				System.out.printf("The total gallons used is: %d%n.", gallonsUsed);
				System.out.printf("The cummulative miles per gallons used is: %.2f%n.", cummulativeMilesGallon);
			}
			else {
				System.out.println("Invalid entry. Please enter the correct values!");
			}

		}while(miles != -1);
	}
}



/*
import java.util.Scanner;

public class GasMilleage{
  public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    int milesDriven = 0;
    int gallonUsed = 0;
    int counter = 0; 

    while(true){

    	System.out.printf("Enter miles driven or -1 to exit: %n");
    		int miles = input.nextInt();

      		if (miles <= 0){
     			break;
		}

 	System.out.printf("Enter amount of gallons used: %n");
      	int gallon = input.nextInt();

	double milesPerGallon = (double) miles / gallon;
      	System.out.printf("Miles per gallons used is %.2f%n ", milesPerGallon);

      	milesDriven += miles;
       	gallonUsed += gallon;
       	counter ++;
      
    	if (counter > 0){
    	double average = milesDriven / gallonUsed;

     	System.out.printf("The total miles driven is %d%n", milesDriven);
     	System.out.printf("The total gallons used is %d%n", gallonUsed);
     	System.out.printf("The total miles per gallons used is %.2f%n", average);
    	}
    
	else{
    		System.out.print("Please enter trips entry!");
    	}

    }

      

  }
}**/