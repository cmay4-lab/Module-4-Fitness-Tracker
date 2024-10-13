/**
 * 
 * FitnessAppTester --- Program to test and print values from the FitnessTracker Class
 * @author              Chase May
 */
public class FitnessAppTester {

    private static int currentGoalSteps;    // Stores the current daily step goal that the user makes.

    /**
     * 
     * addSteps --- Adds steps to the dailySteps field.
     * @param       steps
     * @param       fitnessTracker
     * @return      No return value.
     */
    private static void addSteps(int steps, FitnessTracker fitnessTracker) {

        int pastStepCount = fitnessTracker.getDailySteps();    // Stores the existing total of daily steps into pastStepCount.
        int newStepCount = pastStepCount + steps;              // Sums up the pastStepCount with the steps and store into newStepCount.

        fitnessTracker.setDailySteps(newStepCount);            // Sets the dailySteps field of fitnessTracker to equal newStepCount. 

        System.out.print("Test 1: adding steps to past step count...\n");
        System.out.print("The FitnessTracker object has a property: dailySteps. From which, the user had... " + pastStepCount + " steps." + "\n");
        System.out.print("However, after an update, the user's new step count is... " + newStepCount + " steps.");
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
        System.out.print("The FitnessTracker object has a property: distanceWalked. From which, the user had... " + pastDistance + " km." + "\n");
        System.out.print("However, after an update, the user's new 'distance walked' is... " + newDistance + " km.");
        
    }

    /**
     * 
     * calculateCalories --- Calculates the updated calories burned to set it into the CaloriesBurned field.
     * @param                fitnessTracker
     * @return               No return value.
     */
    private static void calculateCalories(FitnessTracker fitnessTracker) {

        double pastCalorieBurned = fitnessTracker.getCaloriesBurned();
        double newCaloriesBurned = pastCalorieBurned + fitnessTracker.getDailySteps()*FitnessTracker.caloriesPerStep;

        fitnessTracker.setCaloriesBurned(newCaloriesBurned);

        System.out.print("Test 3: calculating the calories burned from the number of steps walked...\n");
        System.out.print("The FitnessTracker object has a property: caloriesBurned. From which, the user had... " + pastCalorieBurned + " calories." + "\n");
        System.out.print("However, after an update, the user's new 'calories burned' is... " + newCaloriesBurned + " calories.");

    }

    /**
     * 
     * updateHeartRate --- Updates the heartRate field to the given heart rate.
     * @param              newHeartRate
     * @param              fitnessTracker
     * @return             No return value.
     */
    private static void updateHeartRate(int newHeartRate, FitnessTracker fitnessTracker) {

        fitnessTracker.setHeartRate(newHeartRate);

        System.out.print("Test 4: updating the heart rate...\n");
        System.out.print("The FitnessTracker object has a property: heartRate.\n");
        System.out.print("However, after an update, the user's new 'calories burned' is... " + newHeartRate + "beats per minute.");

    }

    /**
     * 
     * resetDailyStats --- Sets the fields daily steps, distance walked, and calories burned back to 0. 
     * @param              fitnessTracker
     * @return             No return value.
     */
    private static void resetDailyStats(FitnessTracker fitnessTracker) {

        fitnessTracker.setDailySteps(0);
        fitnessTracker.setDistanceWalked(0);
        fitnessTracker.setCaloriesBurned(0);

        int newDailySteps = fitnessTracker.getDailySteps();
        double newDistanceWalked = fitnessTracker.getDistanceWalked();
        double newCaloriesBurned = fitnessTracker.getCaloriesBurned();

     
        System.out.print("Resetting daily stats:\n");
        System.out.print("Daily steps is now equal to... " + newDailySteps + " steps." + "\n");
        System.out.print("Total distance walked is now equal to... " + newDistanceWalked + " km." + "\n");
        System.out.print("Total calories burned is now equal to... " + newCaloriesBurned + " calories.");

    }

    /**
     * 
     * setGoalSteps --- Sets a daily step goal for the user to reach. 
     * @param           goalSteps
     * @return          No return value.
     */
    private static void setGoalSteps(int goalSteps) {
     
        FitnessAppTester.currentGoalSteps = goalSteps;

        System.out.print("Current goal has been updated!\n");
        System.out.print("Your new current goal is... " + currentGoalSteps + " steps.");

    }

    /**
     * 
     * checkGoal --- Checks whether the daily steps goal was reached yet. If so, it prints a congratulatory statement to the user's terminal.
     *               Else, it tells the user that they have not reach their goal through the terminal. 
     * @param        fitnessTracker
     * @return       No return value.
     */
    private static void checkGoal(FitnessTracker fitnessTracker) {

        int currentStepGoal = FitnessAppTester.currentGoalSteps;
        int currentStepTotal = fitnessTracker.getDailySteps();
        
        if (currentStepGoal > currentStepTotal) {
            System.out.print("You have not reached your goal yet...");
        } else {
            System.out.print("You have reached your step goal! Great Job!");
        }

    }

