import java.util.Scanner;
import java.util.Arrays;

public class DistinctValues{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int userInput[] = new int[10];
            
    // (DO NOT FORGET TO REMOVE) Reassign array for testing
        userInput = new int[]{4, 3, 22, 6, 4, 3,7,-1,0,-1};
        System.out.println(Arrays.toString(userInput));
        System.out.println("--------------------------");

    //Check and stop at -1
    int cutInput[] = new int[10];

    for (int index = 0; index < userInput.length; index++){ 
        if (userInput[index] == -1) {
            break; //stops at -1
        }
        cutInput[index] = userInput[index];
    } 
    // TEST CUTARRAY
    System.out.println(Arrays.toString(cutInput));
    System.out.println("--------------------------");

    // Sort array
    Arrays.sort(cutInput);
    // TEST cutArray
    System.out.println(Arrays.toString(cutInput));
    System.out.println("--------------------------");

    // Remove duplicates
        int[] uniqueOutput = new int[cutInput.length];
        int j = 0;

        for (int i = 0; i < cutInput.length - 1; i++) {
            if (cutInput[i] != cutInput[i + 1]) {
                uniqueOutput[j++] = cutInput[i];
            }
        }
         // Add the last array element
         uniqueOutput[j++] = cutInput[cutInput.length - 1];

    //print entire array
    /* for (int index = 0; index < uniqueOutput.length; index++){
    System.out.println(uniqueOutput[index]);
    } */
    System.out.println(Arrays.toString(uniqueOutput));
    System.out.println("--------------------------");

    //close scanner
    in.close();
    }
}