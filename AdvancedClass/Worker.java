
/**
 * Write a description of class Worker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Worker extends Human implements WageEarning, CafeteriaSystem
{
    //private String name;
    private double wage;
    
    
    
    public Worker(String name, double wage){
        super();
        this.name = name;
        this.wage = wage;
    }
    
    public void responsibilities(){
        //
    }
    
    public double calculateEarning(double time){
        
        return this.wage;
        
    }
    
    public void pay(double weightOfFood){
        this.wage -= weightOfFood * 4;
    }
    
    
    public void setWge(double wage){
        this.wage = wage;
    }
    public double getWage(){
        return this.wage;
    }
}
