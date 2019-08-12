
/**
 * Write a description of class challengeQ here.
 *
 * @author jimschenchen
 * @version 2017/10/26
 */
public class challengeQ
{
    public static void printAZ(){
        for(int i = 0; i < 26; i++){
            System.out.print((char)(97 + i));
        }
    }
    
    public static void printAZ2(int a){
        for(int i = 0; i < a; i ++){
            System.out.print((char)(97 + i));
        }
    }
    
    public static void printAZ3(){
        for(int i = 0; i < 26; i++){
            for(int ii = 0; ii < i + 1; ii++){
                System.out.print((char)(97 + ii));
            }
            System.out.print("\n");
        }
    }
    
    public static void pirntAZ4(){
        for(int i = 0; i < 26; i ++){
            for(int ii = 25; ii >=0; ii--){
                if(ii <= i){
                    System.out.print((char)(97 + ii));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    
    public static void sao(){
        for(int i =0; i < 128; i ++){
            for(int ii = 0; ii < 128; ii++){
                System.out.print((char)(i) + " ");
            }            
            System.out.println("\n");
        }
    }

    public static void number(){
        for (int i = 57; i >= 48; i--)
        {
                System.out.println((char)i);
        }
    }





















}





