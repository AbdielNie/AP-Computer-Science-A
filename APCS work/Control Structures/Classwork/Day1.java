
public class Day1
{
    /**
     * Make a function called howOld which 
     * displays a different message depending 
     * on the age given 
     */
    
    public static String howOld(String name, int age)
    {
        if ( age < 16)
        {
            System.out.println(name + "," + "You can't drive");
        }
        if ( age < 18)
        {
            System.out.println(name + "," + "You can't vote");
        }
        if (age < 25)
        {
           System.out.println (name + "," + "You can't rent a car");
        }
        
            return name + "," + "You can do anything that's legal";
        
    }
    
    /**
     * Here is a function called weekdayName 
     * that takes an integer.
     * Use if and else to complete it according
     * to the following table 
     */
    public static String weekdayName(int date)
    {
        if (date == 1)
        {
            return "Sunday";
        }
        else if (date == 2)
        {
            return "Monday";
        }
        else if (date == 3)
        {
            return "Tuesday";
        }
        else if (date == 4)
        {
            return "Wednesday";
        }
        else if (date == 5)
        {
            return "Thursday";
        }
        else if (date == 6)
        {
            return "Friday";
        }
        else if (date == 7)
        {
            return "Saturday";
        } 
        else if (date == 0)
        {
            return "Saturday";
        }
        else 
        return "error";
    }

}
