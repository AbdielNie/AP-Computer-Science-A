
/**
 * Write a description of class RecursiveDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecursiveDemo
{
    public static void recursiveCount(int n)
    {
        //System.out.println(n);
        if (n >= 1)
        {
            recursiveCount(n-1);
        }
        System.out.println(n);
    }
}
