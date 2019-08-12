import java.util.*;

public class Deck
{
    private Card [] cards;
    private int numCards;
    
    public Deck() {
        numCards = 52;
        cards = new Card[this.numCards];
        for(int i = 0; i < 4; i ++){        
            for(int ii = 0; ii < 13; ii ++){
                cards[ii + 13 * i] = new Card(ii + 1, i);
            }
        } 
        /*
         * for(int i 0; i <52; i++){
         *      cards[i] = new Card(i%13+1, i/13);
         * }
         */
    }

    
    public Card peek(){
        return cards[0];
    }
    
    public Card draw(){
        numCards --;
        Card tempCard = cards[0];
        for(int i = 0; i < numCards; i++){
            cards[i] = cards[i + 1];
        }        
        return tempCard;
    }
    
    
    public String toString(){
        String ret = "";
        for(int i = 0; i < numCards; i++){
            ret += cards[i] +", \n";
            System.out.println(cards[i]);
        }        
        return ret;
    }
    
    
    /*Shuffle
     * 1.Perfect riffle/faro shuffle
     * 2.imperfect riffle/faro shuffle
     * 3.smooth shuffle
     * 4.monge shufflea
     * 5.mike shuffle
     * 6.overhand shuffle
     * 7.hindu shuffle
     */
    
    public void replaceDeck(Card[] newDeck){
        for(int i = 0; i < numCards; i++){
            this.cards[i] = newDeck[i];
        }
    }
    
    //1. Perfect riffle/faro shuffle
    public void perfectRiffleShuffle(){
         Card[] tempCard = new Card[numCards];
         for(int i = 0; i < numCards; i++){
             if(i % 2 == 0){
                 tempCard[i] = cards[i / 2];
                 //System.out.println( i + ": " + tempCard[i]);
             }else{
                 tempCard[i] = cards[numCards / 2 + i / 2];
                 //System.out.println(i + ":" + tempCard[i]);
             }
         }
         replaceDeck(tempCard);
    }
    
    //2.imperfect riffle/faro shuffle
    /*
    public void imperfectRiffleShuffle(){
        Card[] tempCard = new Card[numCards];
        Random ran = new Random();
        for(){
        }        
    }
    */

    //6.overhand shuffle
    public void overHandShuffle(){
        Card[] tempCard = new Card[numCards];
        Random r = new Random();
        int ran = r.nextInt(52);
        for(int i = 0; i < ran; i++){
            tempCard[i] = this.cards[i];    
        }
        for(int i = 0; i < numCards - ran; i++){
            this.cards[i] = this.cards[ran + i];
        }
        for(int i = 0; i < ran; i++){
            this.cards[ran + i] = tempCard[i];
        }
    }
}
