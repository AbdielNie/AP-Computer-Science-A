
/**
 * Name: TestingFraction
 * Author: JIM LI
 * Date: 2017/10/09
 * Description: The testing for Fraction Class
 */
public class TestingFraction
{
    public static void main(String[] args){
        /*
        Fraction a = new Fraction(3,2);
        Fraction b = new Fraction(1,2);
        System.out.println(a + "&&" + b);
        a.add(b);
        System.out.println(a + "&&" + b);
        a.subtract(b);
        System.out.println(a + "&&" + b);
        b = Fraction.multiplyFractions(a,b);
        System.out.println(b);
        */
        
                     
              Fraction a = new Fraction(3,2);
              Fraction b = new Fraction(4,5);
              Fraction c = new Fraction(1,2);
              Fraction d = new Fraction(3,2);
             
              /*
              * add method
              */
              a.add(a); // a becomes 6/2
              System.out.println("Fraction a is now: " + a);
             
              /*
              * subtract method
              */
              a.subtract(d);// a becomes 3/2
              System.out.println("Fraction a is now: " + a);
             
              /*
              * multiply method
              */
              a.multiply(b); //a becomes 12/10
              System.out.println("Fraction a is now: " + a);
             
              /*
              * divide method
              */
              a.divide(c); //a becomes 24/10
              System.out.println("Fraction a is now: " + a);
             
              /*
              * multiplyFractions method
              */
              a = Fraction.multiplyFractions(c,d); //a becomes 3/4
              System.out.println("Fraction a is now: " + a);

    }
}
