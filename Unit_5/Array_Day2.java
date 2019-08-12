
/**
 * Write a description of class Array_Day2 here.
 *
 * @author jimschenchen
 * @version 2017/11/14
 */
public class Array_Day2
{
    public static int[] q1(){
        int[] ret = {3, 1, 4};
        return ret;   
    }
    
    public static int[] q2(int[] arr){
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i ++){
            ret[i] = arr[arr.length - 1 - i];
        }
        return ret;
    }
    
    public static boolean q3(int[] arr){
        int cou = 0;
        boolean ret = false;
        for(int i = 0; i < arr.length; i ++){
            cou = 0;
            for(int ii = 0; ii < arr.length; ii ++){
                if(arr[i] == (arr[ii])){
                    cou ++;
                }
            }
            if(cou > 2){
                ret = true;
            }
        }
        return ret;
    }
    // This is wrong one....
    
    public static boolean reQ3(int[] arr){
        int coun = 0;
        for(int i = 0; i < arr.length - 1; i ++){
            if(arr[i] == 3 && arr[i + 1] != 3){
                coun ++;
            }
        }
        if(arr[arr.length - 1] == 3 /* && arr[arr.length - 2] != 3 */){
            coun ++;
        }
        if(coun > 2){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean q4(int[] arr, int n){
        boolean ret = true;
        for(int i = 0; i < n; i ++){
            if(arr[i] != arr[arr.length - n + i]){
                ret =false;
            }
        }
        return ret;
    }
    
    public static boolean q5(int[] outer, int[] inner){
        boolean ret = true;
        int ii = 0;
        for(int i =0; i < outer.length; i ++){
            if(inner[ii] == outer[i]){
                ii ++;
            }
        }
        if(ii == inner.length){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
    
}