
/**
 * Name: Lee
 * Version: 1.0
 * Description: Class for liquids
 */
public class Liquid
{
    //Attributes
    private String type;
    
    //Constructor
    public Liquid(String type) {
        this.type = type;
    }
    
    /**
     * Method: setType
     * Input: String type - type of liquid to be stored
     * Output: none
     * Description: changes the type of the liquid in the bottle
     */
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return this.type;
    }
    
    public String toString() {
        return "This liquid is a " + this.getType();
    }
}
