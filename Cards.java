package cardgame;
import java.util.Random;

// Cards - Maintains a collection of zero or more playing cards.
//         Provides facilities to create a full pack of 52 cards
//         and to shuffle the cards.
// author:Yagiz Yanar
// date:01.10.2025
public class Cards
{
    final int NOOFCARDSINFULLPACK = 52;
    
    // properties
    Card[] cards;
    int    valid;  // number of cards currently in collection
    
    // constructors
    public Cards( boolean fullPack)
    {
        cards = new Card[ NOOFCARDSINFULLPACK ];
        valid = 0;
        
        if ( fullPack)
            createFullPackOfCards();
    }
    
    // methods
    public Card getTopCard()
    {
        Card tmp;

        if ( valid <= 0)
            return null;
        else
        {
            valid--;
            tmp = cards[valid];
            cards[valid] = null;
            return tmp;
        }
    }

    public int getCard(){
        int cardFaceValue = 2;

        for(int i = 0; i < cards.length; i++){
            if(cards[i] != null){
                cardFaceValue = cards[i].getFaceValue();
            }
        }

        return cardFaceValue;
    }
    
    public boolean addTopCard( Card c)
    {
        if ( valid < cards.length)
        {
            cards[valid] = c;   // should this be cloned?
            valid++;
            return true;
        }
        return false;
    }
    
    private void createFullPackOfCards()
    {
        for (int i = 0; i < 4;i++){
            for (int m = 0; m < 14;m++) {
                addTopCard(new Card(m, i));
            }
        }
    }
    
    public void shuffle()
    {
        Card temp;
        int random1;
        int random2;
        Random rand = new Random();

        for (int i = 0;i < 500;i++){
            random1 = rand.nextInt(53);
            random2 = rand.nextInt(53);
            temp = cards[random1];
            cards[random1] = cards[random2];
            cards[random2] = temp;

        }
    }
    
    
    // For testOnly... remove from production version!
    public void testOnlyPrint()
    {
        for ( int i =0; i < valid; i++)
        {
            System.out.println( cards[i] );
        }
    }
    
} // end class Cards

