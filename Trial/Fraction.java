
/**
 * Name: Fraction
 * Author: JIM LI
 * Date: 2017/10/09
 * Desciption: A class for fraction to allow fration to use in program which could create a fraction and apply different operation method.
 */
public class Fraction
{
    //ATTRIBUTES
    private int numerator;
    private int denominator;
    
    //CONSTRUCTOR
    public Fraction(){
        numerator = 0;
        denominator = 1;
    }
    //the default fratcion will be 0;
    
    public Fraction(int newNumerator, int newDenominator){
        numerator = newNumerator;
        denominator = newDenominator;
    }

    //METHODS
    /**
     * NAME: add
     * DESCRIPTION: add the newFraction to this fraction
     */
    public void add(Fraction newFraction){
        numerator = numerator * newFraction.denominator + denominator * newFraction.numerator;
        denominator = denominator * newFraction.denominator;
    }   //addition method
    /**
     * NAME: subtract
     * DESCRIPTION: subtract the newFraction from this fraction
     */
    public void subtract(Fraction newFraction){
        numerator = numerator * newFraction.denominator - newFraction.numerator * denominator;
        denominator = denominator * newFraction.denominator;
    }   //subtraction method
    /**
     * NAME: multiply
     * DESCRIPTION: multiply the newFraction to this fraction
     */
    public void multiply(Fraction newFraction){
        numerator = numerator * newFraction.numerator;
        denominator = denominator * newFraction.denominator;
    }   //multiplicity method
    /**
     * NAME: divide
     * DESCRIPTION: divide the newFraction by this fraction
     */
    public void divide(Fraction newFraction){
        numerator = numerator * newFraction.denominator;
        denominator = denominator * newFraction.numerator;
    }   //division method
    /**
     * NAME: multiplyFractions
     * DESCRIPTION: mutiply two fraction return their product
     */
    public static Fraction multiplyFractions(Fraction F1, Fraction F2){
        Fraction temp;
        temp = new Fraction(F1.numerator * F2.numerator, F1.denominator * F2.denominator);
        return temp;
    }   //multiplyTwoFration method
    
    public String toString(){
        String temp = simplify().numerator + "/" + simplify().denominator;
        return temp;
    }   //output fraction
    /**
     * NAME: simplify
     * DESCRIPTION: simplify our fraction
     */
    public Fraction simplify(){
        int d = denominator;
        int n = numerator;
        for(int i = 100; i > 0; i --){
            if(d % i ==0 && n % i ==0){
                d = d / i;
                n = n / i;
            }else{
            }
        }
        Fraction ff = new Fraction(n , d);
        return ff;
    }
    
    
}
