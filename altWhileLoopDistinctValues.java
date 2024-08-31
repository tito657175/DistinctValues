import java.util.Scanner;
import java.util.Arrays;

public class DistinctValues {
    public static void main(String[] args) {
        System.out.print("Max 10 integers.\nEnter -1 to exit.\n");
        Scanner scnr = new Scanner(System.in);

        int userInputArray[] = new int[10];
        int count = 0; // Tracks the number of unique integers added

        while (count < 10) {
            System.out.print("Enter an integer: ");
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

            // If not a duplicate, add the integer to the array
            if (!foundDuplicate) {
                userInputArray[count] = userInput;
                count++;
                System.out.printf("Your input of %d was added to the list.\n", userInput);
            } else {
                System.out.printf("Your input of %d already exists.\n", userInput);
            }

            // REMOVE THIS LATER: Display the array after each input
            System.out.println(Arrays.toString(userInputArray));
            System.out.println("\n--------------------");
        }

        // Sort the array and display the final list of unique integers
        Arrays.sort(userInputArray, 0, count); // Sort only the portion of the array that was filled
        System.out.println("You have entered " + count + " Unique Integers:");
        System.out.println(Arrays.toString(Arrays.copyOf(userInputArray, count)));

        // Close Scanner
        scnr.close();
    }
}
