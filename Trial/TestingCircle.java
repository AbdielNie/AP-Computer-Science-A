
/**
 * Write a description of class TestingCircle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestingCircle
{
    public static void main(String[] args){
        SimpleCircle circle = new SimpleCircle(5.0);
        System.out.println(circle.getRadius() + "\n" + circle.getPerimeter() + "\n" + circle.getArea());
        circle.setRadius(10.0);
        System.out.println(circle.getRadius() + "\n" + circle.getPerimeter() + "\n" + circle.getArea());
        
    }
}
