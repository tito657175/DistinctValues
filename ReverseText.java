import java.util.*;
public class ReverseText {
    
    // DO NOT MODIFY main!
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String s = scnr.nextLine();
      System.out.print(reverseText(s) + "\n");
   }

// String Reverse Method
public static String reverseText(String s) {
   String[] words = s.split(" ");  // slits string into words with space
   StringBuilder reversedSentence = new StringBuilder();

   for (String word : words) {
       StringBuilder reversedWord = new StringBuilder(word);
       reversedWord.reverse();  // Reverse the individual word
       reversedSentence.append(reversedWord.toString()).append(" "); // Add the reversed word to the sentence
   }

   return reversedSentence.toString().trim();  // Convert to string and trim any extra space at the end
}
}

