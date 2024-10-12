/**
 * 
 * FitnessTracker --- Class to organize the necessary properties and methods to be used in FitnessAppTester.
 * @author            Chase May
 */
public class FitnessTracker {
    public static final double kilometersPerStep = 0.000762;    // Converts steps to kilometers
    public static final double caloriesPerStep = 0.04;          // Converts steps to calories
    
    private String name;                // Stores username.
    private int dailySteps;             // Stores the number of steps taken.
    private double distanceWalked;      // Stores distance walked.
    private double caloriesBurned;      // Stores calories burned.
    private int heartRate;              // Stores heart rate.

    /**
     * 
     * getName --- Gets username. 
     * @return     username
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * setName --- Changes username.
     * @param      userName
     * @return     No return value.
     */
    public void setName(String userName) {

        name = userName;

    }

    /**
     * 
     * getDailySteps --- Gets the current daily step total. 
     * @return           dailySteps
     */
    public int getDailySteps() {

        return dailySteps;

    }

    /**
     * 
     * setDailySteps --- Updates the daily steps total.
     * @param            userDailySteps
     * @return           No return value.
     */
    public void setDailySteps(int userDailySteps) {

        dailySteps = userDailySteps;

    }

    /**
     * 
     * getDistanceWalked --- Gets the current distance walked today.
     * @return               distanceWalked
     */
    public double getDistanceWalked() {

        return distanceWalked;

    }

    /**
     * 
     * setDistanceWalked --- Updates the distance walked today. 
     * @param                userDistanceWalked
     * @return               No return value.
     */
    public void setDistanceWalked(double userDistanceWalked) {

        distanceWalked = userDistanceWalked;

    }
    
    /**
     * 
     * getCaloriesBurned --- Gets the current calories burned today.
     * @return               caloriesBurned
     */
    public double getCaloriesBurned() {

        return caloriesBurned;

    }

    /**
     * 
     * setCaloriesBurned --- Updates the calories burned today.
     * @param                userCaloriesBurned
     * @return               No return value.
     */
    public void setCaloriesBurned(double userCaloriesBurned) {

        caloriesBurned = userCaloriesBurned;

    }

    /**
     * 
     * getHeartRate --- Gets the user's current heart rate.
     * @return          heartRate
     */
    public int getHeartRate() {

        return heartRate;

    }

    /**
     * 
     * setHeartRate --- Updates the user's current heart rate.
     * @param           userHeartRate
     * @return          No return value.
     */
    public void setHeartRate(int userHeartRate) {

        heartRate = userHeartRate;

    }

    /**
     * 
     * FitnessTracker (Default Constructor) --- Constructs a FitnessTracker object with default fields 
     */
    public FitnessTracker() {

        name = "";
        dailySteps = 0;
        distanceWalked = 0;
        caloriesBurned = 0;
        heartRate = 0;

    }

    /**
     * 
     * FitnessTracker (Parameterized Constructor) --- Constructs a FitnessTracker object with the given parameters as field initalizers.
     * @param userName
     * @param userDailySteps
     * @param userDistanceWalked
     * @param userCaloriesBurned
     * @param userHeartRate
     */
    public FitnessTracker(String userName, int userDailySteps, double userDistanceWalked, double userCaloriesBurned, int userHeartRate) {

        name = userName;
        dailySteps = userDailySteps;
        distanceWalked = userDistanceWalked;
        caloriesBurned = userCaloriesBurned;
        heartRate = userHeartRate;
        
    }
}
