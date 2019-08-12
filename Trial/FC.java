
/**
 * Write a description of class FC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FC
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double f= 0, c = 0;
        int alt1 = 0;
        System.out.println("1. ℉ to ℃\n2. ℃ to ℉ ");
        alt1 = scan.nextInt();
        if(alt1 == 1){
            System.out.println("℉ to ℃");
            System.out.println("℃: ");
            c = scan.nextDouble();
            f = 320+1.8 * c;
            System.out.println("℉ : " + f);
        }else if(alt1 ==2){
            System.out.println("℃ to ℉");
            System.out.println("℉: ");
        f = scan.nextDouble();
        c = (f - 320) / 1.8;
        System.out.println("℃ : " + c);
        }else{
        }
            
        /*a.subString(b,b);
         * a.charAt(b);
         * 
         * 
         * 
         */
        
       
    }
}
