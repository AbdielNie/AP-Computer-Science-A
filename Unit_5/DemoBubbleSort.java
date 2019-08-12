import java.util.*;
/**
 * Write a description of class DemoBubbleSort here.
 *
 * @author jimschenchen 
 * @version 2017/11/29
 */
public class DemoBubbleSort
{
        public static void main (String[] args){
            int[] myNums = new int[5];
            Random rngGod = new Random();
            for (int i = 0; i < myNums.length; i ++){
                myNums[i] = rngGod.nextInt(5000);
            }
            printArray(myNums);
            
            
            //bubble Sort
            bubbleSort(myNums);
            printArray(myNums);
        }
        
        public static void printArray(int[] nums){
            for(int i = 0; i < nums.length; i++){
                System.out.print(nums[i] + "    ");
            }
            System.out.println();
        }
        
        public static void bubbleSort(int[] nums){
            int temp;
            for(int i = 0 ; i < nums.length; i ++){
                for(int ii = 0; ii < nums.length - 1; ii ++){
                    if(nums[ii] > nums[ii + 1]){
                        temp = nums[ii];
                        nums[ii] = nums[ii + 1];
                        nums[ii + 1] = temp;   
                    }
                }
            }
        }
        //boolean
        //do 
        //while
}
