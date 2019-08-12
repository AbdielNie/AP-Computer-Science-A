import java.util.Scanner;
/**
 * Name: AbdielNie
 * decription: Write a program that plays an incredibly stupid
 * number-guessing game. The user will get one try to guess the 
 * secret number. Tell them if they got it right or wrong, and
 * if they got it wrong, display what the secret number was.
 * You must store the secret number in a variable, and use that 
 * variable throughout. The secret number itself must not 
 * appear in the program at all, except in the one line
 * where you store it into a variable.
 * b) Modify your number-guessing game to actually 
 * pick a random number from 1 to 10 and have the user try 
 * to guess that. Tell them if they get it right or wrong, 
 * and if they get it wrong, show them what the random number was.
 * They will still only get one try.
 * c) Modify the game so that they can guess until they get it right. 
 * That means it will keep looping as long as the guess is different
 * from the secret number. 
 * Use a while loop.
 */
public class Loop_Question1
{
    public static void question1(int num)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOUR PIN: ");
        int i = keyboard.nextInt();
        while (i != num)
        {
            System.out.println("Your PIN was wrong");
            System.out.print("ENTER YOUR PIN: ");
            i = keyboard.nextInt();
        }
        System.out.println("Your PIN is correct!");
    }
}
