import java.util.Scanner;


// CardGameTest
// author: Serhat Mutlu
// date: 10/09/2025
public class CardGameTest
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in);
        
        System.out.println( "Start of CardGameTest\n");
        
        // CONSTANTS
        
        // VARIABLES
        Card       c;
        Cards      cards;
        ScoreCard  scores;
        Player     p1;
        Player     p2;
        Player     p3;
        Player     p4;
        CardGame   game;
        
        // PROGRAM CODE
        
        // test Card class
        c = new Card( 0);
        System.out.println( c);
        System.out.println();
        
        // test Cards class
        cards = new Cards( true);
        cards.addTopCard( c);
        cards.testOnlyPrint();  // remove method after testing!
        
        // test ScoreCard class
        scores = new ScoreCard( 4);
        scores.update( 3, 1);
        scores.update( 1, 2);
        System.out.println( "\n" + scores );
        
        // test Player class
        p1 = new Player("player1");
        p2 = new Player("player2");
        p3 = new Player("player3");
        p4 = new Player("player4");
        System.out.println(p1.getName());
        System.out.println();
        System.out.printf("Number of cards in hand is : %d",p1.getNumberOfCards());
        System.out.println();
        
        // test CardGame class too?
        game= new CardGame(p1, p2, p3, p4);
        System.out.print("The score of player3 is: " + game.getScore(2));
        System.out.println();
        System.out.print("The name of player2 is: "+ game.getName(1));
        System.out.println();
        System.out.println(game.showScoreCard());
        System.out.println();


        
        // Once you have all the bits working, complete the MyCardGame program
        // that provides a menu allowing any of the players to play their card,
        // an option to see the score card, and one to quit the game at any time.
        // When the game is over it should print out the winners.
        
        System.out.println( "\nEnd of CardGameTest\n" );
    }
    
} // end of class CardGameTest
