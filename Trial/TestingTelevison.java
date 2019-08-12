
/**
 * Write a description of class TestingTelevison here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestingTelevison
{
    public static void main(String[] args){
        Television tel = new Television();
        tel.setChannel(120);
        tel.turnOn();
        tel.setVolume(100);
        System.out.println(tel.getChannel() + "\n" + tel.getVolumeLevel() + "\n" + tel.getOn() + "\n----------");
        tel.channelUp();
        tel.turnOff();
        tel.setVolume(250);
        tel.test();    
    }

}
