
/**
 * Card - a single playing card
// author:Yagiz Yanar
// date:01.10.2025
 */
public class Card
{
    final String[] SUITS = { "Hearts", "Diamonds", "Spades", "Clubs"};
    final String[] FACES = { "A", "2", "3", "4", "5",
                             "6", "7", "8", "9", "10",
                             "J", "Q", "K"};    
    final int NOOFCARDSINSUIT = 13;

    private int faceValue;
    private int suit;
    int  cardNo;
    
    
    public Card(int faceValue, int suit)
    {
        this.cardNo = faceValue + suit * NOOFCARDSINSUIT;
        this.faceValue = faceValue;
        this.suit = suit;
    }
    
    public Card( int cardNumber)
    {
        cardNo = cardNumber;
    }
    
    public int getFaceValue()
    {
        return cardNo % NOOFCARDSINSUIT;
    }
    
    public int getSuit()
    {
        return cardNo / NOOFCARDSINSUIT;
    }
    
    public String toString()
    {
        return FACES[ getFaceValue() ] + " of " + SUITS[ getSuit() ];
    }
    
    public boolean equals(Card c)
    {
        if(c == null){
            return true;
        }

        return this.getFaceValue() == c.getFaceValue() && this.getSuit() == c.getSuit();
          
    }
    
    public int compareTo(Card c)
    {
        return this.getFaceValue() - c.getFaceValue();
    }
}