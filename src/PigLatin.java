/**
 * Created by ExposedGun on 02/12/2015.
 */
import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {                            // The main method. This is where shit goes down.
        StringBuilder sb = new StringBuilder();                         // This initialises a StringBuilder, so we can keep appending stuff to it, to build our output.

        Scanner input = new Scanner(System.in);                         // Initialise a scanner to get user input.

        System.out.println("Enter a sentence to translate:");           // Prompt the user to enter a sentence.

        String sentenceToTranslate = input.nextLine();                  // Scanner gets the user's input and stores it in a string.

        sentenceToTranslate.replaceAll("[^\\p{Alnum}]+", "");           // This removes every non-alpha-numeric character.

        String[] wordsArray = sentenceToTranslate.split("\\s+");        // This splits it up at every space, storing what's in between as seperate values in the array 'wordsArray.'


        for (int i = 0; i < wordsArray.length; i++){
            if (i == wordsArray.length - 1){
                sb.append(translateWord(wordsArray[i]) + ".");          // Once we reach the last word in our sentence, put a fullstop at the end, rather than a space.
                break;                                                  // Then quit the loop.
            }

            sb.append(translateWord(wordsArray[i]) + " ");              // Run each item in the array (each word) through the function 'translateWord' and append the result to our StringBuilder sb, putting a space at the end of every word.

        }

        System.out.println(fixCase(sb.toString()));                     // Now we have sb, which contains our whole sentence, we want to fix the case. Run the result through the fixCase function.

        input.close();                                                  // Get rid of those annoying errors.

    }

    static String translateWord(String wordToTranslate) {               // Static method which takes a string parameter (namely the word we want to translate to Pig Latin.)
        String[] lettersArray;                                          // Make an array to contain all the letters in the word.
        lettersArray = new String[wordToTranslate.length()];            // Make the array the length of the word.

        for (int i = 0; i < wordToTranslate.length(); i++) {
            lettersArray[i] = wordToTranslate.substring(i, i + 1);      // Assign each letter in the word to it's own cell in the array.
        }

        String firstLetter = lettersArray[0];                           // Assign the first letter of the word to its own variable, because the next loop gets rid of it and we want to keep it.

        for (int i = 0; i < lettersArray.length - 1; i++) {
            lettersArray[i] = lettersArray[i + 1];                      // Swap each letter in the word to the letter after it.
        }

        lettersArray[lettersArray.length - 1] = firstLetter;            // Swap the last letter of this new, mangled word for the first letter of the original, that we kept earlier.

        StringBuilder sb = new StringBuilder();                         // Make a new StringBuilder to start appending all the letters to a single word.

        for (int i = 0; i < lettersArray.length; i++) {
            sb.append(lettersArray[i]);                                 // Append every item in the array (every letter) to one StringBuilder, so we have a word.
        }

        return sb+"ay";                                                 // Return this word, and append 'ay' to it, because that's what Pig Latin is.
    }

    static String fixCase(String inputVal) {                            // Static method which takes a string parameter (namely the sentence that we want to fix the case of.)

        if (inputVal.length() == 0){
            return "";                                                  // If the string is empty, don't touch it, and return an empty string.
        }

        if (inputVal.length() == 1){
            return inputVal.toUpperCase();                              // If it's only got one character, make the whole thing uppercase, and return that.
        }

        return inputVal.substring(0, 1).toUpperCase() + inputVal.substring(1).toLowerCase(); // If it's longer than one character, make the first character uppercase, and the rest lowercase.
    }
}