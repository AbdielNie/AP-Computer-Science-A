
/**
 * Name : AbdielNie
 * Date : 09/27/2017
 * Description: create superhero class
 */
public class Superhero
{
    //Attributes
    private String name;
    private String gender;
    private String trait;
    private String superpower;
    private String colour;
    private String clothing;
    private int age;
    private int height;
    
    //constructors
    // Generic Constructor: no input
    public Superhero()
    {
        name = "Nothing";
        gender = "Unknown";
        age = -1;
        height = -1;
        trait = "None";
        superpower = "None";
        colour = "None";
        clothing= "Naked";
    }    
    
    //constructor with Parameters(input)
    public Superhero(String n, String g, int a, int h, String t, String s, String c, String clothing)
    {
        name = n;
        gender = g;
        age = a;
        height = h;
        trait = t;
        superpower = s;
        colour = c;
        clothing = clothing;
    }
    
    //Method
    //Getter - allow other program to access the values
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getSuperpower()
    {
        return superpower;
    }
    public String getColour()
    {
        return colour;
    }
    
    //Setter - change the values of an obect
    public void changeAge()
    {
        age++;
    }
    public void changeColour(String newColour)
    {
        colour = newColour;
    }
    
    
    
    
    
}