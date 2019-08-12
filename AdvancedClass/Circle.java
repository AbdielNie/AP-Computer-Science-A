
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape{
    private double radius;
    private final static double PI = 3.14159;

    
    public Circle(String name, double radius){
        super(name, 0);
        this.radius = radius;
    }
    
    @Override
    public double getPerimeter(){
        return 2 * radius * PI;
    }
    @Override
    public double getArea(){
        return radius * radius * PI;
    }
    
    //method
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;   
    }
    public double getDiameter(){
        return this.radius * 2;
    }
}
