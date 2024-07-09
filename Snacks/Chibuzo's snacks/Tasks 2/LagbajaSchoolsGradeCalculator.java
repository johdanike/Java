import java.util.Scanner;

public class LagbajaSchoolsGradeCalculator{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

		System.out.print("Welcome to the Grade Management System Of Lagbaja Schools International");
		System.out.println("\nTo proceed, enter fullname: ");
		String name = input.next();

		
		System.out.print("How many students do you have?");
		int noOfStudents = input.nextInt();
		
		System.out.print("How many subjects to compute?");
		int noOfSubjects = input.nextInt();

		int total = 0;
		int averageGrade = 0;
		int subjectGrade = 0;
		
		for(int counter = 1; counter <= noOfStudents; counter++){
			
			for(int studentCounter = 1; studentCounter <= noOfSubjects; studentCounter++){

				System.out.printf("Enter subject (%d) grade", studentCounter);
				subjectGrade = input.nextInt();

				if(subjectGrade > 0 && subjectGrade <= 100)

				total = total + subjectGrade;
				averageGrade = total / noOfSubjects;
				

			
			}
		}

			System.out.printf("The total score is %d\n; And average grade as = %d\n", total, averageGrade);
		

	


	}
}
