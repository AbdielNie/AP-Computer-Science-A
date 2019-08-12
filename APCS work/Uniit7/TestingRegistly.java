
/**
 * Write a description of class TestingRegistly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestingRegistly
{
   //private Course[] courses;
   
   public static void main(String [] args)
   {       
       //create an array of humans
       //put in all the people in our class
       //if it is student list courses
       //if it is teacher ,say they working hard =P
       Human Jim = new Student();
       Jim.setName("Jim");
       Human Abdiel = new Student();
       Abdiel.setName("Abdiel");
       Human W = new Student();
       W.setName("W");
       Human V = new Student();
       V.setName("V");
       Human York = new Student();
       York.setName("York");
       Human Cloudy = new Student();
       Cloudy.setName("Cloudy");
       Human Tina = new Student();
       Tina.setName("Tina");
       Human Jimmy = new Student();
       Jimmy.setName("Jimmy");
       Human EdwinLee = new Teacher();
       EdwinLee.setName("8==D");
       
       Human [] classroom = new Human[9];
       classroom[0] = Jim;
       classroom[1] = Abdiel;
       classroom[2] = W;
       classroom[3] = V;
       classroom[4] = York;
       classroom[5] = Cloudy;
       classroom[6] = Tina;
       classroom[7] = Jimmy;
       classroom[8] = EdwinLee;
       /*
       if (Human instanceof Student)
       {
           //System.out.println(((Student)a).courses());
           System.out.println("error");
        }
       if(a instanceof Teacher)
       {
           System.out.println(getName() + " should work hard =P");
        }
        */
    }
   /*
    public void personA(Human a)
   {
       if (a instanceof Student)
       {
           //System.out.println(((Student)a).courses());
           System.out.println("error");
        }
       if(a instanceof Teacher)
       {
           System.out.println("You should work hard =P");
        }
     
    }
    */
    }


