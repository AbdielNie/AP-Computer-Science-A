
/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Human implements WageEarning,CafeteriaSystem
{
    private Course[] courses;
    private double wage;
    public Teacher()
    {
        super();
        courses = new Course[7];
        wage = 0;
    }
    /*public Teacher(String name,double wage)
    {
        super(name);
        courses = new Course[7];
        this.wage = wage;
    }*/
    public void work()
    {
        System.out.println(getName() + "" + "has worked");
    }
    public double calculateEarning(double wage)
    {
        return wage;
    }
    public static void main(String []args)
    {
        Teacher A= new Teacher();
        A.setName("asdfghjkl");
        A.setAge(47);
        A.setGender("Female");
        
        A.work(1);
    }
    public void pay (double weight)
    {
        System.out.println("You need to pay 6 RMB");
    }
}
