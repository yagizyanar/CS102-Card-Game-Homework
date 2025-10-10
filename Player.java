

// Player - Simple card game player with name and hand of cards
// author: Elshan Iskandarli
// date: 10.10.2025

public class Player {
    // properties
    private String name;
    private Cards hand;

    // constructors
    public Player(String name) {
        this.name = name;
        this.hand = new Cards(false);
    }

    // methods
    public String getName() {
        return name;
    }

    public void add(Card c) {
        hand.addTopCard(c);
    }

    public Card playCard() {
        return hand.getTopCard();
    }

    public int getNumberOfCards() {
        return hand.getValid();
    }

    public void showHand() {
        hand.testOnlyPrint();
    }

    public Cards getHand() {
        return hand;
    }

    

} // end class Player
