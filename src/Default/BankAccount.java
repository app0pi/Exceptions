package Default;

import java.io.*;
import java.math.*;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws NegativeBalanceException, FileNotFoundException {
		if(amount > balance) {
			throw new NegativeBalanceException(balance);
		}
		else {
			balance = balance - amount;
		}
	}
	
	public void quickWithdraw(double amount) throws NegativeBalanceException, FileNotFoundException {
		if(amount > balance) {
			throw new NegativeBalanceException();
		}
		else {
			balance = balance - amount;
		}
	}

	/*
	public double getBalance() {
		return balance;
	}
	*/
}
