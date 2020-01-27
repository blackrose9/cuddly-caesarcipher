import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
//        import and assign inputConsole of type Console
        Console inputConsole = System.console();

        ArrayList<String> alphabet = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," ")); // original alphabet
//        System.out.println(alphabet); //display og alphabet for testing
        ArrayList<String> caesarAlphabet = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z")); // original alphabet waiting to be exchanged

        ArrayList<String> cipherSecret = new ArrayList<String>();//declare array to hold final ciphered secret

        System.out.println("Tell me secret ;) "); // ask for secret from user
        String wholeSecret= inputConsole.readLine(); //get input
        wholeSecret = wholeSecret.toLowerCase(); //remember to toLowerCase the input

        System.out.println("What is your lucky cipher digit? "); //ask for cipher digit
        Integer cipherDigit= Integer.parseInt(inputConsole.readLine()); //get input and parse it immediately

        Collections.rotate(caesarAlphabet, cipherDigit); // rotates the alphabet by a particular distance
        System.out.println(caesarAlphabet); //display ciphered alphabet for testing
        caesarAlphabet.add(" "); //add space to end on the array to match space in ogAlphabet array. so you don't get errors processing strings

//        split whole secret into an array of separate characters
        char[] splitSecret = wholeSecret.toCharArray(); //mainly for counting

//        loop through secret
        for(Integer counter = 0; counter<splitSecret.length; counter++){

            String letterInQuestion = String.valueOf(splitSecret[counter]);// convert character to string so it can be compared to string alphabet

            Integer indexOfLetterInAlphabet = alphabet.indexOf(letterInQuestion); //get the index of said letter in the alphabet
            Integer indexOfLetterInCaesarAlphabet = caesarAlphabet.indexOf(letterInQuestion); //get the index of said letter in the caesarAlphabet

            String cipherLetter = caesarAlphabet.get(indexOfLetterInAlphabet); // get letter at index of indexOfLetterInAlphabet but in the CaesarAlphabet
            cipherSecret.add(cipherLetter);
        }
        String finalSecret = String.valueOf(cipherSecret);
        System.out.println(finalSecret);
    }
}
