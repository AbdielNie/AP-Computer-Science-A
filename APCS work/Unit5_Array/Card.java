
public class Card
{
   private int value;
   private String suit;
   public static final String [] SUIT_NAMES = {"Diamonds","Clubs","Hearts","Spades"};
   private static final String [] CARD_NAMES = {"Ace","1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
   public Card(int value, String suit) {
       this.value = value;
       this.suit = suit;
   }
   
   public int getValue() {
       return this.value;
   }
   public String getSuit() {
       return this.suit;
   }
   public String toString() {
       return CARD_NAMES[this.value-1] + " of " + this.suit;
       
   }
}
