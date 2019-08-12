
/**
 * name:AbdielNie
 * date: 09/27/2017
 * description: testing simplecircle program
 */
public class Simplecircletesting
{
    public void main (String [] args)
    {
        simplecircle fCircle = new simplecircle();
        simplecircle sCircle = new simplecircle(5.0);
        simplecircle tCircle = new simplecircle(10.3);

        System.out.println("The radius of circle 1 is " + fCircle.getradius());
        System.out.println("The area of circle 2 is " + sCircle.getarea());
        System.out.println("The perimeter of circle 3 is " + tCircle.getperimeter());

        fCircle.setradius(25.5);

        System.out.println("The new area of circle 1 is " + fCircle.getarea());

        
    }
}
