
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Human implements CafeteriaSystem 
{
        //private String name;
        private Course[] course;
        private int numCredits;
        public Student()
        {
            super(); //calls the constructor of the parent
            course = new Course[7];
            numCredits = 0;
        }

        public void work()
        {
            System.out.println(getName() + "has studied.");
        }
        public void getCredits(int numCredits)
        {
            numCredits += numCredits;
        }

        public void pay(double weightOfFood)
        {
            double cost = weightOfFood*1.2 +7;
            System.out.println("You must pay" + cost + "RMB");
        }
        public static void main(String [] args)
        {
            Student a = new Student();
            a.setName("asd");
            a.setAge(18);
            a.setGender("Female");
            
            //Human b = new Human();
            //b.setName("sffg");
            a.work();
            //b.work();
            a.work(10);
            /*
            ((Student)a).getCredits(5);

            if (b instanceof Student)
            {
                System.out.println(b.name + " is a student");
            }
            else{
                System.out.println(b.name + " is not student");
            }
            if (a instanceof Student)
            {
                System.out.println(a.name + " is a student");
            }
            else{
                System.out.println(a.name + " is not student");
            }
        }*/
    }
}

