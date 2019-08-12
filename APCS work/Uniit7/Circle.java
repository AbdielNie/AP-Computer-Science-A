
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    private double radius;
    private final static double PI = 3.1415926;
    //@override
    public Circle (String name, double radius)
    {
        super(name, 1);
        this.radius = radius;
    }
    public double getPerimeter()
    {
        return radius * 2 * PI;
    }
    public double getArea()
    {
        return radius*radius*PI;
    }
    
    /*
    
    private int radius;
    public Circle(int rad)
    {
        radius = rad;
    }
    public int getRadius()
    {
        return radius;
    }
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    public void getDiametre(int diametre)
    {
        diametre= 2 * radius;
    }
    */
}
