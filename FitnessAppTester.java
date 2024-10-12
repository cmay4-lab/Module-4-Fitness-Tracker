/**
 * 
 * FitnessAppTester --- Program to test and print values from the FitnessTracker Class
 * @author              Chase May
 */
public class FitnessAppTester {

    private static int currentGoalSteps;    // Stores the current daily step goal that the user makes.

    /**
     * 
     * addSteps --- Adds steps to the daily step field.
     * @param       steps
     * @param       fitnessTracker
     * @return      No return value.
     */
    private static void addSteps(int steps, FitnessTracker fitnessTracker) {

        int pastStepCount = fitnessTracker.getDailySteps();    // Stores the existing total of daily steps into pastStepCount.
        int newStepCount = pastStepCount + steps;              // Sums up the pastStepCount with the steps and store into newStepCount.

        fitnessTracker.setDailySteps(newStepCount);            // Sets the dailySteps field of fitnessTracker to equal newStepCount. 

        System.out.print("\n\nTest 1: adding steps to past step count...\n");
        System.out.print("The FitnessTracker object has a property: dailySteps. From which, the user had... " + pastStepCount + "\n");
        System.out.print("However, after an update, the user's new step count is... " + newStepCount);
    }

    /**
     * 
     * calculateDistance --- Calculates the updated distance walked to set it into the distanceWalked field.  
     * @param                fitnessTracker
     * @return               No return value.
     */
    private static void calculateDistance(FitnessTracker fitnessTracker) {

        double pastDistance = fitnessTracker.getDistanceWalked();
        double newDistance = pastDistance + fitnessTracker.getDailySteps()*FitnessTracker.kilometersPerStep;

        fitnessTracker.setDistanceWalked(newDistance);

        System.out.print("Test 2: calcuating the distance walked in kilometers from the number of steps walked...\n");
        System.out.print("The FitnessTracker object has a property: distanceWalked. From which, the user had... " + pastDistance + "km" + "\n");
        System.out.print("However, after an update, the user's new 'distance walked' is... " + newDistance + "km");
        
    }

    private static void calculateCalories(FitnessTracker fitnessTracker) {

        double pastCalorieBurned = fitnessTracker.getCaloriesBurned();
        double newCaloriesBurned = pastCalorieBurned + fitnessTracker.getDailySteps()*FitnessTracker.caloriesPerStep;

        fitnessTracker.setCaloriesBurned(newCaloriesBurned);

        System.out.print("Test 3: calculating the calories burned from the number of steps walked...\n");
        System.out.print("The FitnessTracker object has a property: caloriesBurned. From which, the user had... " + pastCalorieBurned + "Calories." + "\n");
        System.out.print("However, after an update, the user's new 'calories burned' is... " + newCaloriesBurned + "Calories.");

    }

    private static void updateHeartRate(int newHeartRate, FitnessTracker fitnessTracker) {

        fitnessTracker.setHeartRate(newHeartRate);

        System.out.print("Test 4: updating the heart rate...\n");
        System.out.print("The FitnessTracker object has a property: heartRate.\n");
        System.out.print("However, after an update, the user's new 'calories burned' is... " + newHeartRate + "Beats Per Minute.");

    }

    private static void resetDailyStats(FitnessTracker fitnessTracker) {

        fitnessTracker.setDailySteps(0);
        fitnessTracker.setDistanceWalked(0);
        fitnessTracker.setCaloriesBurned(0);

        int newDailySteps = fitnessTracker.getDailySteps();
        double newDistanceWalked = fitnessTracker.getDistanceWalked();
        double newCaloriesBurned = fitnessTracker.getCaloriesBurned();

     
        System.out.print("Resetting daily stats:\n");
        System.out.print("Daily steps is now equal to... " + newDailySteps + "\n");
        System.out.print("Total distance walked is now equal to... " + newDistanceWalked + "\n");
        System.out.print("Total calories burned is now equal to... " + newCaloriesBurned);

    }

    private static void setGoalSteps(int goalSteps) {
     
        FitnessAppTester.currentGoalSteps = goalSteps;

        System.out.print("Current goal has been updated!\n");
        System.out.print("Your new current goal is... " + currentGoalSteps);

    }

    private static void checkGoal(FitnessTracker fitnessTracker) {

        int currentStepGoal = FitnessAppTester.currentGoalSteps;
        int currentStepTotal = fitnessTracker.getDailySteps();
        
        if (currentStepGoal > currentStepTotal) {
            System.out.print("You have not reached your goal yet...");
        } else {
            System.out.print("You have reached your step goal! Great Job!");
        }

    }

    public static void main(String[] args) {

        System.out.print("\n\n");

        //
        System.out.print("Text Constants: ");
        System.out.print(FitnessTracker.kilometersPerStep + "\n");
        System.out.print(FitnessTracker.caloriesPerStep + "\n");

        
        //

        //
        FitnessTracker fitnessTracker = new FitnessTracker();
        //

        //
        fitnessTracker.setName("Larry123");
    
        //
        setGoalSteps(5000);
        System.out.print("\n\n");
        
        addSteps(3102, fitnessTracker);
        System.out.print("\n\n");
        
        calculateDistance(fitnessTracker);
        System.out.print("\n\n");
        
        calculateCalories(fitnessTracker);
        System.out.print("\n\n");
        
        updateHeartRate(110, fitnessTracker);
        System.out.print("\n\n");

        //
        fitnessTracker.toString();
        System.out.print("\n\n");

        checkGoal(fitnessTracker);
        System.out.print("\n\n");

        //
        resetDailyStats(fitnessTracker);
        System.out.print("\n\n");

        //
        addSteps(5219, fitnessTracker);
        System.out.print("\n\n");
        
        calculateDistance(fitnessTracker);
        System.out.print("\n\n");
        
        calculateCalories(fitnessTracker);
        System.out.print("\n\n");
        
        updateHeartRate(96, fitnessTracker);
        System.out.print("\n\n");

        //
        fitnessTracker.toString();
        System.out.print("\n\n");

        checkGoal(fitnessTracker);
        System.out.print("\n\n");

        //
        resetDailyStats(fitnessTracker);
        System.out.print("\n\n");
    }
}