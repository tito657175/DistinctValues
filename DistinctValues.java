import java.util.Scanner;
import java.util.Arrays;

public class DistinctValues{
    public static void main(String[] args){
        System.out.print("Max 10 integers.\nEnter -1 to exit.\n");
        System.out.print("Enter the first integer: \n");
        Scanner scnr = new Scanner(System.in);
        int userInput = scnr.nextInt(); //store input

        //Declare empty array
        int userInputArray[] = new int[10];
    
        //Start program loop until 10 ints
        for (int count = 0; count <= 10; count++){

            boolean foundDuplicate = false; // reset every loop

            //Check for -1
            if (userInput == -1){
                Arrays.sort(userInputArray);
                System.out.println("Here is the list of integers");
                System.out.println(Arrays.toString(userInputArray));
                break;

            // Check for duplicate
            } else if (foundDuplicate == false) {
                // Loop through array check for int
                for (int i = 0; i < count; i++) {
                    if (userInputArray[i] == userInput) {
                        foundDuplicate = true; 
                        break; // Exit the loop as soon as a match is found
                    }
                }
                // Feedback if duplicate int found
                if (foundDuplicate) {
                    System.out.printf("Your input of %d already exists\n", userInput);
                    count --; // reset loop counter

                //If no duplicate add int to Array
                } else {
                    userInputArray[count] = userInput;
                    System.out.printf("Your input of %d was added to the list\n", userInput);
            }

            //REMOVE THIS LATER
            System.out.println("\n--------------------");
            System.out.println(Arrays.toString(userInputArray)); 
            //REMOVE THIS LATER

            System.out.print("\nEnter the next integer: \n");
            userInput = scnr.nextInt(); //store next input
        }
        
    }//End of loop

    //Sort Array
    Arrays.sort(userInputArray);

    //Print Entire Array
    System.out.println(Arrays.toString(userInputArray));

    //Close Scanner
    scnr.close();
}
}