import java.util.Scanner;

public class CreditLimitCalculator{
  public static void main(String[]args){
     Scanner input = new Scanner(System.in);

     while(true){

     System.out.print("Enter account number or enter 1 to exit: ");
     int accountNum = input.nextInt();
    
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

     int newBalance = (beginningBalance + totalCharges) - credit;
     System.out.printf("The new balance for %d is %d%n", beginningBalance, newBalance);

     if(newBalance > credit){
       System.out.print("Credit Limit Exceeded!%n");
       }
     if (accountNum == 1 ){break;}
   }

  }
}