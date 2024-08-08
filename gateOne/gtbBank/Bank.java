public class Bank{
	private String name;
	private int accountNumber;
	private double balance;
	private String pin;

	private void validatePin(String pin){
		if(!(pin.equals(this.pin)))Throw new illegalArguementException("Incorrect pin");
		else return pin;
	}

	public Account(String name, int accountNumber, String pin){
		this.name = name;
		this.accountNumber = accountNumber;
		this.pin = pin;
	}

	public void deposit(String accountNumber, double amount){
		balance += amount;
	}

	public void withdraw(String accountNumber, String pin, double amount){
		pin = validatePin(pin);
		balance = balance - amount;
	}

	
	
}