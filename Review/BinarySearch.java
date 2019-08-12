
/**
 * Write a description of class BinarySearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearch
{
    public static int search(int[] list, int num){
        if(list.length == 0){
            System.out.println("error!");
            return -1;
        }else{
            int length = list.length;
            return mSearch(list, num, 0, length - 1);
        }
    }
    
    public static int mSearch(int[] list, int num, int start, int end){
        if(list.length == 0){
            System.out.println("error!");
            return -1;
        }else{
            int length = list.length;
            if(num == list[(start + end) / 2 + start]){
                return (start + end) / 2 + start;
            }else if(num < list[(start + end) / 2 + start]){
                return mSearch(list, num, start, (start + end) / 2);
            }else{
                return mSearch(list, num, (start + end) / 2, end);
            }
        }
    }
}
