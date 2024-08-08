public class Account{
	public void setName();
	public String getName();
	public void setBalance();
	public double getBalance();

	private ArrayList <Account> accounts = new ArrayList<>();
	int count = 0;

	
	public Account createAccount(String firstName, String lastName, String pin){
		int accountNumber = generateAccountNumber();
		Account account = new Account(lastName + "" + firstName, accountNumber, pin){
			accounts.add(account);
		}
	}

	private int generateAccount(){
		return count++;
	}

	public Account findAccount(int accountNumber){
		for(int index = 0; index < accounts.size(); index++){
			if(account.get(index).getaccountNumber)
		}
	}

	public void withdraw(int accountNumber, String pin, double amount){
		Account account = findAccount(accountNumber);
		validate(pin);
		if(account.getBalance < amount)Throw new illegalArguementException("Insufficient balance");
		else amount.getbalance -= amount;
		amount.withdraw(accountNumber, pin, amount);
	}

	

}