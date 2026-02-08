package opps.constructor;

public class BankAccount {
	int accountNumber;
	String accountHolderName;
	double balance = 1000.0;
	
	BankAccount(int accountNumber, String accountHolderName, double balance)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
