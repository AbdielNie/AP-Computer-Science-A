
/**
 * Name: Lee
 * Version: 1.0
 * Description: Demonstrating Methods using Bottle and Liquid classes
 */
public class TestBottleLiquid
{
   public static void main (String [] args) {
       Liquid l1 = new Liquid("Water");
       Liquid l2 = new Liquid("Oil");
       Liquid l3 = new Liquid("Juice");
       
       Bottle myBottle = new Bottle(500,l1);
       Bottle hisBottle = new Bottle(1000,l2);
       Bottle herBottle = new Bottle(250,l3);
       
       //Passing by Value
       int sip = 30;
       System.out.println(sip);
       myBottle.drink(sip);
       System.out.println(sip);
       
       //Passing by Reference pt1
       hisBottle.exchangeContent(l1);
       System.out.println(hisBottle.getContent1());
       
       //Passing by Reference pt2
       hisBottle.getContent1().setType("Tea");
       
       //hisBottle.getContent2().setType("Juice");
       
       //ToString Method
       System.out.println(myBottle);
       System.out.println(l3);
       
   }
}
