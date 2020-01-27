import java.io.Console;

public class App {
    public static void main(String[] args) {
//        import and assign inputConsole of type Console
        Console inputConsole = System.console();

        System.out.println("Tell me secret ;) "); // ask for secret from user
        String wholeSecret= inputConsole.readLine(); //get input
        wholeSecret = wholeSecret.toLowerCase(); //remember to toLowerCase the input

        System.out.println("What is your lucky cipher digit? "); //ask for cipher digit
        Integer cipherDigit= Integer.parseInt(inputConsole.readLine()); //get input and parse it immediately
    }
}
