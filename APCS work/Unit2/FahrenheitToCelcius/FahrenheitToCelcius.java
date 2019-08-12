import java.util.Scanner;
/**
 * Name: AbdielNie
 * version: 1.0
 * desription: the program of conversion fahrenheit to celcius
 */
public class FahrenheitToCelcius
{
   public static void main (String [] args)
   {
    Double f;
    Double c;
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Please Enter a degree in fahrenheit");
     
    f= in.nextDouble();
    
    c = (f - 32)/1.8;
    
    System.out.println("The Celcius degree is" + c);
    }
}
