public class FitnessAppTester {
    private static int currentGoalSteps;

    // Updating
    private static void addSteps(int steps, FitnessTracker fitnessTracker) {
        // Declaration and definition
        int pastStepCount = fitnessTracker.getDailySteps();
        int newStepCount = pastStepCount + steps;

        // Update
        fitnessTracker.setDailySteps(newStepCount);

        // Displaying test results in immersive way
        System.out.print("\n\nTest 1: adding steps to past step count...\n");
        System.out.print("The FitnessTracker object has a property: dailySteps. From which, the user had... " + pastStepCount + "\n");
        System.out.print("However, after an update, the user's new step count is... " + newStepCount);
    }

    private static void calculateDistance(FitnessTracker fitnessTracker) {
        // Declaration and definition
        double pastDistance = fitnessTracker.getDistanceWalked();
        double newDistance = pastDistance + fitnessTracker.getDailySteps()*FitnessTracker.kilometersPerStep;

        // Update
        fitnessTracker.setDistanceWalked(newDistance);

        // Displaying test results in immersive way
        System.out.print("Test 2: calcuating the distance walked in kilometers from the number of steps walked...\n");
        System.out.print("The FitnessTracker object has a property: distanceWalked. From which, the user had... " + pastDistance + "km" + "\n");
        System.out.print("However, after an update, the user's new 'distance walked' is... " + newDistance + "km");
    }

    private static void calculateCalories(FitnessTracker fitnessTracker) {
        // Declaration and definition
        double pastCalorieBurned = fitnessTracker.getCaloriesBurned();
        double newCaloriesBurned = pastCalorieBurned + fitnessTracker.getDailySteps()*FitnessTracker.caloriesPerStep;

        // Update
        fitnessTracker.setCaloriesBurned(newCaloriesBurned);
        // Displaying test results in immersive way
        System.out.print("Test 3: calculating the calories burned from the number of steps walked...\n");
        System.out.print("The FitnessTracker object has a property: caloriesBurned. From which, the user had... " + pastCalorieBurned + "Calories." + "\n");
        System.out.print("However, after an update, the user's new 'calories burned' is... " + newCaloriesBurned + "Calories.");
    }

    private static void updateHeartRate(int newHeartRate, FitnessTracker fitnessTracker) {
        // Update
        fitnessTracker.setHeartRate(newHeartRate);
        // Displaying test results in immersive way
        System.out.print("Test 4: updating the heart rate...\n");
        System.out.print("The FitnessTracker object has a property: heartRate.\n");
        System.out.print("However, after an update, the user's new 'calories burned' is... " + newHeartRate + "Beats Per Minute.");
    }

    // Resetting
    private static void resetDailyStats(FitnessTracker fitnessTracker) {
        fitnessTracker.setDailySteps(0);
        fitnessTracker.setDistanceWalked(0);
        fitnessTracker.setCaloriesBurned(0);

        int newDailySteps = fitnessTracker.getDailySteps();
        double newDistanceWalked = fitnessTracker.getDistanceWalked();
        double newCaloriesBurned = fitnessTracker.getCaloriesBurned();

        // Displaying test results in immersive way
        System.out.print("Resetting daily stats:\n");
        System.out.print("Daily steps is now equal to... " + newDailySteps + "\n");
        System.out.print("Total distance walked is now equal to... " + newDistanceWalked + "\n");
        System.out.print("Total calories burned is now equal to... " + newCaloriesBurned);
    }

    // Retrieving
    // toString method already exists.

    // Other
    private static void setGoalSteps(int goalSteps) {
        // Update
        FitnessAppTester.currentGoalSteps = goalSteps;
        // Displaying test results in immersive way
        System.out.print("Current goal has been updated!\n");
        System.out.print("Your new current goal is... " + currentGoalSteps);
    }

    private static void checkGoal(FitnessTracker fitnessTracker) {
        int currentStepGoal = FitnessAppTester.currentGoalSteps;
        int currentStepTotal = fitnessTracker.getDailySteps();
        
        // Update & Displaying test results in immersive way
        if (currentStepGoal > currentStepTotal) {
            System.out.print("You have not reached your goal yet...");
        } else {
            System.out.print("You have reached your step goal! Great Job!");
        }
    }

    public static void main(String[] args) {
        System.out.print("\n\n");

        // Test constants:
        System.out.print("Text Constants: ")
        System.out.print(FitnessTracker.kilometersPerStep + "\n");
        System.out.print(FitnessTracker.caloriesPerStep + "\n");

        
        // Imaginary examples:

        // Larry - Default (No Parameters)
        FitnessTracker fitnessTracker = new FitnessTracker();
        // Declare goalSteps

        // Larry is a new user, and wants to be more healthy. His stats start out blank but he is going to fix that.
        fitnessTracker.setName("Larry123");
    
        // Larry goes jogging after setting a goal for himself. His tracker updates overtime.
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

        // Near the end of the day Larry checks to see his stats and whether he reached his goal
        fitnessTracker.toString();
        System.out.print("\n\n");

        checkGoal(fitnessTracker);
        System.out.print("\n\n");

        // He then goes asleep, when midnight comes by his daily stats update:
        resetDailyStats(fitnessTracker);
        System.out.print("\n\n");

        // Then attempts to break through his goal again today
        addSteps(5219, fitnessTracker);
        System.out.print("\n\n");
        
        calculateDistance(fitnessTracker);
        System.out.print("\n\n");
        
        calculateCalories(fitnessTracker);
        System.out.print("\n\n");
        
        updateHeartRate(96, fitnessTracker);
        System.out.print("\n\n");

        // He checks to see his stats, and he was amaze with his achievements because it did not feel that difficult that time.
        fitnessTracker.toString();
        System.out.print("\n\n");

        checkGoal(fitnessTracker);
        System.out.print("\n\n");

        // He goes home to rest: "this was fun!"
        resetDailyStats(fitnessTracker);
        System.out.print("\n\n");


        // Mary
        //FitnessTracker marryFitnessTracker = new FitnessTracker("Merry123", 2279, 0.974598, 40.8, 85);

        


        

 
    }
}