/**
 * Write a description of class TestingConditions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestingConditions
{
    public static void greaterThanFive(int num)
    {
        if (num > 5)
        {
            System.out.println(num + " " + "is greater than 5");  
        }

        System.out.println(num + " " + "Smaller than 5");

    }

    /**
     * determineYouth(int age)
     * tells whether person is young or old
     * 
     * Input:age-how olde the person is
     * Output:String that says that the person is young or old
     */
    public static String determineYouth(int age)
    {
        if (age > 30)
        {
            return "You are old!";
        }
        else 
        {
            return "You are young";
        }
    }
    
    /**
     * determaineGrade(int mark)
     * tells the letter grade of a mark
     * 
     * Input: mark - percentage grade
     * Output : char letter grade
     */
    public static char determineGrade(int mark)
    {
        /*
         * A >= 86
         * B >= 73
         * C >= 67
         * D >= 60
         * F < 60
         */
        if (mark >= 86)
        {
            return 'A';
        }
        else if (mark >= 73)
        {
            return 'B';
        }
        else if (mark >= 67)
        {
            return 'C';
        }
        else if (mark >= 60)
        {
            return 'D';
        }
        
        return 'F';
        
    }
    
    
}