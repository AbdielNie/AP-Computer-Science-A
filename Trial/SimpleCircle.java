
/**
 * Write a description of class SimpleCircle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleCircle
{
    //Attribute
    private double radius;
    private double perimeter;
    private double area;
    
    //constructive
    public SimpleCircle(){
        radius = 0.0;
        perimeter = 0.0;
        area = 0.0;
    }
    public SimpleCircle(double r){
        radius = r;
        perimeter = Math.PI * 2 * r;
        area = Math.PI * r * r;
    }
    
    //method
    public double getRadius(){
        return radius;
    }
    public double getPerimeter(){
        return perimeter;
    }
    public double getArea(){
        return area;
    }
    
    public void setRadius(double r){
        radius = r;
        perimeter = Math.PI * 2 * r;
        area = Math.PI * r * r; 
    }
    
}
