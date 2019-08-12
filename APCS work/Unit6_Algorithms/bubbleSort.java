import java.util.Random;
/**
 * Write a description of class bubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bubbleSort
{
    public static void main (String [] args)
    {
        int [] myNums = new int[5];
        Random rngGod = new Random();
        for (int i = 0; i < myNums.length; i++)
        {
            myNums[i] = rngGod.nextInt(50000);
        }
        printArray(myNums);
        
        //bubule sort
        bubbleSort(myNums);
        printArray(myNums);
    }
    public static void printArray(int [] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i] + "");
        }
        System.out.println();
    }
    public static void bubbleSort(int [] nums)
    {
        int a = nums.length;
        int b = nums.length;
        int c = nums.length;
        boolean change;
        do{
            change = false;
            for(a = 0; a < b - 1; a++)
            {
                if (nums[a] > nums[a + 1])
                {
                    c = nums[a];
                    nums[a] = nums[a+1];
                    nums[a+1] = c;
                    change = true;
                }
            }    
        }while(change);
    }
}
