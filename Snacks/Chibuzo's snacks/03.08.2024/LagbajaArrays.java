import java.util.Scanner;

public class LagbajaArrays{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
		
		System.out.print("How many students do you have? ");
		int numberOfStudents = input.nextInt();

		System.out.print("How many subject did they offer? ");
		int numberOfSubjects = input.nextInt();

		int lagbaja [][] = new int [numberOfStudents][numberOfSubjects];
		int subject [] = new int[numberOfSubjects];
		int total [] = new int[numberOfStudents];
		int sum = 0;
		double average [] = new double[numberOfStudents];
		int counter = 1;
		int num = 1; 

		for(int row = 0; row < numberOfStudents; row++){
			for(int column = 0; column < numberOfSubjects; column++){
				
				System.out.printf("%nEntering score for student %d: ",num);
				System.out.printf("%nEnter score for subject %d: ",counter);
				lagbaja [row][column]  = input.nextInt();
				System.out.printf("%nSaving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.printf("%nSaved successfully....%n");
				counter++;
				sum += lagbaja[row][column];
			}
				num++;
				counter = 1;
				total[row] = sum;
				average[row] = (double)sum / numberOfSubjects;
		}
		
		System.out.print("STUDENT");

       		for(int index = 1; index < numberOfSubjects+1; index++){
           		System.out.printf("%12s","SUB"+index);
      		}

      		System.out.printf("%12s%12s%12s%n","TOTAL","AVERAGE", "POSITION");
  
		 for (int loop = 0; loop < numberOfStudents; loop++) {
            		System.out.printf("Student %d ", loop + 1);
           		 for (int inner = 0; inner < numberOfSubjects; inner++) {
               			 System.out.printf("%10d", lagbaja[loop][inner]);
           		 }
          		System.out.printf("%10d%10.2f", total[loop], average[loop]);
            		System.out.println();
       		}

		
	  	//String[] header3 = {"TOTAL","AVERAGE", "POSITION"};
       		//for(String index :header3){
           	//	System.out.printf("%15s", index);
      		//}

	}
}