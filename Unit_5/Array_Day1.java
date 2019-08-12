
/**
 * Write a description of class Array_Day1 here.
 *
 * @author jimschenchen
 * @version 2017/11/13
 */
import java.util.Random;
public class Array_Day1
{
    public static int q1(int [] a){
        return a[0] + a[a.length - 1];
    }
    
    public static String q2(String [] str){
        String ret = "";
        for(int i = 0; i < str.length; i++){
            ret += str[i];
        }
        return ret;
    }
    
    public static char[] q3(String str){
        char[] c = new char[4];
        for(int i = 0; i < str.length(); i ++){
            c[i] = str.charAt(i);
        }
        return c;
    }
    
    public static String q4(){
        Random ran = new Random();
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return weeks[ran.nextInt(6)];
    }
    
    public static String q5(){
        Random ran = new Random();
        String[] suit = {"Spades", "Diamonds", "Club", "Heart"};
        String[] letter = {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "Small Joker", "Jim Joker"};
        int ranL = ran.nextInt(14);
        if(ranL < 13){
            return letter[ranL] + " of " + suit[ran.nextInt(3)];
        }else{
            return letter[ranL];
        }
    }
    
    
}
