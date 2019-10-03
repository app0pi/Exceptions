package Default;

import java.io.*;
import java.math.*;

public class ATM {
	private BankAccount account;
	
	public ATM() {
		account = new BankAccount(500);
	}

	public void handleTransactions() throws NegativeBalanceException, FileNotFoundException {
		try{
			BigDecimal b;
			account.withdraw(600);
		}
		catch(NegativeBalanceException e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		try{
			account.quickWithdraw(600);
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