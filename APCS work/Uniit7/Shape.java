
/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Shape
{
    private int sides;
    private String name;
    
    public Shape(String name, int sides)
    {
        sides = sides;
        this.name = name;
    }
    
    public int getSides()
    {
        return this.sides;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    
        
    
}