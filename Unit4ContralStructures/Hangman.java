
/**
 * Write a description of class Hangman here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner; //For getting input

 

 

public class Hangman

{

   public static void main (String [] args) {

      

       /*

         * Setting up the game

         */

       int guessNum = 6;

       Scanner in = new Scanner(System.in);

       SecretWord secret = new SecretWord();

       String guess = "";

      

       System.out.println("Hello, welcome to Hangman.");

      

       /*

         * The game

         */

       while (guessNum > 0 && !secret.completeGuess()) {

           /*

             * Display and Input

             */

           System.out.println("Your word is :" + secret.getDisplay());         //display the characters

           System.out.println("You have " + guessNum + " guess(es) left.");   //display the number of guesses left

           System.out.print("Please guess a letter: ");                       //prompts user to guess

           guess = in.nextLine();                                             //gets input from user

          

           /*

             * Guess Checking

             */

           if (SecretWord.validGuess(guess)) {

               if (!secret.guessChar(guess.charAt(0))) {

                   System.out.println("Incorrect!");

                   guessNum--;

               } else {

                   System.out.println("Correct!");

               }

           } else {

               System.out.println("Invalid Guess");

           }
           //secret.test();
       }

      

       /*

         * End Game

         */

       if (guessNum > 0) {                                                     //if there are guesses left at the end of the game

           System.out.println("You win!");                                     //they win

       } else {                                                               //if there are no more guesses

           System.out.println("You lose!");                                   //they lose

       }

   }

}