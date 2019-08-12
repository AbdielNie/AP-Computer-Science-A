import java.util.*;
/**
 * Write a description of class ArrayListTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListTest{
    
    public static void main(String[] args){
        Student[] ourStudents = new Student[5]; //

        /*
         * Enlarge:
         * create a new array large array
         * copy values - loop
         * assign the old array name as new array - x = x';
         */
        
        ArrayList<Student> myStudent = new ArrayList<Student>();
        String[] names = {"A","B","C","D","E"};
        
        for (String i : names){
            Student temp = new Student(i);
            myStudent.add(temp);
        } 

        //add at beginning of arrayList
        Student temp = new Student("Jimini");
        myStudent.add(0, temp);
        
        //remove
        myStudent.remove(myStudent.size() - 1);
        myStudent.remove(0);
        
        myStudent.ensureCapacity(20);        System.out.println(myStudent.size());
        
        //output
        for (Student s : myStudent){
            System.out.println(s);
        }
        
    }
}
