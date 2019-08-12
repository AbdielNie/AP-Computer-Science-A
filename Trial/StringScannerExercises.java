
/**
 * Write a description of class StringScannerExercises here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StringScannerExercises
{
    public static void main(String[] args){
    }
    public static void q1(){
        String a = "Jima", b = "Cloudy";
        a = a.substring(a.length() / 2 - 1, a.length() / 2 + 1);
        b = b.substring(a.length() / 2 - 1, a.length() / 2 + 1);      
        System.out.println(a + "\n" + b );
    }
    public static void q2(){
        String a = "chocolate";
        String b = "chocolate";
        a = a.substring(0, 1) + a.substring(a.length()-1, a.length());
        b = b.substring(0, 2) + b.substring(b.length()-2, b.length());
        System.out.println(a + "\n" + b );
    }
    public static void q3(){
        String a = "jim", b = "yeah", c = "", d ="";
        c = a + b + a + b;
        d = a.concat(b);
        d= d.concat(d);
        System.out.println(c + "\n" + d);
    }
    public static void q4(){
        String a = "jimschenchen";
        String b = "";
        for(int i = 0; i < a.length(); i ++){
            b = b + a.charAt(a.length() - i - 1);
        }
        System.out.println(b);
    }
    public static void q5(){
        String a = "i";
        String b = "Yeah";
        String c = "";
        c = "<" + a + ">" + b + "</" + a + ">";
        System.out.println(c);
    }
}