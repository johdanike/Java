package bank;

import java.util.Scanner;
import static bank.Bank.accounts;

public class BankMain {
    static Bank bank = new Bank();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        print("Welcome to my GTBank ATM machine");
        showMainMenu();
    }

    public static void showMainMenu() {
        String menu = """
                Press
                1 -> Open Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Check Balance
                5 -> Update Pin
                6 -> Transfer Money
                7 -> Close Account
                8 -> Exit
                """;
        print(menu);

        char userInput = input.next().charAt(0);


        switch(userInput) {
                case '1':
                    openAccount();
                case '2':
                    deposit();
                case '3':
                    withdraw();
                case '4':
                    checkBalance();
                case '5':
                    updatePin();
                case '6':
                    transfer();
                case '7':
                    closeAccount();
                case '8':
                    exit();
            }
        }

    private static void closeAccount() {
        int accountNumber = Integer.parseInt(input("Enter your account number: "));
        String pin  = (String) input("Enter your pin: ");
        bank.closeAccount(accountNumber, pin);
        print(String.format("Account %d has been closed", accountNumber));
    }

    private static void transfer() {
            int accountNumber = Integer.parseInt(input("Enter your account number: "));
            int accountNumberTo  = Integer.parseInt(input("Enter your sender account number: "));
            int amount = input("Enter your amount to transfer: ").length();
            String pin  = (String) input("Enter your pin: ");
            bank.transfer(accountNumber, accountNumberTo,amount, pin);
            print(String.format("%d has been successfully deposited /nTransaction successful.", amount));
            showMainMenu();
        }

        private static void updatePin() {
            int accountNumber = Integer.parseInt(input("Enter your account number: "));
            String oldPin  = (String) input("Enter your old pin: ");
            String newPin  = (String) input("Enter your new pin: ");
            bank.updatePin(accountNumber,oldPin, newPin);
            print("Your pin has been updated");
            showMainMenu();
        }

        private static void checkBalance() {
            int accountNumber = Integer.parseInt(input("Enter your account number: "));
            String pin  = (String) input("Enter your pin: ");
            bank.checkBalance(accountNumber, pin);
            print(String.format("Your account balance is %d", bank.getBalance(accountNumber, pin)));
            showMainMenu();
        }

        private static void withdraw(){
            int accountNumber = Integer.parseInt(input("Enter your account number: "));
            int amount = input("Enter your amount to withdraw: ").length();
            String pin  = (String) input("Enter your pin: ");
            bank.withdraw(accountNumber, amount, pin);
            print(String.format("%d Successfully withdrawn", amount));
            showMainMenu();
        }

        private static void deposit() {
            int accountNumber = Integer.parseInt(input("Enter your account number: "));
            int amount = Integer.parseInt(input("Enter your amount to deposit"));
            bank.deposit(accountNumber, amount);
            print(String.format("%d has successfully been deposited into %s account number.", amount, accountNumber));
            showMainMenu();
        }

        private static void openAccount() {
            String firstName = (String) input("Enter your first name: ");
            String lastName = (String) input("Enter your last name: ");
            String pin  = (String) input("Enter your pin: ");
            bank.createAccountFor(firstName, lastName, pin);
            print(String.format("%s"+" %s, Welcome To GtBank", firstName, lastName));
//            int accountNumber = 1  ;
//            Account account = accounts.getFirst();
//            print(String.format("Your account number is %d", account));
            showMainMenu();
        }

        private static void exit(){
            System.exit(1);
        }

        private static String input(String prompt) {
          //  Scanner input = new Scanner(System.in);
            System.out.println(prompt);
            return new Scanner(System.in).nextLine();
        }

        private static void print(String prompt){
            System.out.println(prompt);
        }
    }









