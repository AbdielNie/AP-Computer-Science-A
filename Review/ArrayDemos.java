
/**
 * Write a description of class ArrayDemos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class ArrayDemos
{

    public static void main(String[] args){
        
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("100");
        list.add("12");
        
        for(String str : list){
            System.out.println(str);
        }
        
        ArrayList<Pen> pen = new ArrayList<Pen>();
        pen.add(new Pen("2222"));
        pen.add(new Pen("124"));
        
        for(Pen a : pen){
            System.out.println(a);
        }
        
        
        
        
    }
    
}

