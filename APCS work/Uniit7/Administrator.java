
/**
 * Write a description of class Administrator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Administrator extends Human
{
    //private String name;
    private Course[] courses;
    private int[] responsibilities;
    
    public Administrator()
    {
        super();
        courses = new Course[7];
        responsibilities = new int[10];
    }
    public void work()
    {
        System.out.println(getName() + "" + "has worked");
    }
    public static void main(String [] args)
    {
        Administrator person= new Administrator();
        person.setName("asdfghjkl");
        person.setAge(55);
        person.setGender("Male");
        
        Administrator Headteacher = new Administrator();
        Headteacher.setName("NULL");
        Headteacher.work();
        Headteacher.work(8);
        person.work(6);
    }
}
