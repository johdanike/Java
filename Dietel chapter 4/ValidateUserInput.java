import java.util.Scanner;

public class ValidateUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10){
            System.out.println("Enter result (1 = pass, 2 = fail): ");
            String result = input.next();

            if(!result.equals("1") && !result.equals("2")){
                System.out.println("Please enter a valid number");
                System.out.println("Enter result (1 = pass, 2 = fail): ");
                result = input.next();
            }
            if (result.equals("1")){
                passes++;
                studentCounter++;
            }
            else if (result.equals("2")){
                failures++;
                studentCounter++;
            }
            else{
                System.out.println("Please enter a valid number");
            }

        }
        System.out.printf("Passed : %d%nFailed : %d%n", passes, failures);

        if (passes > 8){
            System.out.println("Bonus to instructor!");
        }
    }
}
