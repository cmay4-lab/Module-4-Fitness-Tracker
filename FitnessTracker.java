public class FitnessTracker {
    // public properties (constants)
    public static final double kilometersPerStep = 0.000762;
    public static final double caloriesPerStep = 0.04;
    // Private properties
    private String name;
    private int dailySteps;
    private double distanceWalked;
    private double caloriesBurned;
    private int heartRate;
    

    // userName
    public String getName() {
        return name;
    }
    public void setName(String userName) {
        name = userName;
    }
    // dailySteps
    public int getDailySteps() {
        return dailySteps;
    }
    public void setDailySteps(int userDailySteps) {
        dailySteps = userDailySteps;
    }
    // distanceWalked
    public double getDistanceWalked() {
        return distanceWalked;
    }
    public void setDistanceWalked(double userDistanceWalked) {
        distanceWalked = userDistanceWalked;
    }
    // caloriesBurned
    public double getCaloriesBurned() {
        return caloriesBurned;
    }
    public void setCaloriesBurned(double userCaloriesBurned) {
        caloriesBurned = userCaloriesBurned;
    }
    // heartRate
    public int getHeartRate() {
        return heartRate;
    }
    public void setHeartRate(int userHeartRate) {
        heartRate = userHeartRate;
    }

    // Default Constructor
    public FitnessTracker() {
        name = "";
        dailySteps = 0;
        distanceWalked = 0;
        caloriesBurned = 0;
        heartRate = 0;
    }
    // Parameter Constructor (when properties are known)
    public FitnessTracker(String userName, int userDailySteps, double userDistanceWalked, double userCaloriesBurned, int userHeartRate) {
        name = userName;
        dailySteps = userDailySteps;
        distanceWalked = userDistanceWalked;
        caloriesBurned = userCaloriesBurned;
        heartRate = userHeartRate;
    }
}
