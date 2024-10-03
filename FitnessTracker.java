public class FitnessTracker {
    // public properties (constants)
    public static final double kilometersPerStep = 0.000762;
    public static final double caloriesPerStep = 0.04;
    // Private properties
    private static String userName;
    private static int dailySteps;
    private static double distanceWalked;
    private static double caloriesBurned;
    private static int heartRate;

    // userName
    public static String getUserName() {
        return userName;
    }
    public static void setUserName(String userName) {
        FitnessTracker.userName = userName;
    }
    // dailySteps
    public static int getDailySteps() {
        return dailySteps;
    }
    public static void setDailySteps(int dailySteps) {
        FitnessTracker.dailySteps = dailySteps;
    }
    // distanceWalked
    public static double getDistanceWalked() {
        return distanceWalked;
    }
    public static void setDistanceWalked(double distanceWalked) {
        FitnessTracker.distanceWalked = distanceWalked;
    }
    // caloriesBurned
    public static double getCaloriesBurned() {
        return caloriesBurned;
    }
    public static void setCaloriesBurned(double caloriesBurned) {
        FitnessTracker.caloriesBurned = caloriesBurned;
    }
    // heartRate
    public static int getHeartRate() {
        return heartRate;
    }
    public static void setHeartRate(int heartRate) {
        FitnessTracker.heartRate = heartRate;
    }

    // Default Constructor
    public FitnessTracker() {
        userName = "";
        dailySteps = 0;
        distanceWalked = 0;
        caloriesBurned = 0;
        heartRate = 0;
    }
    // Parameter Constructor (when properties are known)
    public FitnessTracker(String userName, int dailySteps, double distanceWalked, double caloriesBurned, int heartRate) {
        FitnessTracker.userName = userName;
        FitnessTracker.dailySteps = dailySteps;
        FitnessTracker.distanceWalked = distanceWalked;
        FitnessTracker.caloriesBurned = caloriesBurned;
        FitnessTracker.heartRate = heartRate;
    }
}
