package assignment;
//Display all login attempts
//
//Count total failed attempts
//
//Detect if account gets locked
//
//Find longest failure streak
//
//Print final account status (LOCKED / ACTIVE)
class LoginValidator {

    static String[] attempts = {
        "SUCCESS", "FAIL", "FAIL", "SUCCESS",
        "FAIL", "FAIL", "FA	IL", "SUCCESS"
    };

    public static void main(String[] args) {
//        displayAttempts();
//        countFailures();
        checkAccountLock();
    }

    static void displayAttempts() {
        // Task 1
    	for(int i = 0 ; i<attempts.length ; i++)
    	{
    		System.out.println((i+1) +": Login attempts => " + attempts[i]);
    	}
    }

    static void countFailures() {
        // Task 2
    	int failedAtt = 0 ;
    	for(int i = 0 ; i < attempts.length; i++)
    	{
    		if(attempts[i] == "FAIL")
    		{
    			failedAtt++;
    		}
    	}
    	System.out.println("Count total failed attempts : "+ failedAtt);
    }

    static void checkAccountLock() {
        // Task 3 (3 consecutive FAIL → LOCK)
    	int failedAtt = 0 ;
    	for(int i = 0 ; i < attempts.length; i++)
    	{
    		if(attempts[i] == "FAIL")
    		{
    			failedAtt++;
    			
    			if(failedAtt == 3)
    			break;
    		} else {
    			failedAtt = 0;
    		}
    	}
    	System.out.println("Count total failed attempts is exceeded and account is locked : "+ failedAtt);
    }
}
