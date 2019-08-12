
/**
 * Name: AbdielNie
 * Date: 09/25/2017
 * Description: Using String to demonstrate objects
 */
public class TestingString
{
    public static void main (String [] args) {
        String a = new String("Hello");
        String b = new String("Hello");
        String c = "This is awesome!";
        
        //Concatenation
        /*
        String concatenate = a + b;
        System.out.println(concatenate);
        //*/
        
        //length() function
        
        System.out.println(a.length());
        System.out.println(c.length());
        //*/
        
        //charAt() function
        /*
        char aLetter = a.charAt(0);
        System.out.println(aLetter);
        System.out.println(a.charAt(4));
        System.out.println(c.charAt(3));
        //*/
        
        //substring() function
        /*
        System.out.println(a.substring(0,2));
        System.out.println(c.substring(3,7));
        
       
        //common error: store letter inside result?
        
        //a.charAt(3) = 'b';
        /*
        
        */
        
        
        //common error: comparison
        //System.out.println(3 == 3);
        //System.out.println(a == b);
    }
}
