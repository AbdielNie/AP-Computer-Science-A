
/**
 * Write a description of class TestMethod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestMethod
{
    public static void main(String[] args){
        method1();
    }
    
    public static void method1 (){
        System.out.println("hello!");
        int a = 6;
        method2();
    }
    
    public static void method2 (){
        System.out.println("bye!");
        method3 ();
        method3 ();
    }
    
    public static void method3 (){
        System.out.println("bangbang!");
    }
    
    
    
    
    
    
}