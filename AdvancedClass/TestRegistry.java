
/**
 * Write a description of class TestRegistry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestRegistry
{
    public static void main(String[] args){
        //create a array of humans
        //put inall the people in our class
        //if it is student, list courses
        //if it is a teacher, say they working hard
        
        Course Ap = new Course("AP");
        Course Math = new Course("Math");
        Course PE = new Course("PE");

        
        
        Human[] list = new Human[10];
        
        list[0] = new Student("jimschenchen");
        ((Student)list[0]).addCourse(Ap);
        ((Student)list[0]).addCourse(Math);
        
        list[1] = new Teacher("Mr.Lee",1);
        
        list[2] = new Student("Cloudyyoung");
        ((Student)list[2]).addCourse(Ap);
        ((Student)list[2]).addCourse(Math);
        ((Student)list[2]).addCourse(PE);
        
        list[3] = new Student("Abdiel");
        ((Student)list[3]).addCourse(Ap);
        ((Student)list[3]).addCourse(Math);

        list[4] = new Student("Jimmy");
        ((Student)list[4]).addCourse(Ap);
        ((Student)list[4]).addCourse(Math);
        
        list[5] = new Student("Dina");
        ((Student)list[5]).addCourse(Ap);
        ((Student)list[5]).addCourse(Math);
        
        list[6] = new Student("William");
        ((Student)list[6]).addCourse(Ap);
        ((Student)list[6]).addCourse(Math);
        
        list[7] = new Student("Valentina");
        ((Student)list[7]).addCourse(Ap);
        ((Student)list[7]).addCourse(Math);

        list[8] = new Student("York");
        ((Student)list[8]).addCourse(Ap);
        ((Student)list[8]).addCourse(Math);
        
        list[9] = new Student("OliverQ");
        ((Student)list[9]).addCourse(Ap);
        ((Student)list[9]).addCourse(Math);
        
        for(int i = 0; i < list.length; i ++){
            if (list[i] instanceof Student){
                System.out.println(list[i].getName() + "'s courses: " + ((Student)list[i]).showCourses());
            }else if(list[i] instanceof Teacher){
                System.out.println(list[i].getName() + " is working hard");
            }else{
                System.out.println("Name " + i + ":empty");
            }
        }
        
    }
}
