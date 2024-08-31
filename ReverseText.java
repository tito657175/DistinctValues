import java.util.*;

public class ReverseText {
    // DO NOT MODIFY main!
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      System.out.println("\nEnter a sentence you want to reverse");
      String s = scnr.nextLine();

      //Returns reversedText method and prints
      System.out.print(reverseText(s) + "\n");
   }

// Reverse Method
public static String reverseText(String s) { //Accepts input variables
   String[] words = s.split(" ");  // Splits string into Array and adds spaces
   StringBuilder reversedSentence = new StringBuilder();

   for (String word : words) { //Cool short hand format, alternate to for (int i = 0; i < words.length; i++)
       StringBuilder reversedWord = new StringBuilder(word);
       reversedWord.reverse();  // Reverse the individual word
       reversedSentence.append(reversedWord.toString()).append(" "); // Add the reversed word to the sentence
   }
   return reversedSentence.toString().trim();  // Convert back to string and trim space at the end
}
}