    /**
     * 
     * main --- Uses all methods of the FitnessAppTester to test out the FitnessTracker class.
     *          Also, utilizes all features of the FitnessTracker class in a organized immersive way to emulate a real fitness tracker.  
     * @param   args
     * @return  No return value.
     */
    public static void main(String[] args) {

        System.out.print("\n\n");                                     // Prints new lines to distingush where the console's preconfigurations end and where the main method begins.
        System.out.print("Text Constants: \n");                         // Prints basic header.
        System.out.print(FitnessTracker.kilometersPerStep + "\n");      // Prints and test the FitnessTracker constant property: kilometersPerStep.
        System.out.print(FitnessTracker.caloriesPerStep + "\n\n");        // Prints and test the FitnessTracker constant property: caloriesPerSteps.

        // The main idea behind this next section is that the tests simulate an imaginary user using their fitness tracker
        // This is the 1st user, and this is their 1st day.

        FitnessTracker fitnessTracker = new FitnessTracker();       // Instantiates a blank FitnessTracker object to test the default constructor.
    
        fitnessTracker.setName("Larry123");     // Tests the username setter method from the FitnessTracker class. 
    
        setGoalSteps(5000);                            // Simulate the imaginary user's daily step goal with the setGoalSteps test method. 
        System.out.print("\n\n");                              // Spaces out simulator/test operations.
        
        addSteps(3102, fitnessTracker);                    // Simulate the added number of steps from imaginary user with the addSteps test method.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.
        
        calculateDistance(fitnessTracker);                       // Simulate the change in distance from walking with the calculateDistance test method.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.
        
        calculateCalories(fitnessTracker);                       // Simulate the change in calories from walking with the calculateCalories test method.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.
        
        updateHeartRate(110, fitnessTracker);       // Simulate the change in heart rate from walking with the updateHeartRate test method.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.

        fitnessTracker.toString();                               // Simulate the info the imaginary user sees when they check their stats at the end of the day with the toString method.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.

        checkGoal(fitnessTracker);                               // Simulate the info the imaginary user sees when they check their progress to their tracker's daily step goal.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.

        resetDailyStats(fitnessTracker);                         // Resets the daily statistics at the imaginary midnight/end of day back to 0 with the resetDailyStats method.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.

        // This is the 1st user on their 2nd day.

        addSteps(5219, fitnessTracker);                    // Simulate the added number of steps from imaginary user with the addSteps test method. 
        System.out.print("\n\n");                              // Spaces out simulator/test operations.
        
        calculateDistance(fitnessTracker);                       // Simulate the change in distance from walking with the calculateDistance test method.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.
        
        calculateCalories(fitnessTracker);                       // Simulate the change in calories from walking with the calculateCalories test method.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.
        
        updateHeartRate(96, fitnessTracker);        // Simulate the change in heart rate from walking with the updateHeartRate test method.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.

        fitnessTracker.toString();                               // Simulate the info the imaginary user sees when they check their stats at the end of the day with the toString method.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.

        checkGoal(fitnessTracker);                               // Simulate the info the imaginary user sees when they check their progress to their tracker's daily step goal.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.

        resetDailyStats(fitnessTracker);                         // Resets the daily statistics at the imaginary midnight/end of day back to 0 with the resetDailyStats method.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.

        // This is the 2nd user on their 1st day.

        FitnessTracker fitnessTracker2 = new FitnessTracker();      // Instantiates a filled out FitnessTracker object to test the parameterized constructor.

        addSteps(2954, fitnessTracker2);                   // Simulate the added number of steps from imaginary user with the addSteps test method. 
        System.out.print("\n\n");                              // Spaces out simulator/test operations.
        
        calculateDistance(fitnessTracker2);                      // Simulate the change in distance from walking with the calculateDistance test method.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.
        
        calculateCalories(fitnessTracker2);                      // Simulate the change in calories from walking with the calculateCalories test method.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.
        
        updateHeartRate(124, fitnessTracker2);      // Simulate the change in heart rate from walking with the updateHeartRate test method.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.

        fitnessTracker2.toString();                              // Simulate the info the imaginary user sees when they check their stats at the end of the day with the toString method.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.

        checkGoal(fitnessTracker2);                              // Simulate the info the imaginary user sees when they check their progress to their tracker's daily step goal.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.

        resetDailyStats(fitnessTracker2);                        // Resets the daily statistics at the imaginary midnight/end of day back to 0 with the resetDailyStats method.
        System.out.print("\n\n");                              // Spaces out simulator/test operations.
    }
}