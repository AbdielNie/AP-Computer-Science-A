
/**
 * Write a description of class zsdcfvb here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fibonacci
{
    private static int getFibo(int i) 
    {
        if (i == 1 || i == 2)
            return 1;
        else
            return getFibo(i - 1) + getFibo(i - 2);
    }

    public static void main(String[] args) 
    {
        System.out.println("斐波那契数列的前20项为：");
        for (int j = 1; j <= 20; j++) 
        {
            System.out.print(getFibo(j) + "\t");
            if (j % 5 == 0) 
                System.out.println();
        }
    }
}