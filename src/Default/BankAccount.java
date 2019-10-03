package Default;

import java.io.*;
import java.math.*;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(BigDecimal amount) throws NegativeBalanceException, FileNotFoundException {
		if(amount.intValue() > balance) {
			throw new NegativeBalanceException(balance);
		}
		else {
			balance = balance - amount.intValue();
		}
	}
	
	public void quickWithdraw(BigDecimal amount) throws NegativeBalanceException, FileNotFoundException {
		if(amount.intValue() > balance) {
			throw new NegativeBalanceException();
		}
		else {
			balance = balance - amount.intValue();
		}
	}

	/*
	public double getBalance() {
		return balance;
	}
	*/
}
