import java.util.*;
public class ReverseText {
    
    // DO NOT MODIFY main!
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String s = scnr.nextLine();
      System.out.print(reverseText(s) + "\n");
   }

// String Reverse Method
public static String reverseText(String s) { //Accepts input variable s
   String[] words = s.split(" ");  // splits string into Array and adds spaces
   StringBuilder reversedSentence = new StringBuilder();

   /* for (String word : words) { //Cool short hand format, alternate to (string word;)
       StringBuilder reversedWord = new StringBuilder(word);
       reversedWord.reverse();  // Reverse the individual word
       reversedSentence.append(reversedWord.toString()).append(" "); // Add the reversed word to the sentence
   } */

   for (int i = 0; i < words.length; i++) {
      StringBuilder reversedWord = new StringBuilder(words[i]);
      reversedWord.reverse();  // Reverse the individual word
      reversedSentence.append(reversedWord.toString());


   return reversedSentence.toString().trim();  // Convert to string and trim any extra space at the end
}
}

