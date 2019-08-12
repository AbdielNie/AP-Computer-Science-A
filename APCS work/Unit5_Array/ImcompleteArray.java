
public class ImcompleteArray
{
    public static void main (String [] args)
    {
        char [] myChars = new char [5];
        int numChars = 2;

        myChars [0] = 'Z';
        myChars [1] = 'A';

        //inserting at the end
        numChars++;
        myChars[numChars - 1] = 'P';
        numChars++;
        printArray(myChars,numChars);

        //inserting in the middle, at index 0 
        int insertIndex =0;
        for (int i = numChars; i > insertIndex; i--)
        {
            myChars[i] = myChars[i - 1];
        }
        myChars[insertIndex] = 'Q';
        numChars++;
        printArray(myChars,numChars);

        //deleting at the end
        int deleteIndex = 0;
        for (int i = deleteIndex; i > deleteIndex; i++)
        {
            myChars[i] = myChars[i + 1];
        }
        myChars[deleteIndex] = 'W';
        numChars--;
        printArray (myChars,numChars);
        
        
        
        char [] characters = new char[myChars.length * 2];
        for(int i = 0 ;i < numChars; i--)
        {
            characters[i] = myChars[i];
        }
         
    }

    public static void printArray(char [] myChars, int num)
    {
        for (int i = 0; i < num; i++)
        {
            System.out.print(myChars[i] + "\t");
        }
        System.out.println();
    }

}
