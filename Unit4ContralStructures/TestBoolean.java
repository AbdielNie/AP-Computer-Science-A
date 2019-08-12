
/**
 * Write a description of class TestBoolean here.
 *
 * @author JimLi
 * @version 2017/10/17
 */
public class TestBoolean
{
    public static void testBoolean2(){
        boolean fStatement = 5 < 3;
        boolean tStatement = ((int)5.6 == 5);
        
        System.out.println(fStatement);
        System.out.println(tStatement); 
    }
    
    public static void graterThanFive(int num){
        if (num > 5) {
            System.out.println(num + "is greater than five");
        }  
    }
    
    public static String determineYouth(int age){
        if(age <= 18){
           return "U R Young";
        }else{
            return "U R Old";
        }
    }
    
    public static char determineGrade(int mark){
        if (mark >= 86){
            return 'A';
        }else if (mark >= 73){
            return 'B';
        }else if (mark >= 67){
            return 'C';
        }else if (mark >= 58){
            return 'D';
        }else if (mark >= 50){
            return 'E';
        }else{
            return 'F';
        }
    }
    
    
    
    
}
