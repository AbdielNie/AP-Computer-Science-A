/**
 * @name: FileOperate
 * @author: jimschenchen
 * @date: Jan.2nd 2018
 * @description: 
 */


/**
 *
 * @author jimschenchen
 */
import java.io.*;
public class FileOperate {
    
    /**
     * @name: getFile
     * @param: String add
     * @return: String
     * @description: 
     */
    public static String getFile(String add){
        File myFile = new File(add);
        String content = "";
        try {
                FileReader fr = new FileReader(myFile);
                BufferedReader reader = new BufferedReader(fr);
                String line;
                 while ((line = reader.readLine()) != null)  { //important!!!
                    content += line + "\n";
                } 	
                reader.close();
                fr.close();
        } catch (IOException e) {
                System.out.println("Does not work");
        }
        return content;
    }
    
    /**
     * @name: operateFile
     * @param: String add
     * @return: String
     * @description: 
     */
    public static String operateFile(String add){
        File myFile = new File(add);
        String content = "";
        try {
                FileReader fr = new FileReader(myFile);
                BufferedReader reader = new BufferedReader(fr);
                String line;
                 while ((line = reader.readLine()) != null)  { //important!!!
                    content += line + " :: " + Operation.operation(line) + "\n";
                } 	
                reader.close();
                fr.close();
        } catch (IOException e) {
                System.out.println("Error:::");
        }
        return content;
    }
    
    /**
     * @name: saveFile
     * @param: String add, String content
     * @return: boolean
     * @description: 
     */
    public static boolean saveFile(String add, String content){
        
        File myFile = new File(add);
        String[] str = content.split("\n");
        try{
            FileWriter fw = new FileWriter(myFile);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0; i < str.length; i ++){
                bw.write(str[i]);
                bw.newLine();
            }
          
            
            bw.close();
            fw.close();
        }catch(IOException e){
            System.out.println("error");
            return false;
        }
        
        return true;
        
    }
    
    
}