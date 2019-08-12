import java.util.Random;
/**
 * Write a description of class RandomDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomDemo
{
   public static int returnRandomInt()
   {
       Random rngGod = new Random();
       int ret = rngGod.nextInt();
       return ret;
   }
   public static int returnRandomInt(int upperLimit)
   {
       Random rngGod = new Random();
       int ret = rngGod.nextInt(upperLimit);
       return ret;
   }
  
}
