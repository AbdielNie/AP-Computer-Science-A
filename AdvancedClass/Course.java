public class Course{
    private String cName;
    private Student[] students;
    private Teacher teacher;
    
    public Course(String cName){
        this.cName = cName;
    }
    
    
    
    
    public String toString(){
        return cName;
    }
}