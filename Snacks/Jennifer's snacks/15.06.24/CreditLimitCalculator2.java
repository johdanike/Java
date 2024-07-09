import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /** while (true) {
            System.out.print("Enter account number or (enter 1 to exit:) ");
            int accountNum = input.nextInt();

            if (accountNum == 1) {
                System.out.println("Exiting program.");
                break;
            }


            
            System.out.print("Enter balance at the beginning of the month: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total charges this month: ");
            int totalCharges = input.nextInt();

            System.out.print("Enter allowed credit balance: ");
            int allowedCreditBalance = input.nextInt();

            System.out.print("Enter total credit this month: ");
            int totalCreditAllowed = input.nextInt();

            System.out.print("Enter credit limit: ");
            int credit = input.nextInt();

            int newBalance = beginningBalance + totalCharges - totalCreditAllowed;
            System.out.printf("The new balance for %d is %d%n", beginningBalance, newBalance);

            if (newBalance > allowedCreditBalance) {
                System.out.println("Credit Limit Exceeded!");
            }
        }**/

while (true) {
            System.out.println("Enter account number (or 1 to finish):");
            int accountNumber = scanner.nextInt();
            if (accountNumber == 1) {
                break;
            }

            System.out.println("Enter balance at the beginning of the month:");
            int beginningBalance = scanner.nextInt();

            System.out.println("Enter total of all items charged by the customer this month:");
            int totalCharges = scanner.nextInt();

            System.out.println("Enter total of all credits applied to the customer’s account this month:");
            int totalCredits = scanner.nextInt();

            System.out.println("Enter allowed credit limit:");
            int creditLimit = scanner.nextInt();


            int newBalance = beginningBalance + totalCharges - totalCredits;
            System.out.println("New balance for account " + accountNumber + ": " + newBalance);


            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded for account " + accountNumber + "!");
            }
        }


    }

    }
}
