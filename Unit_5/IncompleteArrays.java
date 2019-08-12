
/**
 * Write a description of class IncompleteArrays here.
 *
 * @author jimschenchen
 * @version 2017/11/20
 */
public class IncompleteArrays
{
    public static void main (String[] args){
        //initializing array
        char[] myChars = new char[5];
        int numChars = 2;
        
        
        myChars[0] = 'Z';
        myChars[1] = 'a';
        
        printArray(myChars, numChars);
        
        
        
        //inserting at the end
        numChars++;
        myChars[numChars] = 'P';
        
        printArray(myChars, numChars);
        
        
        
        //inserting in the middle, at index 0
        int insertIndex = 0;
        for(int i = numChars; i > insertIndex; i--){
            myChars[i] = myChars[i - 1];
        }
        myChars[insertIndex] = 'q';
        numChars++;
        
        printArray(myChars, numChars);
        
        
        
        //deleting at the end
        numChars --;
        
        
        //delete at index 1
        int deleteIndex = 1;
        for(int i = deleteIndex; i < numChars; i ++){
            myChars[i] = myChars[i + 1];
        }
        numChars --;
        
        
        
        //insert 5 more elements;
        myChars[numChars] = 'j';
        numChars++;
        myChars[numChars] = 'i';
        numChars++;
        myChars[numChars] = 'm';
        numChars++;        
        
        printArray(myChars, numChars);
        
        char[] characters = new char[myChars.length * 2];
        
        for(int i = 0; i < numChars; i ++){
            characters[i] = myChars[i];
        }
        myChars = characters;
        
        myChars[numChars] = 'o';
        numChars++;
        myChars[numChars] = 'l';
        numChars++;    
        
        printArray(myChars, numChars);
        
    }
    
    public static void printArray(char[] myChars, int num){
        for(int i = 0; i < num; i ++){
            System.out.print(myChars[i] + "\t");
        }
        System.out.println();
    }
}
