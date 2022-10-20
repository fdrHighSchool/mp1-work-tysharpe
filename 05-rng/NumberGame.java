
/**
 * Write a description of class numgame here.
 *
 * @author (Tyler Sharpe)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class NumberGame
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r =new Random();
        
        int mysteryNumber = 5; // place-holder for now
        int mysteryNumber = Random.nextInt(109) + 1;
        System.out.print("what mode do you want?\nEasy\nMedium\nHard");
        String mode= s.nextLine();
        System.out.print(mode);
        
        if(mode.equals("Easy")) {
            System.out.print("easy mode!");
            Maximum=10;
        }
        else if(mode.equals("Medium")) {
            System.out.print("medium mode!");
        }
        else{
            System.out.print("hard mode!");
        }

        
        
        System.out.println(mysteryNumber);
        
        System.out.print("Enter your guess: ");
        int playerGuess = s.nextInt(); 
        
        // if the player guessed incorrectly
        if(playerGuess != mysteryNumber) {
            // if the player guessed too low
            if(playerGuess < mysteryNumber) {
                System.out.println("You were off by " + (mysteryNumber - playerGuess));
            } // end inner if statement
            // if the player didn't guess too low (meaning, incorrect and too high!)
            else {
                System.out.println("You were off by " + (playerGuess - mysteryNumber));
            } // end inner else statement
        } // end outer if statement
        // if the player didn't guess incorrectly (meaning, correct guess)
        else {
            System.out.println("Correct!!!");
        } // end outer else statement
    } // end main method
} // end class