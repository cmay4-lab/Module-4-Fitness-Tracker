import java.util.Scanner;

public class FitnessAppTester {

    // Updating
    private static void addSteps(int steps) {

    }

    private static void calculateDistance() {

    }

    private static void calculateCalories() {

    }

    private static void updateHeartRate(int newHeartRate) {

    }

    // Resetting
    private static void resetDailyStats() {

    }

    // toString method already exists.

    private static void setGoalSteps(int goalSteps) {

    }

    private static void checkGoal() {

    }

    /* Deprecated Code 
    // private static void validateCustomStat(String userInput, String inputType, Scanner input) {
    //     switch (inputType) {
    //         case "String":

    //             String userInputString = input.nextLine();

    //             break;
    //         case "int":

    //             input.nextLine();
    //             System.out.print("...\n");

    //             while (!input.hasNextInt()) {
    //                 System.out.print("Invalid input!\n");
    //                 System.out.print("Enter valid input: ");
    //                 input.nextLine();
                    
    //                 System.out.print("...\n");
    //             }

    //             int userInputInt = input.nextInt();

    //             break;
    //         case "double":

    //             input.nextLine();    

    //             while (!input.hasNextDouble()) {
    //                 input.nextLine();
    //             }

    //             double userInputDouble = input.nextDouble();
    //     }
    // }
    */

    public static void main(String[] args) {
        // Declare objects:
        Scanner input = new Scanner(System.in);     // Obtains input
        FitnessTracker user = new FitnessTracker(); // Retains fitness data 

        // Explain operations that updates, resets, and retrieves data for "user" object.
        System.out.print("\n\nThis program's main purpose is to allow the user to test FitnessTracker.java to see if it works properly.\n");
        System.out.print("This includes updating, reseting, and retrieving the data from a object.\n");
        System.out.print("Here is a list of testing methods you can perform. Perform dianostics to your liking:\n\n");
        // Operations list
        System.out.print("");

        FitnessTracker.user.toString();

        /* Deprecated Code 
        // Ask user if they want get a fresh set of stats,
        // or if they want to input their own.
        // System.out.print("Do you want to input custom stats or maintain default?\n");
        // System.out.print("Enter either 'default' or 'custom': ");

        // String userInput = input.nextLine();
        // System.out.print("...\n");

        // // Validate:
        // while (userInput != "default" && userInput != "custom") {
        //     System.out.print("Invalid answer!\n");
        //     System.out.print("Do you want to input custom stats or maintain default?\n");
        //     System.out.print("Enter either 'default' or 'custom': ");

        //     userInput = input.nextLine();
        //     System.out.print("...\n");
        // }

        // System.out.print("\n\n");

        // if (userInput == "No") {
        //     new FitnessTracker();
        // } else {
        //     userName, dailySteps, distanceWalked, caloriesBurned, heartRate
        //     System.out.print("Enter Username: ");
        //     validateCustomStat(userInput, "String", input);
        // }
         */
    }
}