package Default;

public class ATM {
	private BankAccount account;
	
	public ATM() {
		account = new BankAccount(500);
	}

	public void handleTransactions() throws NegativeBalanceException {
		try{
			account.withdraw(600);
		}
		catch(NegativeBalanceException e){
			account.withdraw(200);
		}
	}
	public static void main (String[] args) throws NegativeBalanceException {
		ATM atm = new ATM();
		atm.handleTransactions();
		System.out.println(atm.account.getBalance());
	}
}