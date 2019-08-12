import java.util.Random;
/**
 * Warmup
 * name: AbdielNie
 * description: Create a method that asks for three full names.Arrange
 * them in order and print them out.
 */
public class warmUp
{
    public static String orderTheName(String a, String b, String c)
    {
        if(a.compareTo(b) <= 0)
        {
            if (b.compareTo(c) <= 0 )
            {
                return a + " " + b + " " + c;
            }
            else if (c.compareTo(a) <= 0)
            {
                return c + " " + a + " " + b;
            }
            else
            {
                return a + " " + c + " " + b;
            }
        }
        else if (b.compareTo(c) >= 0)
        {
            return a + " " + c + " " + b; 
        }
        else 
        {
            return c +  " " + b + " " + a;
        }
        
    }
}