
/**
 * Write a description of class Human here.
 *
 * @author jimschenchen
 * @version 2017/12/13
 */
public abstract class Human
{
    protected String name;
    protected int age;
    private String gender;
    
    
    public Human(){
        name = null;
        age = -1;
        gender = null;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public String getName(){
        return this.name;
    }

    public void work(){
        System.out.println(name + " has worked.");
    }
    
    public void work(int hours){
        System.out.println(name + " has worked " + hours + " hours.");
    }
    
    public abstract void responsibilities();
    
    
    public static void main(String[] args){
        Human a = new Student();
        a.gender = "1";
    }
}
