/**
 * @name: Operation
 * @author: jimschenchen
 * @date: Jan.2nd 2018
 * @description:   To change this license header, choose License Headers in Project Properties.
 *                  To change this template file, choose Tools | Templates
 *                  and open the template in the editor.
 */

public class Operation{
    
    /**
     * @name: display
     * @param: javax.swing.JTextField jText, Database db, String value
     * @return: void
     * @description: 
     */
    public static void display(javax.swing.JTextField jText, Database db, String value){
        db.addContent(value);
        jText.setText(db.getContent());
    } 

    /**
     * @name: refresh
     * @param: javax.swing.JTextField jText, Database db
     * @return: void
     * @description: =
     */
    public static void refresh(javax.swing.JTextField jText, Database db){
        jText.setText(db.getContent());
    } 

    /**
     * @name: clean
     * @param: javax.swing.JTextField jText, Database db
     * @return: void
     * @description: AC
     */
    public static void clean(javax.swing.JTextField jText, Database db){
        //database set empty but show it is 0
        db.setContent("");
        jText.setText("0");
    }

    /**
     * @name: del
     * @param: javax.swing.JTextField jText, Database db
     * @return: void
     * @description: Del
     */
    public static void del(javax.swing.JTextField jText, Database db){
        if(db.getContent().length() == 1 || db.getContent().length() == 0){
            //if it is empty, set 0
            db.setContent("");
            jText.setText("0");
        }else{
            db.setContent(db.getContent().substring(0, db.getContent().length() - 1));
            jText.setText(db.getContent());
        }
    }
    
    /**
     * @name: operation
     * @param: Database db
     * @return: void
     * @description: 
     */
    public static void operation(Database db){
        //get the identity from database
        String str = db.getContent();
        //optimization
        str = optimization(str);
        //calculate it
        str = calculate(str);
        //return the answer to db
        db.setContent(str);
    }
    
    /**
     * @name: operation
     * @param: String str
     * @return: String
     * @description: 
     */
    public static String operation(String str){
        //optimization
        str = optimization(str);
        //calculate it
        str = calculate(str);
        //return the answer to db
        return str;
    }
    
    /**
     * @name: calculate
     * @param: String str
     * @return: String
     * @description: methods below is to help operation to operate
     */
    public static String calculate(String str){
        while(checkBracket(str) == true){
            int openingIndex = -1;
            int closingIndex = -1;
            String calculateStr = "";
            //get the index of"("and")"
            for(int oi = str.length() - 1; oi >= 0; oi--){
                if(str.charAt(oi) == '('){
                    openingIndex = oi;
                    for(int ci = oi;ci < str.length(); ci ++){
                        if(str.charAt(ci) == ')'){
                            closingIndex = ci;
                            break;
                        }
                    }
                    if(closingIndex == -1){
                        closingIndex = str.length() - 1;    //if no closing bracket, the index set as the last index
                        break;
                    }
                }
            }
            //get the string in ()
            calculateStr = str.substring(openingIndex + 1, closingIndex);
            
           //operation
           //Put the operation in oreder

            calculateStr = calculateOrder(calculateStr);
            
            //delete the calculated identity and put answer in
            str = str.substring(0, openingIndex) + calculateStr + str.substring(closingIndex + 1, str.length());
        }
        //operate the identiry withour bracket
        

        str = calculateOrder(str);
        
        //return the string
        return str;
    }
    
    /**
     * @name: calculateOrder
     * @param: String str
     * @return: String
     * @description: 
     */
    public static String calculateOrder(String str){
            try{
                str = Func.squareRoot(str);
                str = Func.mutiplicityDivision(str);
                str = Func.additionSubtraction(str);
            }catch(Exception e){
                str = "error";
            }
            return str;
    }

    /**
     * @name: checkBracket
     * @param: String str
     * @return: boolean
     * @description: check whether the ( exist
     */
    public static boolean checkBracket(String str){
        for(int i = 0; i < str.length(); i ++){
            if(str.charAt(i) == '('){ 
                return true;
            }
        }
        return false;
    }
    
    /*
    *   @operation func
    */
   
    
    /**
     * @name: extendsDoulbe
     * @param: double ori
     * @return: String
     * @description: to deal the double with long length that it with display with E
     */
    public static String extendsDoulbe(double ori){
        double d = ori;
        
        /*
        *   #.#### ti change to the decial digit
        */
        
        return (new java.text.DecimalFormat("#.##########").format(d));
    }
   
    /**
     * @name: getIndexOfASSign
     * @param: String str
     * @return: int
     * @description: description: to return the index of sign in the String
     *              it does not need to judge the +/- sign
     */
    public static int getIndexOfASSign(String str){
        for(int i = 0; i < str.length(); i ++){
            if(str.charAt(i) == '+'){
                return i;
            }else if(str.charAt(i) == '-'){
                if(i == 0){
                    return -1;
                }else if(checkSign(str, i - 1) == -1){
                    return i;
                }
            }
        }
        return -1;
    }
    
