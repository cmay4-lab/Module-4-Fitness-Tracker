import java.util.Scanner;

public class FitnessAppTester {

    private static void addSteps(int steps) {

    }

    private static void calculateDistance() {

    }

    private static void calculateCalories() {

    }

    private static void updateHeartRate(int newHeartRate) {

    }

    private static void resetDailyStats() {

    }

    // toString method

    private static void setGoalSteps(int goalSteps) {

    }

    private static void checkGoal() {

    }

    private static void validateCustomStat(String userInput, String inputType, Scanner input) {
        switch (inputType) {
            case "String":

                String userInputString = input.nextLine();

                break;
            case "int":

                input.nextLine();
                System.out.print("...\n");

                while (!input.hasNextInt()) {
                    System.out.print("Invalid input!\n");
                    System.out.print("Enter Username: ");
                    input.nextLine();
                    
                    System.out.print("...\n");
                }

                int userInputInt = input.nextInt();

                break;
            case "double":

                input.nextLine();    

                while (!input.hasNextDouble()) {
                    input.nextLine();
                }

                double userInputDouble = input.nextDouble();
        }
    }

    public static void main(String[] args) {
        // Declare an scanner object for input.
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        // Ask user if they want get a fresh set of stats,
        // or if they want to input their own.
        
        System.out.print("\n\nStarting Program...\n");
        System.out.print("Do you want to input custom stats or maintain default?\n");
        System.out.print("Enter either 'default' or 'custom': ");

        String userInput = input.nextLine();
        System.out.print("...\n");

        // Validate:
        while (userInput != "default" && userInput != "custom") {
            System.out.print("Invalid answer!\n");
            System.out.print("Do you want to input custom stats or maintain default?\n");
            System.out.print("Enter either 'default' or 'custom': ");

            userInput = input.nextLine();
            System.out.print("...\n");
        }

        System.out.print("\n\n");

        if (userInput == "No") {
            new FitnessTracker();
        } else {
            //userName, dailySteps, distanceWalked, caloriesBurned, heartRate
            System.out.print("Enter Username: ");
            validateCustomStat(userInput, "String");

        }

    }
}