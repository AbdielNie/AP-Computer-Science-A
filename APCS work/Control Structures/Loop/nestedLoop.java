
/**
 * Using a loop,print out 0-9
 * 0
 * 01
 * 012
 * 0123
 * 01234
 */
public class nestedLoop
{
    public static void challenge()
    {
    char i;
    int num;
    for (num = 0; num <= 9; num++)
        {            
            for (i = 48; i <= (48 + num); i++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }

    }    
}
