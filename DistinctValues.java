import java.util.Scanner;
import java.util.Arrays;

public class DistinctValues{
    public static void main(String[] args){
        System.out.print("Max 10 integers.\nEnter -1 to exit.\n");
        System.out.print("Enter the first integer: \n");
        Scanner scnr = new Scanner(System.in);
        int userInput = scnr.nextInt(); //store first unchecked input

        //Declare empty array and make 10 index long
        int userInputArray[] = new int[10];
        int count;
    
        for (count = 0; count < 10; count++){
            if (userInput == -1){
                Arrays.sort(userInputArray);
                System.out.println("Here is the list of integers");
                System.out.println(Arrays.toString(userInputArray));
                break;
            } else {
                Arrays.sort(userInputArray);
                System.out.println(Arrays.binarySearch(userInputArray, userInput));
                System.out.println("\n--------------------");
                if (Arrays.binarySearch(userInputArray, userInput) >= 0){ //returns positive if number is found
                    count--; 
                    System.out.printf("Your input of %d already exists\n" , userInput);
                } else {
                    userInputArray[count] = userInput;
                    System.out.printf("Your input of %d was added to the list\n" , userInput);
                }
            }
            System.out.println("\n--------------------");
            System.out.println(Arrays.toString(userInputArray));

            System.out.print("\nEnter the next integer: \n");
            userInput = scnr.nextInt(); //store next input
        }

        System.out.println(Arrays.toString(userInputArray));
        scnr.close();
    }
} 
    /* //(DO NOT FORGET TO REMOVE) Reassign array for testing
        userInput = new int[]{3, 3, 22, 6, 4, 3,7,-1,0,-1};
        System.out.println(Arrays.toString(userInput));
        System.out.println("--------------------------"); */

    // //Check and stop at -1
    // int cutInput[] = new int[10];

    // for (int index = 0; index < userInputArray.length; index++){ 
    //     if (userInputArray[index] == -1) {
    //         break; //stops at -1
    //     }
    //     cutInput[index] = userInputArray[index];
    // } 
    // // TEST CutArray
    // System.out.println(Arrays.toString(cutInput));
    // System.out.println("--------------------------");

    // // Sort array
    // Arrays.sort(cutInput);
    // // TEST cutArray
    // System.out.println(Arrays.toString(cutInput));
    // System.out.println("--------------------------");

    // // Remove duplicates
    //     int[] uniqueOutput = new int[cutInput.length];
    //     int j = 0;

    //     for (int i = 0; i < cutInput.length - 1; i++) {
    //         if (cutInput[i] != cutInput[i + 1]) {
    //             uniqueOutput[j++] = cutInput[i];
    //         }
    //     }
    //      // Add the last array element
    //      uniqueOutput[j++] = cutInput[cutInput.length - 1];

    // //print entire array
    // /* for (int index = 0; index < uniqueOutput.length; index++){
    // System.out.println(uniqueOutput[index]);
    // } */

    // System.out.println(Arrays.toString(uniqueOutput));
    // System.out.println("--------------------------");

    //close scanner
    //in.close();
//     }
// }