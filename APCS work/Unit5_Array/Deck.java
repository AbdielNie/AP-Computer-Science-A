
public class Deck
{
    private Card [] cards;
    private int numCards;

    public Deck() 
    {
        this.numCards = 52;
        cards = new Card[this.numCards];

        //creat One by one
        /*
        Card card1 = new Card (1,Card.SUIT_NAMES[0]);
        cards[0] = card1;
         */
        //Loop 52 times and create a card and initialize
        //loop 4 times first
        // loop 13   
        //if loop1 == 1 then suit = 0
        /*
        int i;
        int j;
        int index = 0;
        for (i = 0; i < 4; i++)
        {
        for(j = 1; j <= 13; i++)
        {
        cards [index] = new Card(j,Card.SUIT_NAMES[i]);
        index++;
        }

        }
         */

        int i;
        int j;
        int index = 0;
        for (i = 0; i < 4; i++)
        {
            for(j = 0; j < 13; i++)
            {
                cards [j*13 +j] = new Card(j+1,Card.SUIT_NAMES[i]);
                index++;
            }

        }

    }

    /**
     * Method: peek
     * description:look at the top card of the deck
     * return the card at the top of the deck
     */
    public Card peek()
    {
        return cards[0];
    }
   
    /**
     * shuffles:
     * 1.perfect riffle/faro shuffle
     * 2.imperfect Riffle/Faro shuffle
     * 3.smoosh shufflie
     * 4.monge shuffle
     * 5.milk shuffle
     * 6.overhand shuffle
     * 7.Hindu shuffle
     */

    /**
     * Method: toString
     * description : shows each card, separated by commas
     * return the current cards
     */
    public String toString()
    {
        String retValue = "The current cards are: \n";
        for (int i = 0; i < numCards; i++)
        {
            retValue += cards[i] + ". ";
        }
        return retValue;
    }
}
