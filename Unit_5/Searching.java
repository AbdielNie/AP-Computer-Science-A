
public class Searching
{
    public static int linearSearch(int [] nums, int value) {
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] == value){
                return i;//found
            }
        }
        return -1;//not found througth entire list
    }
    
    
    public static int binarySearch(int[] nums, int value) {
        return binarySearch(nums,0,nums.length-1, value);
    }
    
    
    public static int binarySearch(int [] nums, int start, int end, int value) {
        if (end-start < 1) {
            return -1;
        }
        int middleIndex = (start + end) / 2;
        int compareNum = nums[middleIndex];
        if (compareNum == value) {
            return middleIndex;
        } else if (compareNum > value) {
            return binarySearch(nums,start,middleIndex-1, value);
        } else { // if (compareNum < value) {
            return binarySearch(nums, middleIndex+1, end, value);
        }
    }
}
