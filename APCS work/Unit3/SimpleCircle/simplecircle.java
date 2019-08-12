
/**
 * name:AbdielNie
 * date:09/27/2017
 * description: A simple circle 
 */
public class simplecircle
{
    //Attribute
    private double radius;
    private double perimeter;
    private double area;
    private final double PI = 3.14;
    //constructors
    public simplecircle()
    {
        radius = 1.0;
        perimeter = 1.0;
        area = 1.0;
    }
    public simplecircle (double r)
    {
        radius = r;
        perimeter = PI * r * 2;
        area = PI * r * r;
        
    }
    
    //method
    
    public double getradius()
    {
        return radius;
    }
    public double getarea()
    {
        return area;
    }
    public double getperimeter()
    {
        return perimeter;
    }
    public void setradius(double r)
    {
       radius = r;
       perimeter = PI * r * 2;
       area = PI * r * r; 
    }
}
