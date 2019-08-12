
/**
 * Write a description of class RecursiveDemo here.
 *
 * @author jimschenchen
 * @version 2017/10/24
 */
public class RecursiveDemo
{
    public static void recursiveCount(int n){
        //System.out.println(n);
        if(n >= 1){
            recursiveCount(n -1);
        }
        System.out.println(n);
    }
}
