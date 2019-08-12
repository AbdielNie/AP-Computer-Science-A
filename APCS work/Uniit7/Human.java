
/**
 * Write a description of class Human here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Human
{
    protected String name;//change to protected
    private int age;
    private String gender;
    
    public Human()
    {
        name = null;
        age =-1;
        gender = null;
        
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
       
    }
    public void setGender(String gender)
    {
       this.gender = gender;
       
    }
    public void work()
    {
        System.out.println(name+ " has worked.");
        
    }
    public void work(int hours)
    {
        System.out.println(name+" has worked "+hours+" hours");
    }
}