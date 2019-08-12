
/**
 * Write a description of class SuperHero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SuperHero
{
    //Attribute
    private String name;
    private int age;
    private String trait;
    private String superpower;
    private String color;
    private String gender;
    private String clothing;
    
    //constructive
    //Generic Constrctuctor: no input
    public SuperHero(){
       name = "No one";
       gender = "Unknown";
       age = -1;
       trait = "None";
       superpower = "None";
       color = "Transparent";
       clothing = "Naked";
    }
    
    //Constructor with parameters(int)
    public SuperHero(String n, String g, int a, String t, String s, String co, String cl){
        name = n;
        gender = g;
        age = a;
        trait = t;
        superpower = s;
        color = co;
        clothing = cl;
    }
    
    
    //Methods
    //Getter - allow other programs to access the values
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSuperpower(){
        return superpower;
    }
    
    //Setter - change the values of an object
    public void changeAge(){
        age++;
    }
    public void changeColor(String newColor){
        color = newColor;
    }
    
    

}
