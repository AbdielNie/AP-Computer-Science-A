
/**
 * name: AbdielNie
 * version: 1.0
 * make four fraction method in add, sub, mult, divid
 */
 public class Fraction
 {
    //Attribute
    private int num;  //numerator
    private int den;  //denominator
    
    //constractor
    public Fraction(int n, int d) // constructor that requires input
    {
        
        {
            num = n;
            den = d;
        }
            
    }

    private Fraction reduce(int n, int d)
    {
        int Num = d;
        d = d / Num; 
        n = n / Num; 
        return new Fraction(n,d);   
    }
    
    /*
     * addition method
     */
    public void add(Fraction b)
    {
        num = (this.num * b.den) + (b.num * this.den); 
        den = this.den * b.den;  
    }
    
    /*
     * substract method
     */
    public void subtract(Fraction b)
    {
        num = (this.num * b.den) - (b.num * this.den);
        den = this.den * b.den;
    }
    
    /*
     * multiply method
     */
    public void multiply(Fraction b)
    {
        num = this.num * b.num; 
        den = this.den * b.den;
    }
    /*
     * divide method
     */
    public void divide(Fraction b)
    {       
        num = this.num * b.den;
        den = this.den * b.num;
        
    }
    
    /*
     * multiplyFraction method
     */
    public void multiplyFraction(Fraction b)
    {
        num = this.num * b.num;
        den = this.den * b.den;
    }
    
    /*
     * toString method
     */
    public String toString()
    {
        return (num + "/" + den);
    }
    

 }