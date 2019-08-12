
/**
 * name: AbdielNie
 * figure out x and y
 */
public class Try
{
   public static void main (String [] args)
   {
     int x;
     int y;
     x = 2;
     y = x++;
     x = (int)(Math.pow (y , x + 1));
     y += -2;
     System.out.println(Math.max(x,y));
    }
}
