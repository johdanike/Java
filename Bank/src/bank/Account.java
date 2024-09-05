package bank;

public class Account {
    private int balance;
    private String pin;
    private int accountNumber;



//    public Account(String pin, int balance) {
//        this.pin = pin;
//        this.balance = balance;
//    }
    public Account(int accountNumber, String firstName, String lastName, String pin) {
        this.pin = pin;
        this.accountNumber = accountNumber;

    }

    private void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public int getBalance(int AccountNumber, String pin){
        if(isCorrectPin(pin) && AccountNumber == this.accountNumber)
            return balance;
        throw new IllegalArgumentException("Invalid pin");
    }

    public void deposit(int amount){
        if(amount > 0)
            balance += amount;
    }

    public void withdraw(int amount, String pin ){
            if(fundIsSufficient(amount) && isGreaterthanZero(amount) && fundIsGreaterThanZero(amount) &&  isCorrectPin(pin))
                balance -= amount;
    }

    private boolean fundIsSufficient(int amount){
        return amount <= balance;
    }

    private boolean fundIsGreaterThanZero(int amount){
        return amount >= 0;
    }

    private boolean isGreaterthanZero(int amount){
        return amount > 0;
    }

    private boolean isCorrectPin(String pin){
        return this.pin.equals(pin);
    }

    public void updatePin(int accountNumber, String oldPin, String newPin){
        if(isCorrectPin(oldPin) && accountNumber == this.accountNumber){
            this.pin = newPin;
        }else {
            throw new IllegalArgumentException("Invalid pin");
        }
    }


//    public int checkBalance(int accountNumber, String pin) {
//        if(isCorrectPin(pin)){
//            return balance;
//        }
//        throw new IllegalArgumentException("Invalid pin");
//    }
}
