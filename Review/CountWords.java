
/**
 * Write a description of class countWords here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class CountWords
{
    public static ArrayList countWord(String str){
        str = str.toUpperCase();
        
        ArrayList<Word> list = new ArrayList<Word>();
        
        int wordCount = 0;

        int start = 0;
        int end = 0;
        
        
        for(int i = 0; i < str.length(); i ++){
            if(str.charAt(i) == ' ' || i == str.length() - 1){
                //wordCount ++;
                end = i;
                String add = str.substring(start, end);
    
                System.out.println(add);    
                
                int check = -1;
                for(int ii = 0; ii < wordCount; ii ++){
                    if(list.get(ii).getName() == add){
                         list.get(ii).addOne();
                         check = 1;
                    }else{
                    }
                }
                if(check == -1){
                    wordCount ++;
                    Word word = new Word(add);
                    list.add(word);
                }
                
                

                
                start = i + 1;
            }

        }

        return list;
    }
    

}
