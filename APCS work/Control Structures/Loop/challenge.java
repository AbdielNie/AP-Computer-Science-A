
/**
 *challengeQ
 */
public class challenge
{
    public static void printAZ()//use loop to print a string
    {
        char i;
        for (i = 97; i <= 122; i++)
        {
            System.out.print(i);
        }
    }    

    public static void printAZ2(int num)// use loop tp print a string
    {
        char i;
        for (i = 97; i <= (96 + num); i++ )
        {
            System.out.print(i);
        }
    }

    public static void printAZ3()
    {
        //a
        //ab
        //abc
        //abcd
        
        // Line 1 --> 1 character
        // Line 2 --> 2 character
        char i;
        int num;
        for (num = 0; num <= 26; num++)
        {
            for (i = 97; i < (96 + num); i++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
        
        
        

    }
}