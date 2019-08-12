
/**
 * Write a description of class SecretWord here.
 *
 * @author jimschenchen
 * @version 2017/10/30
 * @description It is the class for Hnagman to do with the word things.
 */
import java.util.Random;
public class SecretWord
{
    //ATTRIBUTE
    
    private String secretWord;
    private String displayWord;
    
    
    //CONSTRUCTOR
    public SecretWord(){
       Random ran = new Random();
       int ranIndex = ran.nextInt(5); 
       displayWord = "";
       //to avoid the displayWord become null---;
       switch(ranIndex){
           case 1:
                secretWord = "ABDIEL";
                break;
           case 2:
                secretWord = "CLAUSTROPHOBIA";
                break;
           case 3:
                secretWord = "GREENHATMAN";
                break;
           case 4:
                secretWord = "RECURSION";
                break;
           case 5:
                secretWord = "HEAVEN";
                break;
           default:
                secretWord = "";
                break;  
       }
       //Random choosing a word and casting to secretWord
       
       for(int i = 0; i < secretWord.length(); i++){
           displayWord += "-";
       }
       //Fillin the dispalyWord with "-" in the same numbers of the length of secretWord
       
    }
    
    
    //METHODS
    public boolean guessChar(char a){
        boolean bool = false;
        a = Character.toUpperCase(a);
        for(int i= 0; i < secretWord.length(); i ++){
            if((int)secretWord.charAt(i) == (int)a){
                displayWord = displayWord.substring(0, i) + secretWord.charAt(i) + displayWord.substring(i + 1, displayWord.length());
                bool = true;
                //test();
                //find the the same letter in the secretWord. If there is, return true and repalce all the letters which are same.
            }else{
                //if not same, skip.
            }
        }
        return bool;
        //return turn if there is any same letter.
    }
    //To find and replace the same letters as secrectWord in the displayWord
    
    public boolean completeGuess(){
        if(secretWord.equals(displayWord)){
            return true;
        }else{
            return false;
        }
    }
    //detedcting the two letters whether are pair. If it is, return true and player win the game
    
    public String getDisplay(){
        return displayWord;
    }
    //return the displayWord
    
    public static boolean validGuess(String guess){
        if(guess.length() == 1){
            if((guess.charAt(0) >= 65 && guess.charAt(0) <= 90) || (guess.charAt(0) >= 97 && guess.charAt(0) <= 122)){
                return true;
                //return true if the letter is from a to z or A to Z
            }else{
                return false;
                // if is not part of the alphabet, return false
            }
        }else{
            return false;
            //return false if the String is longer than one letter.
        }
    }
    // to check whether the letter is valid
    
    public void test(){
        System.out.println(displayWord);
    }
    //only for test
}