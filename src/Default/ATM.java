package Default;

import java.io.*;
import java.math.*;
import java.text.*;

public class ATM {
	private BankAccount account;
	
	public ATM() {
		BigDecimal b = new BigDecimal("500");
		account = new BankAccount(b);
	}

	public void handleTransactions() throws NegativeBalanceException, FileNotFoundException {
		try{
			BigDecimal b = new BigDecimal("600");
			account.withdraw(b);
		}
		catch(NegativeBalanceException e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		try{
			BigDecimal b = new BigDecimal("600");
			account.quickWithdraw(b);
		}
		catch(NegativeBalanceException e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	public static void main (String[] args) throws NegativeBalanceException, FileNotFoundException {
		ATM atm = new ATM();
		atm.handleTransactions();
	}
}