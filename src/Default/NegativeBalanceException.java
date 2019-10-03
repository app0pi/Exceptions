package Default;

import java.io.*;
import java.math.*;
import java.text.*;

public class NegativeBalanceException extends Exception {
	private BigDecimal negativeBalance;
	private String message;

	public NegativeBalanceException() {
		super();
		message = "Error: negative balance";
	}
	
	public NegativeBalanceException(BigDecimal negativeBalance) throws FileNotFoundException {
		this.negativeBalance = negativeBalance;
		message = "Amount exceeds balance by " + negativeBalance.intValue();
		File file = new File("logfile.txt");
		PrintWriter printWriter = new PrintWriter(file);
		printWriter.println(message);
		printWriter.close();
	}

	@Override
	public String toString() {
		return "Balance of " + negativeBalance + " not allowed";
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}