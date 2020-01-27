import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//        import and assign inputConsole of type Console
        Console inputConsole = System.console();

        ArrayList<String> alphabet = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," ")); // original alphabet
        System.out.println(alphabet); //display og alphabet for testing
        ArrayList<String> caesarAlphabet = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z")); // original alphabet waiting to be exchanged

        System.out.println("Tell me secret ;) "); // ask for secret from user
        String wholeSecret= inputConsole.readLine(); //get input
        wholeSecret = wholeSecret.toLowerCase(); //remember to toLowerCase the input

        System.out.println("What is your lucky cipher digit? "); //ask for cipher digit
        Integer cipherDigit= Integer.parseInt(inputConsole.readLine()); //get input and parse it immediately

        char[] splitSecret = wholeSecret.toCharArray(); //mainly for counting

        for(Integer counter = 0; counter<splitSecret.length; counter++){

        }
    }
}
