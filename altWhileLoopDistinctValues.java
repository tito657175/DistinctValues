import java.util.Scanner;
import java.util.Arrays;

public class altWhileLoopDistinctValues {
    public static void main(String[] args) {
        System.out.print("Max 10 integers.\nEnter -1 to exit.\n");
        Scanner scnr = new Scanner(System.in);

        int userInputArray[] = new int[10];
        int count = 0; // Tracks the number of unique integers added

        while (count < 10) {
            System.out.print("Enter an integer: \n");
            int userInput = scnr.nextInt(); // Store input

            // Check for -1 to exit
            if (userInput == -1) {
                break;
            }

            // Check for duplicates
            boolean foundDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (userInputArray[i] == userInput) {
                    foundDuplicate = true;
                    break; // Exit the loop as soon as a match is found
                }
            }

            // If not a duplicate, add integer to the array
            if (!foundDuplicate) {
                userInputArray[count] = userInput;
                count++;
                System.out.printf("Your input of %d was added to the list.\n", userInput);
            } else {
                System.out.printf("Your input of %d already exists.\n", userInput);
            }

            // Display the array after each input (helps keep track of the Ints)
            // This bit of code can be omitted without any issues
            System.out.println(Arrays.toString(userInputArray));
            System.out.println("\n--------------------");
        }

        // Sort the array and display the final list of unique integers
        Arrays.sort(userInputArray);
        System.out.printf("You have entered %d Unique Integers:\n",count);
        System.out.println(Arrays.toString(userInputArray));

        // Close Scanner
        scnr.close();
    }
}
