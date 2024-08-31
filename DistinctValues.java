import java.util.Scanner;
import java.util.Arrays;

public class DistinctValues {
    public static void main(String[] args) {
        System.out.println("\nMax 10 integers. Enter -1 to exit.");
        System.out.println("Enter the first integer: ");
        Scanner scnr = new Scanner(System.in);
        int userInput = scnr.nextInt();

        // Declare empty array
        int userInputArray[] = new int[10];

        // Start program loop until 10 ints
        for (int index = 0; index < 10; index++) {
            boolean foundDuplicate = false; // reset every loop

            // Check for -1
            if (userInput == -1) {
                System.out.println("Exiting the program");
                break;
            }

            // Check for duplicate
            for (int i = 0; i < index; i++) {  // Only loop through the portion of the array that is filled
                if (userInputArray[i] == userInput) {
                    foundDuplicate = true;
                    break; // Exit the loop as soon as a match is found
                }
            }

            // Feedback if duplicate int found
            if (foundDuplicate) {
                System.out.printf("Your input of %d already exists\n", userInput);
                index--; // reset loop counter
            } else {
                // If not a duplicate, add int to Array
                userInputArray[index] = userInput;
                System.out.printf("Your input of %d was added to the Array\n", userInput);
            }

            // REMOVE THIS LATER
            System.out.println("Current Unsorted Array: " + Arrays.toString(userInputArray));
            // REMOVE THIS LATER

            if (index < 9) { // only prompt for input if not the last index
                System.out.print("\nEnter the next integer: \n");
                userInput = scnr.nextInt(); // store next input
            }
        } // End of loop

        // Sort Array
        Arrays.sort(userInputArray);

        // Print Entire Array
        System.out.println(Arrays.toString(userInputArray));

        // Close Scanner
        scnr.close();
    }
}