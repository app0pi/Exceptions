package Default;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws NegativeBalanceException {
		if(amount > balance) {
			throw new NegativeBalanceException();
		}
		else {
			balance = balance - amount;
		}
	}

	public double getBalance() {
		return balance;
	}
	
}
