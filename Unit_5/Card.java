
public class Card
{
   private int value;
   private int suit;
   private static final String [] SUIT_NAMES = {"♦Diamonds", "♣Clubs", "❤Heart", "♠Spades"};
   private static final String [] CARD_NAMES = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
   public Card(int value,int suit) {
       this.value = value;
       this.suit = suit;
   }
   
   public int getValue() {
       return this.value;
   }
   public String getSuit() {
       return SUIT_NAMES[suit];
   }
   public String toString() {
       return CARD_NAMES[this.value-1] + " of " + SUIT_NAMES[suit];
   }
}