    /**
     * @name: getIndexOfMDSign
     * @param: String str
     * @return: int
     * @description: 
     */
    public static int getIndexOfMDSign(String str){
        for(int i = 0; i < str.length(); i ++){
            if(str.charAt(i) == '×' || str.charAt(i) == '÷'){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * @name: getIndexOfFuncSign
     * @param: String str
     * @return: int
     * @description: 
     */
    public static int getIndexOfFuncSign(String str){
        for(int i = 0; i < str.length(); i ++){
            if(str.charAt(i) == '^'){
                return i;
            }else if(str.charAt(i) == '√'){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * @name: checkSign
     * @param: String str, int i
     * @return: int
     * @description: warn:need to check is negative sign or not
     */
    public static int checkSign(String str, int i){
        if(str.charAt(i) == '×' || str.charAt(i) == '÷' || str.charAt(i) == '+' || str.charAt(i) == '-'){  
            return i;
        }
        return -1;
    }
    
    /**
     * @name: getFrontNum
     * @param: String str, int indexOfSign
     * @return: double
     * @description:  to get the front and last number between the operation sign
    *   include the negative sign   eg: +-12*14 it will get -12
    *   my soul was suffered by this 0_0
     */
    public static double getFrontNum(String str, int indexOfSign){
        String number = "";
        for(int i = indexOfSign - 1; i >= 0; i --){
            if(i != 0){  //if it not index 0 
                if(checkSign(str, i) != -1){ //if it is a sign
                    if(checkSign(str, i - 1) != -1){    //check it is a negative sign or not
                        //it is negative sign   so i is negative sign and i - 1 is operation sign   eg. +-9, ×-1
                        for(int ii = i; ii < indexOfSign; ii ++){
                            number += str.charAt(ii);
                        }
                        break;
                    }else{
                        //it is not negative sign  so i is operation sign 
                        for(int ii = i + 1; ii < indexOfSign; ii ++){
                            number += str.charAt(ii);
                        }
                        break;
                    }
                }else{
                    //if it is not a sign and not index0, skip
                }
            }else{
                //if it is index 0 
                for(int ii = i; ii < indexOfSign; ii ++){   // i = 0    eg:123, +123, -123
                        number += str.charAt(ii);
                }
                break;
            }  
        }
        return stringToDouble(number);
    }
    
    /**
     * @name: getLastNum
     * @param: String str, int indexOfSign
     * @return: double
     * @description: 
     */
    public static double getLastNum(String str, int indexOfSign){
        String number = "" + str.charAt(indexOfSign + 1);   //due to the reason the code below "i = indexOfSign + 2", so add the last first num first
        for(int i = indexOfSign + 2; i < str.length(); i ++){   //the reason why it +2 because to ignore the +/-sign
            if(checkSign(str, i) != -1){
                //it is sign    so stop
                break;
            }else{
                number += str.charAt(i);
            }
        }
        return stringToDouble(number);
    }

    /**
     * @name: getFrontIndex
     * @param: String str, int indexOfSign
     * @return: int
     * @description: return the index of operated number    12+78*12    the index of sign is 5(*) so return front:3 (7) and last:4  (8)
     */
    public static int getFrontIndex(String str, int indexOfSign){
            for(int i = indexOfSign - 1; i >= 0; i --){
            if(i != 0){  //if it not index 0 
                if(checkSign(str, i) != -1){ //if it is a sign
                    if(checkSign(str, i - 1) != -1){    //check it is a negative sign or not
                        //it is negative sign   so i is negative sign and i - 1 is operation sign   eg. +-9, ×-1
                        return i;
                    }else{
                        //it is not negative sign  so i is operation sign 
                       return i + 1;
                    }
                }else{
                    //if it is not a sign and not index0, skip
                }
            }else{
                //if it is index 0 
               return 0 ;
            }  
        }
        System.out.println("error: Operation.getFrontIndex()");
        return -1;
    }
    
    /**
     * @name: getLastIndex
     * @param: String str, int indexOfSign
     * @return: int
     * @description: 
     */
    public static int getLastIndex(String str, int indexOfSign){
        for(int i = indexOfSign + 1; i < str.length(); i ++){
                if(checkSign(str, i) != -1){ //if it is a sign
                    if(checkSign(str, i + 1) != -1){    //check it is a negative sign or not
                        //it is negative sign   so i is negative sign and i - 1 is operation sign   eg. +-9, ×-1
                    }else{
                        //it is not negative sign  so i is operation sign 
                       return i - 1;
                    }
                }else{
                    //if it is not a sign and not index0, skip
                }

        }
        return str.length() - 1;  //if there is no sign return the last index
    }

    /**
     * @name: stringToDouble
     * @param: String str
     * @return: double
     * @description: convert string to double
     */
    public static double stringToDouble(String str){
        return Double.valueOf(str);
    }
    /**
     * @name: optimization
     * @param: String str
     * @return: String
     * @description: 
     */
    public static String optimization(String str){                    
        str = str.replaceAll("x", "×");
        str = str.replaceAll("\\*", "×");
        str = str.replaceAll("\\/", "÷");
        str = str.replaceAll("\\ ", "");
        str = str.replaceAll("%", "×0.01");
        str = eliminateEuqal(str);

        
        return str;
    }    
    
    /**
     * @name: eliminateEuqal
     * @param: String str
     * @return: String
     * @description: 
     */
    public static String eliminateEuqal(String str){
        int index = -1;
        for(int i = 0; i < str.length(); i ++){
            if(str.charAt(i) == '='){
                index = i;
                 break;
            }
        }
        if(index != -1){
            str = str.substring(0, index);
        }
        return str;
    }
  
}