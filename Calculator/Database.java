/**
 * @name: Database
 * @author: jimschenchen
 * @date: Jan.2nd 2018
 * @description:  * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *  
 * @author jimschenchen
 */
import java.util.*;
public class Database {
    private String displayContent;
    private ArrayList<String> history;
    String add = "";
    
    /**
     * @name: Database
     * @return: 
     * @description: 
     */
    public Database(){
        displayContent = "";
        history = new ArrayList<String>();
    }
    
    /**
     * @name: getContent
     * @return: String
     * @description: 
     */
    public String getContent(){
        return this.displayContent;
    }
    
    /**
     * @name: setContent
     * @param: String Content
     * @return: void
     * @description: 
     */
    public void setContent(String Content){
        this.displayContent = Content;
    }
    
    /**
     * @name: addContent
     * @param: String Content
     * @return: void
     * @description: 
     */
    public void addContent(String Content){
        this.displayContent += Content;
    }
    
    /**
     * @name: setAdd
     * @param: String Content
     * @return: void
     * @description: 
     */
    public void setAdd(String Content){
        this.add = Content;
    }
    
    /**
     * @name: getAdd
     * @return: String
     * @description: 
     */
    public String getAdd(){
        return this.add;
    }
    
    /**
     * @name: addHistory
     * @param: String str
     * @return: void
     * @description: 
     */
    public void addHistory(String str){
        this.history.add(str);
    }
    
    /**
     * @name: showHistory
     * @return: String
     * @description: 
     */
    public String showHistory(){
        String str = "";
        for(String s : this.history){
            str += s + "\n";
        }
        return str;
    }
    
}