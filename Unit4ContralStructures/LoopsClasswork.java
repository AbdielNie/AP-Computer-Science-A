/**
 * Write a description of class LoopsClasswork here.
 *
 * @author jimschenchen
 * @version 2017/10/25
 */
import java.util.Scanner;
import java.util.Random;
public class LoopsClasswork
{
        public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);
            int pin = 12345;

            System.out.println("WELCOME TO THE BANK OF MITCHELL.");
            System.out.print("ENTER YOUR PIN: ");
            int entry = keyboard.nextInt();

            while ( entry != pin )
            {
                System.out.println("\nINCORRECT PIN. TRY AGAIN.");
                System.out.print("ENTER YOUR PIN: ");
                entry = keyboard.nextInt();
            }
            
            System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        }   
    
    
    public static void q2(){
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int guess = r.nextInt(100);
        int temp;
        do{
            System.out.println("PLEASE INPUT A NUMBER: ");
            temp = scan.nextInt();
        }while(temp != guess);
        System.out.println("good! The number is : " + guess);
    }
    
    public static String q3(String str, int num){
        String ret = "";
        for(int i = 0; i < num; i++){
            ret += str.substring(0, 3);
        }
        return ret;
    }
   
    public static String q4(int num){
        String ret = "";
        for(int i = 0; i < num; i ++){
            ret += "*";
        }
        return ret;
    }
    
    public static boolean q5(String str){
        boolean bool = false;
        for(int i = 0; i < str.length(); i++){
            for(int ii = 97; ii <= 122; ii++){
                if(str.charAt(i) == 120){
                    if(str.charAt(i +1) == 120){
                        bool = true;
                    }
                }
            }
        }
        return bool;  
    }

    public static String q6(String str){
        String ret = "";
        for(int i = 0; i < str.length(); i++){
            if(i % 4 == 0 || i % 4 == 1){
                ret += str.charAt(i);
            }    
        }
        return ret;
    }
    
    public static int q7(String str){
        int counter = 0;
        for(int i =0; i < str.length(); i++){
            if(str.charAt(i) == 'h' && str.charAt(i + 1) == 'i'){
                counter++;
            }
        }
        return counter;
    }
    
    public static boolean q8(String str){
        int numd = 0, numc = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g'){
                numd++;
            }
            if(str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't'){
                numc++;
            }
        }
        if(numc == numd){
            return true;
        }else{
            return false;  
        }
    }
    
    public static void q9(int num){
        String str ="";
        for(int i = 0; i < num; i++){
            for(int ii = 0; ii <= i; ii++){
                System.out.print("*");
            }
            System.out.println();
        }   
    }
    
    public static int q10(String str){
        int num = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) <= 57 && str.charAt(i) >= 48){
                num += str.charAt(i) - 48;
            }
        }
        return num;
    }
    
    public static String q11(String base, String remove){
        String ret = "";
        int config = 0;
        for(int i = 0; i < base.length(); i++){
            config = 0;
            for(int ii = 0; ii < remove.length(); ii++){
                if(base.charAt(i) == remove.charAt(ii)){
                    config = 1;
                }else{
                    
                }
            }    
            
            if(config == 1){
                
            }else{
                ret += base.charAt(i);
            }
            
        }
        
        return ret;
    }
    
    

    
}
