
/**
 * name: AbdielNie
 * date: 10/11/2017
 * version: 1.0
 * description: test fraction class
 */
public class testFraction
{
    public static void main (String [] args) 
    {
        Fraction a = new Fraction(2,1);

        Fraction b = new Fraction(2,1);
        
        /*
         * test addtion method
         */
        b.add(a); //get 4/1
        System.out.println("Fraction a is now: " + b);

        /*

         * test subtract method

         */

        b.subtract(a); 

        System.out.println("Fraction a is now: " + b);//result is 2/1

        /*
         * test multiply method
         */
        b.multiply(b); 
        System.out.println("Fraction a is now: " + b);//result is 4/1

        /*

         *test divide method

         */

        b.divide(a); 

        System.out.println("Fraction a is now: " + b);//result is 4/2
        /*

         * test multiplyFractions method

         */
        
        b.multiplyFraction(a); 

        System.out.println("Fraction a is now: " + b); //result is 8/2 

    
         
    }
}
