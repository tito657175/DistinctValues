import java.util.Scanner;
import java.util.Arrays;

public class DistinctValues{
    public static void main(String[] args){
        System.out.print("Enter the first integer: \n");
        Scanner scnr = new Scanner(System.in);
        int firstInput = scnr.nextInt(); //store first unchecked input

        //Declare empty array and make 10 index long
        int userInputArray[] = new int[10];
    
        //Special condition for first int
        if (firstInput == -1){
            System.out.print("You have quit the program before any integers have been stored. \nInteresting Choice.\n");
            System.out.println(Arrays.toString(userInputArray));
        } else {
            userInputArray[0] += firstInput;
            System.out.println(Arrays.toString(userInputArray));
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
    }
}