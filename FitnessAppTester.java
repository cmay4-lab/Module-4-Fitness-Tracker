public class FitnessAppTester {

    // Updating
    private static void addSteps(int steps) {
        FitnessTracker FitnessTracker = new FitnessTracker();

        int currentStepCount = FitnessTracker.getDailySteps();
        int newStepCount = currentStepCount + steps;

        System.out.print("\n\nTest 1: adding steps to zero...\n");
        System.out.print("The FitnessTracker object has a property: dailySteps. From which, the number of steps is currently... " + currentStepCount + "\n");
        System.out.print("However, the added steps updates the step count to... " + newStepCount);

        FitnessTracker = new FitnessTracker("Larry123", 2279, 0.974598, 40.8, 85);

        currentStepCount = FitnessTracker.getDailySteps();
        newStepCount = currentStepCount + steps;

        System.out.print("\n\nTest 2: adding steps to past step count...\n");
        System.out.print("The FitnessTracker object has a property: dailySteps. From which, the number of steps is currently... " + currentStepCount + "\n");
        System.out.print("However, the added steps updates the step count to... " + newStepCount);
    }

    private static void calculateDistance() {
        FitnessTracker FitnessTracker = new FitnessTracker();

        double currentDistance = FitnessTracker.getDistanceWalked();
        double newDistance = FitnessTracker.getDistanceWalked() + 

        System.out.print("\n\nTest 3: adding the same steps but in kilometers to the distance walked...\n");
        System.out.print("The FitnessTracker object has a property: distanceWalked. From which, the distance walked is currently... " + currentDistance + "\n");
        System.out.print("However, the added steps updates the distance walked to... " + newStepCount);

        FitnessTracker = new FitnessTracker("Larry123", 2279, 0.974598, 40.8, 85);

        currentStepCount = FitnessTracker.getDailySteps();
        newStepCount = currentStepCount + steps;

        System.out.print("\n\nTest 1: adding steps to past step count...\n");
        System.out.print("The FitnessTracker object has a property: dailySteps. From which, the number of steps is currently... " + currentStepCount + "\n");
        System.out.print("However, the added steps updates the step count to... " + newStepCount);

    }

    private static void calculateCalories() {

    }

    private static void updateHeartRate(int newHeartRate) {

    }

    // Resetting
    private static void resetDailyStats() {

    }

    // Retrieving
    // toString method already exists.

    // Other
    private static void setGoalSteps(int goalSteps) {

    }

    private static void checkGoal() {

    }

    public static void main(String[] args) {
        // Test constants  
        System.out.println(FitnessTracker.kilometersPerStep);
        System.out.println(FitnessTracker.caloriesPerStep);
        
        FitnessTracker fitnessTracker = new FitnessTracker();

        // Larry is a new user, and wants to be more healthy. Their stats are currently blank but he is going to fix that.
        
        // Larry first puts in a username:
        fitnessTracker.setName("Larry123");
        // Larry then goes on a jog with his fitness tracker on, which will update all his stats:
        addSteps(300);
        calculateDistance();
        calculateCalories();


        

 
    }
}