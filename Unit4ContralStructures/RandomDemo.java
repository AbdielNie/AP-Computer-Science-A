
/**
 * Write a description of class RandomDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class RandomDemo
{
    public static char returnRandomChar(){
        Random r = new Random();
        return (char)(r.nextInt(26) + 96);
    }
}
