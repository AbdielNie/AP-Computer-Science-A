
/**
 * Write a description of class Television here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Television
{
    //Attribute
    private int channel;
    private int volumeLevel;
    private boolean on;
    
    //Constructive
    public Television(){
        channel = -1;
        volumeLevel = -1;
        on = false;
    }

    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void setChannel(int newChannel){
        channel = newChannel;
    }
    public void setVolume(int newVolumeLevel){
        volumeLevel = newVolumeLevel;
    }
    public void channelUp(){
        channel++;
    }
    public void channelDown(){
        channel--;
    }
    public int getChannel(){
        return channel;
    }
    public int getVolumeLevel(){
        return volumeLevel;
    }
    public boolean getOn(){
        return on;
    }
    
    public void test(){
        System.out.println(on + " " +channel + " " + volumeLevel);
    }
    
}
