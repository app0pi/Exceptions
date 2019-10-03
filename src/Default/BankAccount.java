package Default;

import java.io.*;
import java.math.*;
import java.text.*;

public class BankAccount {
	private BigDecimal balance;

	public BankAccount(BigDecimal balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(BigDecimal amount) throws NegativeBalanceException, FileNotFoundException {
		if(amount.intValue() > balance.intValue()) {
			throw new NegativeBalanceException(balance);
		}
		else {
			balance = new BigDecimal(balance.intValue() - amount.intValue());
		}
	}
	
	public void quickWithdraw(BigDecimal amount) throws NegativeBalanceException, FileNotFoundException {
		if(amount.intValue() > balance.intValue()) {
			throw new NegativeBalanceException();
		}
		else {
			balance = new BigDecimal(balance.intValue() - amount.intValue());
		}
	}

	/*
	public double getBalance() {
		return balance;
	}
	*/
}
