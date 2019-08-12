
/**
 * Write a description of class DemoArrays here.
 *
 * @author (jimschenchen
 * @version 2017/11/14
 */

import java.util.ArrayList;
import java.util.Comparator;  
public class DemoArrays
{
    public static void demoStringArray(){
        //pre-set array
        String[] fruits = {"Apples", "Banana", "Mango"};
        
        //dynamic array
        String[] vegetables = new String[4];
        
        
        //initialize my array
        vegetables[0] = "Carrot";
        vegetables[1] = "Broccoli";
        vegetables[2] = "Tomato";
        vegetables[3] = "Cucumber";
        
        System.out.println(vegetables[0]);
        for (int i = 0; i < vegetables.length; i++){
            
            System.out.println(vegetables[i]);
            
        }
    }

    
    public static boolean q(int[] intArray){
        boolean ret = false;
        for(int i = 0; i < intArray.length - 2; i ++){
            if((intArray[i] == 7 && intArray[i + 1] == 7) || (intArray[i] == 7 && intArray[i + 2] == 7) || (intArray[i + 1] == 7 && intArray[i + 2] == 7))
            ret = true;
        }
        return ret;
    }
    
    public static void review(){
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        
        int[] b = new int[a.length * 2];
        for(int i = 0; i < a.length; i ++){
            b[i] = a[i];
        }
        b[3] = 4;
        a = b;
        for(int i = 0; i < b.length; i ++){
            System.out.println(b[i]);
        }
    }
    
    public static void try1(){
        ArrayList <Integer> arr = new ArrayList(); 
        //arr.ensureCapacity(10);
        //arr.set(0, 1);
        arr.add((Integer)1);
        arr.add(arr.get(0));
        arr.add((int)3);
        arr.set(2, 0);  
        
        
        
        System.out.println(arr);
        
        
        Comparator c = new Comparator<Integer>() {  
            @Override  
            public int compare(Integer o1, Integer o2) {  
                // TODO Auto-generated method stub  
                if((int)o1<(int)o2)  
                    return 1;  
                //注意！！返回值必须是一对相反数，否则无效。jdk1.7以后就是这样。  
        //      else return 0; //无效  
                else return -1;  
            }  
        };        
        
    
    
        arr.sort(c);
        System.out.println(arr);
        
    }
    
   

}
