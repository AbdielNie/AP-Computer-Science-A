
/**
 * Write a description of class ADD here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ADD
{
    public static int add(String str){
        int temp = 0;
        for(int i = 0; i < str.length(); i++){
            temp += ((int)str.charAt(i) - 64);
            
            
        }
        
        return temp;
        
        
        
        
        
        
    }
}
