package assignment;
/*
Display all battery usage values

Calculate total battery consumption

Count how many sessions consumed more than 10% battery

Find the maximum battery drain in a session

Check if battery was used responsibly

Responsible = no session used more than 30%
 * */

class BatteryUsage {

    static int[] usage = {5, 12, 8, 25, 10, 15};

    public static void main(String[] args) {
        displayUsage();
        calculateTotalUsage();
        countHeavyUsage();
        findMaxUsage();          // later
        checkResponsibleUsage(); // later
    }

    static void displayUsage() {
        // Task 1
    	for(int i = 0 ; i < usage.length ; i++)
    	{
    		System.out.println("Session number "+ (i+1) +" : "+usage[i]);
    	}
    }

    static void calculateTotalUsage() {
        // Task 2
    	int tb=0;
    	for(int i = 0 ; i<usage.length;i++)
    	{
    		tb += usage[i];
    	}
    	System.out.println("Total usage of battery : " + tb);
    }

    static void countHeavyUsage() {
        // Task 3 (usage > 10)
    	int cnt = 0;
    	for(int i = 0 ; i < usage.length;i++)
    	{
    		if(usage[i] > 10)
    		{
    			cnt++;
    		}
    	}
    	System.out.println("Count of how many sessions consumed more than 10% battery : "
    			+ cnt);
    }

    static void findMaxUsage() {
        // Task 4
    	int max = usage[0];
    	for(int i = 1 ; i < usage.length ; i++)
    	{
    		if(usage[i] > max)
    		{
    			max = usage[i];
    		}
    	}
    	System.out.println("Max consumption : " + max);
    }

//    static void checkResponsibleUsage() {
//        // Task 5 (no value > 30)
//    	int good = 0;
//    	for(int i = 1 ; i < usage.length ; i++)
//    	{
//    		if(usage[i] > 30)
//    		{
//    			good++;
//    		}
//    	}
//    	System.out.println("The session used more than 30% : " + good);
//    }
    static void checkResponsibleUsage() {
        boolean isResponsible = true;

        for (int i = 0; i < usage.length; i++) {
            if (usage[i] > 30) {
                isResponsible = false;
                break;
            }
        }

        if (isResponsible) {
            System.out.println("Battery was used responsibly");
        } else {
            System.out.println("Battery was NOT used responsibly");
        }
    }

}

