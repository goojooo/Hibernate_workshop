package assignment;

class StepCounter {

    static int[] steps = {3000, 7000, 4500, 8000, 2000, 6000, 7500};

    public static void main(String[] args) {
//        displaySteps();
//        calculateTotalSteps();
//        countActiveDays();
        maximunSteps();
    }

    static void maximunSteps() {
    	int max = steps[0];
  
    	for(int i = 1; i<steps.length; i++)
    	{
    		if(steps[i]>max) {
    			max=steps[i];
    		}
    	}
		System.out.println(max);
		
	}

	static void displaySteps() {
        // Task 1
    	for(int i = 0; i < steps.length; i++)
    	{
    		System.out.println(steps[i]);
    	}
    }

    static void calculateTotalSteps() {
        // Task 
    	int sum = 0;
    	for(int i  = 0 ; i <steps.length ; i++)
    	{
    		sum+=steps[i];
    	}
    	System.out.println("Sum of total steps : "+ sum);
    }

    static void countActiveDays() {
        // Task 3 (active = steps >= 5000)
    	int cnt = 0;
    	for(int i = 0; i<steps.length;i++)
    	{
    		if(steps[i]>=5000)
    		{
    			cnt++;
    		}
    	}
    	System.out.println("Count of how many days crossed 5000 steps : " + cnt);
    }
}

