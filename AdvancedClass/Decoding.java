
/**
 * Write a description of class Decoding here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Decoding
{
    public static void main(String[] args){
        String code = "TWLSUENHODSA?OERIQR!!";
            
        for(int i = 0; i < 20; i++){
            
            String decode = "";
            /*
            for(int s = 0; s < code.length(); s ++){
                decode += (char)(code.charAt(s) - i);
            }
            System.out.println("i-" + i + ": " + decode);
            
            decode = "";
            for(int s = 0; s < code.length(); s ++){
                decode += (char)(code.charAt(s) + i);
            }
            System.out.println("i+" + i + ": " + decode);
            
            decode = "";
            for(int s = 0; s < code.length(); s ++){
                decode += (char)(code.charAt(s) + s);
            }
            System.out.println("s+" + i + ": " + decode);
            
            decode = "";
            for(int s = 0; s < code.length(); s ++){
                decode += (char)(code.charAt(s) - s);
            }
            System.out.println("s-" + i + ": " + decode);
            
            */
           
            decode = "";
            for(int s = 0; s < code.length(); s ++){
                decode += (char)(code.charAt(s) + s + i);
            }
            System.out.println("si+" + i + ": " + decode);
            
            decode = "";
            for(int s = 0; s < code.length(); s ++){
                decode += (char)(code.charAt(s) - s - i);
            }
            System.out.println("si-" + i + ": " + decode);
            
        }
        
        
    }
}
