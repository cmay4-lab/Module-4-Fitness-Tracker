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

    // Retrieving
    // toString method already exists.

    // Other
    private static void setGoalSteps(int goalSteps) {

    }

    private static void checkGoal() {

    }

    public static void main(String[] args) {
        // Create Input Scanner:
        Scanner input = new Scanner(System.in);

        // Create Default Fitness Tracker
        System.out.print("\n\nCreating Default User Profile...\n\n");
       
        FitnessTracker user1 = new FitnessTracker();
        // The User Profiles array contains as many Profiles as the hard coded length allows.
        // So if the imaginary fitness tracker developers need the maximum number of profiles to be 1, 2, 5, etc. then they can just change it here.
        // The reason for why I did not allow the user to create as many profiles/accounts as they want, is because I do not have a clue how to variablize the # of instances.
        // Seemed too much of a hassle... so here is this instead:
        FitnessTracker[] userProfiles;
        userProfiles[0] = user1;
        int maxNumOfProfiles = 3;

        
        // Basic program end-condition
        boolean eof = false;

        // Explain operations that updates, resets, and retrieves data for "user" object. Output
        System.out.print("This program's main purpose is to allow the user to test FitnessTracker.java to see if it works properly.\n");
        System.out.print("This includes updating, resetting, and retrieving the data from a object.\n");
        System.out.print("Here is a list of testing functions you can perform.\n");
        System.out.print("Perform tests to your liking:\n\n");
        
        System.out.print("Commands (Input the listed number for the respective command. All other inputs end the program.):\n");
        System.out.print("\t(1) Set Username\n");
        System.out.print("\t(2) Add Daily Steps\n");
        System.out.print("\t(3) Calculate Distance Walked\n");
        System.out.print("\t(4) Calculate Calories Burned\n");
        System.out.print("\t(5) Update Heart Rate\n");
        System.out.print("\t(6) Reset Daily Stats\n");
        System.out.print("\t(7) Display Summary\n");
        System.out.print("\t(8) Set a Goal of the Number of Steps to Do\n");
        System.out.print("\t(9) Check Goal Progress\n");
        System.out.print("\t(10) Create a New User\n");
        System.out.println();
    
        // Input
        String userInput = input.nextLine();
        System.out.print("\n\n");

        // Needed in switch
        int userInputInt;
        // Validate if whether program should continue or end with user input for name
        switch (userInput) {
            case "1":
                // Premise
                System.out.print("Enter Username: ");
                // Input
                userInput = input.nextLine();
                // Output
                user1.setName(userInput);

                break;
            case "2":
                // Premise
                System.out.print("Add steps: ");
                // Input
                input.next();

                while (!input.hasNextInt()) {
                    System.out.print("\nInvalid number of steps!\n");
                    System.out.print("Add steps: ");
                    input.next();
                } 

                userInputInt = input.nextInt();
                System.out.print("\n\n");

                user1.setDailySteps(userInputInt);


                // Process
                

                addSteps(userInputInt);

                break;
            case "3":
                // Process
                calculateDistance();

                break;
            case "4":
                // Process
                calculateCalories();

                break;
            case "5":
                // Premise
                System.out.print("Update heart rate: ");
                // Input
                input.next();

                while (!input.hasNextInt()) {
                    System.out.print("\nInvalid heart rate!\n");
                    System.out.print("Update heart rate: ");
                    input.next();
                } 
                
                userInputInt = input.nextInt();
                System.out.print("\n\n");
                // Process
                updateHeartRate(userInputInt);

                break;
            case "6":
                break;
            case "7":
                break;
            case "8":
                break;
            case "9":
                break;
            case "10":
                break;
            default:
                eof = true;
        }

        while (!eof) {
            

            
            System.out.print("\n\nThis program's main purpose is to allow the user to test FitnessTracker.java to see if it works properly.\n");
            System.out.print("This includes updating, reseting, and retrieving the data from a object.\n");
            System.out.print("Here is a list of testing methods you can perform. Perform dianostics to your liking:\n\n");
            
            
        }    
    }
}