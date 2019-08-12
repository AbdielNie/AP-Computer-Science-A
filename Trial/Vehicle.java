
/**
 * Name: Vehicle
 * Authour: jimschenchen
 * Time: 2017/09/28
 * Description: None
 */
public class Vehicle
{
    //ATTRIBUTE
    private double velocity;
    private double direction;
    private String license;
    private int capacity;
    
    //consructive
    public Vehicle(){
        velocity = 0;
        direction = 0;
        license = "None";
        capacity = -1;
    }
    public Vehicle(String l, int c){
        license = l;
        capacity = c;
    }
    
    //method
    //getter method
    public double getVelocity(){
        return velocity;
    }
    public double getDirection(){
        return direction;
    }
    public String getLicense(){
        return license;
    }
    public int getCapacity(){
        return capacity;
    }
    
    //setter 
    public void setPeopleNumber(int n){
        capacity = n;
    }
    public void changeLicense(String l){
        license = l;
    }
    
        public void accelerate(double a){
        velocity += a;
    }
    public void decelerate(double d){
        velocity -= d;
    }
    public void turnLeft (double degree){
        direction -= degree;
    }
    public void turnRight (double degree){
        direction += degree;
    }
    
        
        
}
