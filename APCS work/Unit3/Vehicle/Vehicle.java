
/**
 * name: AbdielNie
 * date: 09/28/2017
 * discription: simple vehicle
 */
public class Vehicle
{
    //Attributes
    private double velocity;
    private double direction;
    private String license;
    private int capacity;
    
    //constructor
    public Vehicle()
    {
        velocity = 100.0;
        direction =0;
        license = "wsdfgh";
        capacity = 6;
    }
    public Vehicle (double v, double d, String l, int c)
    {
        velocity = v;
        direction = d;
        license = l;
        capacity = c;
    }
    
    //method
    
    public void accelerate()
    {
        velocity++;
    }
    public void deccelerate()
    {
        velocity--;
    }
    public void turnLeft()
    {
        direction--;
    }
    public void turnRight()
    {
        direction++;
    }
    public void setpeopleNumber(int c)
    {
        capacity = c;
    }
    public void changeLicense(String newlicense)
    {
        license = newlicense;
    }
}
