package assignment;

public class ATMAnalyzer {

    static String[] type = {"D", "W", "W", "D", "W"};
    static int[] amount = {5000, 2000, 4000, 3000, 7000};

    static int initialBalance = 3000;

    public static void main(String[] args) {
//        displayTransactions();
        calculateFinalBalance();
        countDepositsAndWithdrawals();
        findHighestDeposit();
        findFailedWithdrawals();
    }

    static void displayTransactions() {
        // Task 1
    	System.out.println("ALL TRANSCATIONS : ");
    	for(int i = 0 ; i < type.length; i++)
    	{
    		System.out.println("Transactions : " + type[i] + " | "+ "Amount : " + amount[i] );
    	}
    }

    static void calculateFinalBalance() {
        // Task 2
    	int finalBal = initialBalance;
    	for(int i = 0 ; i < type.length ; i++ )
    	{
    		
    			if(type[i] == "D")
    			{
    				finalBal += amount[i];
    			} else if(type[i] == "W")
    			{
    				finalBal -= amount[i];
    			}
    		
    	}
    	System.out.println(finalBal);
    }

    static void countDepositsAndWithdrawals() {
        // Task 3 & 4
       	int dCnt = 0, wCnt = 0;;
    	for(int i = 0 ; i < type.length ; i++ )
    	{
    		
    			if(type[i] == "D")
    			{
    				dCnt++;
    			} else if(type[i] == "W")
    			{
    				wCnt++;
    			}
    		
    	}
    	System.out.println("Deposite count : " + dCnt +"\n" + "Withdraw count : " + wCnt);
    }
    

    static void findHighestDeposit() {
        // Task 5
    	for(int i = 0 ; i < type.length ; i++)
    	{
    		if(type[i] == "D")
    		{
    				for(int  j = 0; j < amount.length ; j++)
    				{
    					if(amount[i] > amount[j])
    					{
    						int temp = amount[i];
    						amount[i] = amount[j];
    						amount[j] =temp;
    					}
    				}
    		}
    	}
    }

    static void findFailedWithdrawals() {
        // Task 7
    }
}

