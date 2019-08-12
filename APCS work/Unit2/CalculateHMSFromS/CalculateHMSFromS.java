import java.util.Scanner;
/**
 *
 */
public class CalculateHMSFromS
{
    public static void main (String [] args)
    {
       /*
        * input:int seconds
        * output: int hours,minutes,seconds
        */
        int hours;
        int minutes;
        double seconds;
        
        // get seconds
        Scanner second = new Scanner (System.in);
        seconds = second.nextDouble();
        
        //get minutes
        minutes = (int) seconds / 60;
        minutes = minutes % 60;
        
        //get hours
        hours = (int) seconds / 3600;
        
        
        //calculate seconds
        seconds = seconds % 60;
        
        //output
        System.out.println ("Time is " + hours+ "hours" + minutes + "minutes" + seconds + "Seconds");
       
    }
}
