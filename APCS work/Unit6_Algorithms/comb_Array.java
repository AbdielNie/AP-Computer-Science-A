
/**
 * Write a description of class comb_Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class comb_Array
{
    //comb sort
    public static void combSort(int [] nums)
    {
        int gap = nums.length;
        boolean swap = true;
        while (gap > 1 || swap) 
        {
            if (gap > 1) 
            {
                gap = (int) (gap / 1.3);
            }
            int i = 0;
            swap = false;
            while (i + gap < nums.length) 
            {
                if (nums[i] >= nums[i + gap]) 
                {
                    int t = nums[i];
                    nums[i] = nums[i + gap];
                    nums[i + gap] = t;
                    swap = true;
                }
                i++;
            }
        }
    }
}
