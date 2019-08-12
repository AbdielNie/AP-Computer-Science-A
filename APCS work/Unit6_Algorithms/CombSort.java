import java.util.Scanner;
/**
 * Write a description of class comb_aArray_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class CombSort
{
    
    // 
    int getNextGap(int gap)
    {

        gap = (int)(gap / 1.3);//(gap * 0.8)
        if (gap < 1)
            return 1;
        return gap;
    }


    void sort(int arr[])
    {
        int n = arr.length;

        // initialize gap
        int gap = n;

        // Initialize swapped as true to make sure that
        // loop runs
        boolean swapped = true;

        // Keep running while gap is more than 1 and last
        // iteration caused a swap
        while (gap != 1 || swapped == true)
        {
            // Find next gap
            gap = getNextGap(gap);

            // Initialize swapped as false so that we can
            // check if swap happened or not
            swapped = false;

            // Compare all elements with current gap
            for (int i=0; i<n-gap; i++)
            {
                if (arr[i] > arr[i+gap])
                {
                    // Swap arr[i] and arr[i+gap]
                    int temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = temp;

                    // Set swapped
                    swapped = true;
                }
            }
        }
    }

    // Driver method
    public static void main(String args[])
    {
        CombSort ob = new CombSort();
        int arr[] = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};
        ob.sort(arr);

        System.out.println("sorted array");
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");

    }

    /*
    static void CombSort(int[] nums)
    {
    // start by using the length/size of the set as the gap.
    int gap = nums.length;

    // loop indefinately.
    while (true)
    {
    // update the gap value so that it shrinks
    // towards 1.
    if (gap > 1)
    {
    gap = (int)((double)gap / 1.3);
    }

    // do the comb sort with the current gap
    boolean swapped = false;
    for (int i = 0; i + gap < nums.length; ++i)
    {
    if (nums[i] > nums[i + gap])
    {
    swap(nums, i, i + gap);
    swapped = true;
    }
    }

    // if we're down to a gap of 1, and we haven't swapped
    // anything, then we're sorted.
    if (gap == 1 && !swapped)
    {
    break;
    }
    }
    }
     */
}