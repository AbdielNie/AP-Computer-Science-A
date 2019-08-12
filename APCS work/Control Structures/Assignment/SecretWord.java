import java.util.Random;
/**
 * name: Abdiel
 * date: 11/07/2017
 * description: SecretWord for Hangman
 */
public class SecretWord
{
    //attribute
    public String secretWord;
    public String displayWord;    
    //constructor
    public SecretWord()
    {      
        Random secretword= new Random();
        int chooseWord= secretword.nextInt(6); 
        displayWord = "";
        //To choose the word randomly
        switch(chooseWord)
        {
            case 1:
            secretWord = "Hello";
            break;
            case 2:
            secretWord = "World";
            break;
            case 3:
            secretWord = "Abdiel";
            break;
            case 4:
            secretWord = "is";
            break;
            case 5:
            secretWord = "handsome";
            break;
            case 6:
            secretWord = "cellphone";
        }
        //change the word to *
        int i;
        for(i = 0; i < secretWord.length(); i++)
        {
            displayWord += "*";
        }
    }
    //methods
    public boolean guessChar(char a)
    {
        //find the same letter
        boolean sameword = false;
        a = Character.toUpperCase(a);
        int i;
        for(i= 0; i < secretWord.length(); i ++)
        {
            if((int)secretWord.charAt(i) == (int)a)
            {
                displayWord = 
                displayWord.substring(0, i) + secretWord.charAt(i) +
                displayWord.substring(i + 1, displayWord.length());
                sameword = true;
            }else
            {

            }
        }
        return sameword;
    }

    public boolean completeGuess()
    {
        //compare two words,if return true,player win
        if(secretWord.equals(displayWord))
        {
            return true;
        }else{
            return false;
        }
    }

    public String getDisplay()
    {
        return displayWord;
    }

    public static boolean validGuess(String guess)
    {
        //check player input the letter 
        if(guess.length() == 1)
        {
            //if the word is from a->z or A->Z,it will return true
            if((guess.charAt(0) >= 65 && guess.charAt(0) <= 90) || (guess.charAt(0) >= 97 && guess.charAt(0) <= 122)){
                return true;
            }else
            {
                return false;
            }
        }else
        {
            return false;
        }
    }
}