package oops.inheritance;

class BankAccount{
	int accountNumber;
	double balance;
	BankAccount(int accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	void deposite(double deposite)
	{
		balance += deposite;
		System.out.println("Amount deposite successfully : " + balance);
	}
	void withdraw(double withdraw)
	{
		if(balance >= withdraw)
		{
			balance -= withdraw;
			System.out.println("Amount withdraw successfully : " + balance);
		} else {
			System.out.println("Please enter valid amount : ");
		}
	}
	
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
