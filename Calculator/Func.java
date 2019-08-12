/**
 * @name: Func
 * @author: jimschenchen
 * @date: Jan.2nd 2018
 * @description: 
 */

/**
 *
 * @author jimschenchen
 */
public class Func extends Operation{
        /**
         * @name: squareRoot
         * @param: String str
         * @return: String
         * @description: 
         */
        public static String squareRoot(String str){
        while(getIndexOfFuncSign(str) != -1){ //the sign exist
            int index = getIndexOfFuncSign(str);
            double operatedNum;
            
            //calculate the number
            switch (str.charAt(index)) {
                case '^':
                    operatedNum = Math.pow(getFrontNum(str, index), getLastNum(str, index));
                    break;
                case '√':
                    operatedNum = Math.pow(getLastNum(str, index), 1/getFrontNum(str, index));
                    break;
                default:
                    operatedNum = 0;
                    //System.out.println("error:");
                    //skip
                    break;
            }
            
            String operatedNum0 = extendsDoulbe(operatedNum);
            
            //add the operatedNum in the original 
            System.out.println(str);
            System.out.println(str.substring(getLastIndex(str, index) + 1, str.length()));
            System.out.println(getLastIndex(str, index));
            String newStr = str.substring(0, getFrontIndex(str, index)) + operatedNum0 + str.substring(getLastIndex(str, index) + 1, str.length());
            //give the string
            str = newStr;
        }
        return str;
    }
        
     /**
      * @name: mutiplicityDivision
      * @param: String str
      * @return: String
      * @description: 
      */
     public static String mutiplicityDivision(String str){
        while(getIndexOfMDSign(str) != -1){ //the sign exist
            int index = getIndexOfMDSign(str);
            double operatedNum;
            //calculate the number
            switch (str.charAt(index)) {
                case '×':
                    operatedNum = getFrontNum(str, index) * getLastNum(str, index);
                    break;
            //add the operatedNum in the original
                case '÷':
                    operatedNum = getFrontNum(str, index) / getLastNum(str, index);
                    break;
                default:
                    operatedNum = 0;
                    System.out.println("error: Func.mutiplicityDivision");
                    //skip
                    break;
            }
            
            String operatedNum0 = extendsDoulbe(operatedNum);
            
            String newStr = str.substring(0, getFrontIndex(str, index)) + operatedNum0 + str.substring(getLastIndex(str, index) + 1, str.length());
            //give the string
            str = newStr;
        }
        return str;
    }
     
    /**
     * @name: additionSubtraction
     * @param: String str
     * @return: String
     * @description: 
     */
    public static String additionSubtraction(String str){
        while(getIndexOfASSign(str) != -1){ //the sign exist
            int index = getIndexOfASSign(str);
            double operatedNum;
            
            //calculate the number
            switch (str.charAt(index)) {
                case '+':
                    operatedNum = getFrontNum(str, index) + getLastNum(str, index);
                    break;
                case '-':
                    operatedNum = getFrontNum(str, index) - getLastNum(str, index);
                    break;
                default:
                    operatedNum = 0;
                    System.out.println("error: Func.additionSubtraction");
                    //skip
                    break;
            }
            
            String operatedNum0 = extendsDoulbe(operatedNum);
            
            //add the operatedNum in the original 
            String newStr = str.substring(0, getFrontIndex(str, index)) + operatedNum0 + str.substring(getLastIndex(str, index) + 1, str.length());
            
            //give the string
            str = newStr;
        }
        return str;
    }
    
}