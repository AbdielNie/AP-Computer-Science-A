public class Teacher extends Human implements WageEarning
{
    //private String name;
    private Course[] courses;
    private int numCourses;
    private double wage;
    
    public Teacher(){
        super();
        courses = new Course[7];
        numCourses = 0;
    }
    
    @Override
    public void responsibilities(){
        System.out.println(this.name + " needs to study " + showCourses());
    }
    
    public Teacher(String name, double wage){
        super();
        this.name = name;
        courses = new Course[7];
        numCourses = 0;
        this.wage = wage;
    }
    
    public String showCourses(){
        String str = "";
        for(int i = 0; i < courses.length; i++){
            str += "\t|" + courses[i];
        }
        str += "|";
        return str;
    }
    
    @Override
    public void work(){
        System.out.println(getName() + " has teached.");
    }
    
    @Override
    public void work(int hours){
        System.out.println(getName() + " has teached " + hours + "hours.");
    }

    public Course[] getCourses(){
        return courses;
    }
    
    public void addCourse(Course course){
        
        this.courses[numCourses] = course;
        numCourses++;
        
    }
    
    public double calculateEarning(double time){
        
        return this.wage;
        
    }
    
    
    
    
}