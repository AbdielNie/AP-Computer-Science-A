
/**
 * Abstract class Shape - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Shape
{
    private int sides;
    private String name;
    
    public Shape(String name, int sides){
        this.sides = sides;
        this.name = name;
    }
    
    public int getSides(){
        return sides;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
}

