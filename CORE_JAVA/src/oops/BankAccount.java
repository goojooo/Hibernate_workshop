package oops;

import java.util.Scanner;

public class BankAccount {
	private  int accNumber;
	private  String accHolderName;
	private  double deposite;
//	private double ;
	private double withdraw;
	
	public void setAccNumber(int accNumber)
	{
		this.accNumber = accNumber;
	}
	public void setAccHolderName(String accHolderName)
	{
		this.accHolderName = accHolderName;
	}
	public void setDeposite(double deposite)
	{
		this.deposite = deposite;
	}
	public void setWithdraw(double withdraw)
	{
		this.withdraw = withdraw;
	}
	
	public int getAccNumber()
	{
		return accNumber;
	}
	public String getAccHolderName()
	{
		return accHolderName;
	}
	public double getDeposite()
	{
		return deposite;
	}
	public double getWithdraw()
	{
		if(deposite >= withdraw)
		{
			return (deposite - withdraw);
		} else {
			System.out.println("Cannot withdraw more than balance ");
		}
		return withdraw;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount acc = new BankAccount();
		System.out.println("Enter details : ");
		acc.setAccNumber(sc.nextInt());
		sc.nextLine();
		acc.setAccHolderName(sc.nextLine());
		acc.setDeposite(sc.nextInt());
		
		System.out.println(acc.getAccNumber());
		System.out.println(	acc.getAccHolderName());
		System.out.println(acc.getDeposite());
		
		System.out.println("Enter withdraw amount : ");
		acc.setWithdraw(sc.nextInt());
		
		System.out.println("After withdraw : "+acc.getWithdraw());
		

	}

}
/*
 package oops;

import java.util.Scanner;

public class BankAccount {

    private int accNumber;
    private String accHolderName;
    private double balance;

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful!");
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance = " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter Account Number: ");
        acc.setAccNumber(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        acc.setAccHolderName(sc.nextLine());

        System.out.print("Enter Deposit Amount: ");
        acc.deposit(sc.nextDouble());

        acc.displayBalance();

        System.out.print("Enter Withdraw Amount: ");
        acc.withdraw(sc.nextDouble());

        acc.displayBalance();

        sc.close();
    }
}
 
 */
 