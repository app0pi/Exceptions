package Default;

public class NegativeBalanceException extends Exception {
	private double negativeBalance;
	private String message;

	public NegativeBalanceException() {
		super();
		message = "Error: negative balance";
	}
	
	public NegativeBalanceException(int negativeBalance) {
		message = "Amount exceeds balance by " + negativeBalance;
	}

	@Override
	public String toString() {
		return "Balance of " + negativeBalance + " not allowed";
	}
	
}