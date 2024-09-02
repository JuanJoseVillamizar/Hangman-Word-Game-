import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     try (Scanner scanner = new Scanner(System.in)){
        int maxAttempts = 10;
        int attemptsMade = 0;
        boolean isGuessed = false;
        String secretWord = "inteligencia";
        char [] currentGuess= new char[secretWord.length()]; 
        System.out.println("Welcome to hangman");
        for (int i = 0; i < currentGuess.length; i++) {
            currentGuess[i]= '_';
        }
        while(!isGuessed && attemptsMade < maxAttempts){
            System.out.println("Word to guess: " + String.valueOf(currentGuess) + " (" + secretWord.length() + " letters)");
            char userletter = Character.toLowerCase(scanner.next().charAt(0));
            boolean isLetterGuess = false;
            for (int i = 0; i < secretWord.length(); i++) {
                if(userletter == secretWord.charAt(i)){
                    currentGuess[i] = userletter;
                    isLetterGuess= true;
                }
              
            }
            if(!isLetterGuess){
                attemptsMade++;
                System.out.println("Incorrect!, you have " + (maxAttempts - attemptsMade) + " attempts left") ;
            }
            if (String.valueOf(currentGuess).equals(secretWord)) {
                isGuessed= true;
                System.out.println("Congratultions! you guessed the secret word: " + secretWord);
            }
           
        }
        if(!isGuessed){
            System.out.println("GAME OVER you're lost");
        }
     } catch (Exception e) {
        System.err.println(e);
     }
    }
}
