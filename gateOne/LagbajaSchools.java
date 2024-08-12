import java.util.Scanner;
import java.util.Arrays;

public class LagbajaSchools{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int numStudents = input.nextInt();

		System.out.print("Enter number of subjects: ");
		int numSubjects = input.nextInt();
		
		int [][] register = new int[numStudents][numSubjects];
		int [] total = new int[numStudents];
		int [] sorted = new int[numStudents];
		double [] average = new double[numStudents];
		int [] classPosition = new int [numStudents];
		System.out.print(Arrays.deepToString(register));


		for(int index = 0; index < register.length; index++){
			System.out.println("\n\nStudent"+(index + 1)+ ": ");
			for(int counter = 0; counter < register[index].length; counter++){
				System.out.print("Enter score for subject"+ (counter + 1)+ ": ");
				register[index][counter] = input.nextInt();
				//if (register > 101 && register < 101){
				//	Syste
				//}

			}
		}
		System.out.print(Arrays.deepToString(register));

		for(int tot = 0 ; tot < register.length; tot++){
			int sum = 0;
			double mid = 0;
			for(int second = 0; second < register[tot].length; second++){
				sum += register[tot][second];
			}	
			mid = (double)sum / numStudents;
			average[tot] = mid;
			total[tot] = sum;
			sorted[tot] = sum;
			sum = 0;	
			mid = 0;
		}	
			System.out.print(Arrays.toString(total));
			System.out.print(Arrays.toString(average));

		//sorting program
		//int [] newArray = sorted;
		Arrays.sort(sorted);
		for(int count = 0; count < sorted.length; count++){
			for(int index = 0; index < sorted.length; index++){
				if(sorted[count]==total[index]) 
					classPosition[count]=sorted.length-index;
			}
		}
	
		
		System.out.printf("\t\n%8s","STUDENT");

       		for(int index = 1; index < numSubjects+1; index++){
           		System.out.printf("\t%s","SUB"+index);
      		}

      		System.out.printf("\t%5s\t%5s\t%5s%n","TOTAL","AVE", "POS");
  
		 for (int loop = 0; loop < numStudents; loop++) {
            		System.out.printf("Student %d ", loop + 1);
           		 for (int inner = 0; inner < numSubjects; inner++) {
               			 System.out.printf("\t%d", register[loop][inner]);
           		 }
          		System.out.printf("%10d%10.2f%5d", total[loop], average[loop], classPosition[loop]);
            		System.out.println();
       		}

		System.out.print("Subject Summary");
		
		for(int row = 0; index < numSubjects[0].length; index++){
			for(int count = 0; count < numStudents.length; count++){
				System.out.printf("Highest scoring student is: Student %d coring %d", classPosition[0]);
			}
		}






	}
}