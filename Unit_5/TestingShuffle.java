
/**
 * Write a description of class TestingShuffle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestingShuffle
{
    public static void main(String[] args){
        Deck d = new Deck();
        d.toString();
        System.out.println("-------------");
        //d.perfectRiffleShuffle();
        d.overHandShuffle();
        d.toString();
        
    }
}
