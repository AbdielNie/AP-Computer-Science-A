
public class Student
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;
    private String [] classes;
    
    /*
    public Student(String name, int age, String [] classes)
    {
        this.name = name;
        this.age = age;
        this.classes = classes;
    }
    */

    public Student(String name, int age, String [] classes)
    {
        this.name = name;
        this.age = age;
        
        //Copy Array
        this.classes = new String[classes.length];
        for(int i = 0; i < classes.length; i ++){
            this.classes[0] = classes[0];
        }
    }
   
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getNumClasses() {
        return this.classes.length;
    }
    public String getClass(int i) {
        return this.classes[i];
    }
    
    /*
    public String [] getClasses() {
        return this.classes;
    }
    */
   
    public String [] getClasses() {
        String[] retArray = new String[this.classes.length];
        for(int i = 0; i < this.classes.length; i ++){
            retArray[i] = this.classes[i];
        }
        return retArray;
    }
    
    public void changeClasses(String str, int index){
        this.classes[index] = str;
    }
    
    public static void main (String [] args ) {
        String [] classes = {"Chem","Bio","Phys"};
        Student a = new Student("He",20,classes);
        
        System.out.println(a.getClass(0));
        classes[0] = "CS";
        System.out.println(a.getClass(0));
        a.getClasses()[0] = "AP";
        System.out.println(a.getClass(0));
        a.changeClasses("HH", 0);
        System.out.println(a.getClass(0));
    }
}