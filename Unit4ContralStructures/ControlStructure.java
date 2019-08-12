
/**
 * Write a description of class ControlStructure here.
 *
 * @author jimschenchen
 * @version 2017/10/25
 */
public class ControlStructure
{
    public static void demoFor(){
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }
    
    public static void demoFor2(int num){
        for(int i = 0; i <= num; i ++){
            System.out.println(num);
        }
    }
    
    public static void demoWhile(int num){
        int i=1;
        while(i <= num){
            System.out.println(i);
            
            i++;
        }
        
    }
    
    public static void crash(){
        for(int i = 2; i > 1;){
            System.out.println(i);
        }
    }
    
    public static void demoWhile2(int num){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= num);
        
    }
    
    
    
}
