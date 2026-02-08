package opps.constructor;

import java.util.Scanner;

public class BankAccount {
	int accountNumber;
	String accountHolderName;
	double balance ;
	
	BankAccount(int accountNumber, String accountHolderName, double balance)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	void deposite(double deposite)
	{
		 
		balance += deposite ;
		System.out.println("Updated balance successfully: ");
	}
	
	void withdraw(double withdraw)
	{
		if(balance >= withdraw)
		{
			balance = balance - withdraw;
			System.out.println("Withdraw balance successfully: ");
		}else
		{
		    System.out.println("Insufficient Balance!");
		}

	}
	
	void displayBalance()
	{
		System.out.println("Current balance : " + balance);
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number :");
		int accNo = sc.nextInt();
		sc.nextLine(); // clean buffer
		
		System.out.println("Enter Account holder name : ");
		String name = sc.nextLine();
		
		
		System.out.println("Enter deposite number : ");
		double bal = sc.nextDouble();
		BankAccount ba = new BankAccount(accNo, name,bal);
		double dep = sc.nextDouble();
		
		ba.deposite(dep);
		ba.displayBalance();
		
		System.out.println("Enter withdraw amount : ");
		double with = sc.nextDouble();
		ba.withdraw(with);
		ba.displayBalance();
		
		sc.close();
		
	}

}
