package Default;

import java.io.*;

public class NegativeBalanceException extends Exception {
	private double negativeBalance;
	private String message;

	public NegativeBalanceException() {
		super();
		message = "Error: negative balance";
	}
	
	public NegativeBalanceException(double negativeBalance) throws FileNotFoundException {
		message = "Amount exceeds balance by " + negativeBalance;
		File file = new File("logfile.txt");
		PrintWriter printWriter = new PrintWriter(file);
		printWriter.println(message);
		printWriter.close();
	}

	@Override
	public String toString() {
		return "Balance of " + negativeBalance + " not allowed";
	}
	
}