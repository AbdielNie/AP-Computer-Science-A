
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape{
    private double width;
    private double height;
    
    public Rectangle(String name,double width, double height){
        super(name, 4);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    @Override
    public double getArea(){
        return width * height;
    }
    
    
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(){
        this.height = height;
    }
}
