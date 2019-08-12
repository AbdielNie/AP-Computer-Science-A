import java.util.*;
/**
 * Write a description of class ArrayListTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListTest
{
    public static void main(String [] args)
    {
      Student [] Students = new Student[5];
      /*
       * 1.Create a new large array
       * Student [] temp = new Student[10];
       * 2.copy values
       * loop
       * 3.assign the old array name as the new array
       * ourStudents = temp;
       */
    
      ArrayList<Student> myStudents = new ArrayList <Student>();
          String [] names = {"A","B","C","D","E"};
          for (int i = 0; i< names.length; i++)
          {
              Student temp = new Student(names[i]);
              myStudents.add(temp);
            }
          Student temp = new Student("Cloudy");
          myStudents.add(0,temp);
          
          //remove the last element
          myStudents.remove(myStudents.size()-1);
          
          //remove the first element
          myStudents.remove(0);
     }
      
    }

