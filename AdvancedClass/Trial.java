
/**
 * Write a description of class Trial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class Trial
{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(3,"3");
        
        forEach(list);
    }
    
    public static void forEach(ArrayList list){
        for(Object i : list){
            System.out.println(i);
            
        }
        
    }
}
