package bank;

import java.util.ArrayList;

public class Bank {
    static ArrayList<Account>accounts = new ArrayList<>();

    public Account  createAccountFor(String firstName, String lastName, String pin) {
        Account newAccount = new Account(accounts.size()+1, firstName, lastName, pin);
        accounts.add(newAccount);
        return newAccount;
    }

    public int countAccount() {
        return accounts.size();
    }

    public void deposit(int accountNumber, int amount ){
//        accounts.get(accountNumber - 1).deposit(amount);
        Account account = accounts.get(accountNumber-1);
        if(account != null){
            account.deposit(amount);
        }
    }

    public int getBalance(int accountNumber, String pin) {
        //create a getPin method
        Account account = accounts.get(accountNumber-1);
        if(account != null && account.getPin().equals(pin)){
            return account.getBalance(accountNumber, pin);
        }
       // return accounts.get(accountNumber-1).getBalance(1, "correctPin");
        return 0;
    }

    public void withdraw(int accountNumber, int amount, String pin) {
        Account account = accounts.get(accountNumber-1);
        if(account != null && account.getPin().equals(pin)){
            account.withdraw(amount, pin);
        }
//        accounts.get(accountNumber-1).withdraw(amount, pin);
    }

    public void transfer(int accountNumber,int accountNumberTo, int amount, String pin){
        Account account = accounts.get(accountNumber-1);
        Account fromAccount = accounts.get(accountNumber-1);
        Account toAccount = accounts.get(accountNumberTo-1);
        if(fromAccount != null && fromAccount.getPin().equals(pin) && toAccount != null){
            fromAccount.withdraw(amount, pin);
            toAccount.deposit(amount);
        }
        else System.out.println("Account not found");
//
//        accounts.get(accountNumber-1).withdraw(amount, pin);
//        accounts.get(accountNumberTo-1).deposit(amount);
    }

    public void checkBalance(int accountNumber, String pin) {
        Account account = accounts.get(accountNumber-1);
        if(account.equals(accounts.get(accountNumber-1)) && account.getPin().equals(pin)){
            System.out.println("Account found and balance is = "+accounts.get(accountNumber-1).getBalance(accountNumber, pin));
        }
    }

    public void updatePin(int accountNumber, String oldPin, String newPin) {
        Account account = accounts.get(accountNumber-1);
        if(account.equals(accounts.get(accountNumber-1)) && account.getPin().equals(oldPin)){
            account.updatePin(accountNumber, oldPin, newPin);
        }else {
            throw new IllegalArgumentException("Invalid pin");
        }
    }

    public void closeAccount(int accountNumber, String correctPin) {
        Account account = accounts.get(accountNumber-1);
        if(account.equals(accounts.get(accountNumber-1)) && account.getPin().equals(correctPin)){
            accounts.remove(accountNumber-1);
        }
    }

//    private static Account accountValidate(String accountNumber) {
//        Account response = null;
//        for(int index = 0; index < accounts.size(); index++){
//            if(accounts.get(index).getPin().equals(accountValidate(accountNumber).getPin())){
//                response = accounts.get(index);
//            }
//            else response = null;
//        }
//        return response;
//    }


}
