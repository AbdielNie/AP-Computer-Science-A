import java.util.Scanner;
/**
 * For Input study
 * @author AbdielNie
 * @version 1.0
 */
public class Input
{
    public static void main (String [] args)
    {
    /*
     *  Average of two number
     */
    double num1;
    double num2;
    double average;
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Please enter a number 1");
    num1 = in.nextDouble();
    
    System.out.println("Please enter a number 2");
    num2 = in.nextDouble();
    
    average = (num1 + num2) / 2;
    
    System.out.println("The average is " + average);
    
    }
}
