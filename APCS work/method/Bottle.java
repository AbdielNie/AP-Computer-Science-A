
/**
 * Name: Lee
 * Version: 1.0
 * Description: Water Bottle Class
 */
public class Bottle extends TestBottleLiquid
{
    //Attributes
    private boolean isOpen;
    private int volume;
    private Liquid content;
    private static final int MAX_VOLUME = 500;
    
    public Bottle (int inVolume, Liquid inContent) {
        volume = inVolume;
        content = inContent;
        isOpen = false;
    }
    
    public void open() {
        isOpen = true;
    }
    
    public void drink(int sipVolume) {
        int finalVolume = volume - sipVolume;
        sipVolume = finalVolume;
        volume = finalVolume;
    }
    
    public void exchangeContent(Liquid newContent) {
        //System.out.println(finalVolume);
        String tempContent = newContent.getType();
        newContent.setType(content.getType());
        content.setType(tempContent);
    }
    
    public static boolean isValidBottle(Bottle test) {
        return test.getVolume() < MAX_VOLUME;
    }
    
    public boolean getIsOpen() {
        return isOpen;
    }
    public int getVolume() {
        return volume;
    }
    public Liquid getContent1() {
        return content;
    }
    public String getContent2() {
        return content.getType();
    }
}
