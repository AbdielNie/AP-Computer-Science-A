
/**
 * Write a description of class Human here.
 *
 * @author jimschenchen
 * @version 2017/12/13
 */
public class Student extends Human{
    //method
    //private String name;
    private int studentNum;
    private Course[] courses;
    private int numCourses;
    private int numCredits;

    public Student(){
        super();//calls the constructor of the parents
        courses = new Course[7];
        numCredits = 0;
        numCourses = 0;
    }
    
    public Student(String name){
        super();//calls the constructor of the parents
        this.name = name;
        courses = new Course[7];
        numCredits = 0;
        numCourses = 0;
    }
    
    @Override
    public void work(){
        System.out.println(name + " has studied."); //protected name
        
        System.out.println(getName() + " has studied.");    //private name
        
    }
    
    @Override
    public void responsibilities(){
        System.out.println(this.name + " needs to study " + showCourses());
    }
    
    public String showCourses(){
        String str = "";
        for(int i = 0; i < courses.length; i++){
            str += "\t|" + courses[i];
        }
        str += "|";
        return str;
    }
    
    public void addCourse(Course course){
        this.courses[numCourses] = course;
        numCourses++;
    }

    public void earnCredits(int numCreditsEarned){
        this.numCredits += numCreditsEarned;
    }
    public int getCredits(){
        return this.numCredits;
    }
    
    public String toString(){
        return this.name;
    }
    
    public void fly(){
        System.out.println("fly");
    }
   
    public static void main(String[] args){
        Human a = new Student();
        a.setName("Jim");
        a.setAge(18);
        a.setGender("SuperGender");
        


        
        a.work();
        //a.fly();

        if(a instanceof Student){
            System.out.println("This is a student!");
        }else{
            System.out.println("This is not a student!");
        }
        
        
        ((Student)a).age = 0;
        ((Student)a).earnCredits(5);
        System.out.println(((Student)a).getCredits());
        
    }
}