package oops;

import java.util.Scanner;

public class BankAccount {
	private  int accNumber;
	private  String accHolderName;
	private  double balance;
	
	public void setAccNumber(int accNumber)
	{
		this.accNumber = accNumber;
	}
	public void setAccHolderName(String accHolderName)
	{
		this.accHolderName = accHolderName;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public int getAccNumber()
	{
		return accNumber;
	}
	public String getAccHolderName()
	{
		return accHolderName;
	}
	public double getBalance()
	{
		return balance;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount acc = new BankAccount();
		System.out.println("Enter details : ");
		acc.setAccNumber(sc.nextInt());
		sc.nextLine();
		acc.setAccHolderName(sc.nextLine());
		acc.setBalance(sc.nextInt());
		
		System.out.println(acc.getAccNumber());
		System.out.println(	acc.getAccHolderName());
		System.out.println(acc.getBalance());
		

	}

}
