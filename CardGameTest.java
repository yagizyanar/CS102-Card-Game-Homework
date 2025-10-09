import java.util.Scanner;
import cardgame.*;

// CardGameTest
// author: Serhat Mutlu
// date: 10/09/2025
public class CardGameTest
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in);
        
        System.out.println( "Start of CardGameTest\n");

        System.out.print("Enter the first player's name: ");
        String player1 = scan.nextLine();

        System.out.print("Enter the second player's name: ");
        String player2 = scan.nextLine();

        System.out.print("Enter the third player's name: ");
        String player3 = scan.nextLine();

        System.out.print("Enter the fourth player's name: ");
        String player4 = scan.nextLine();
        
        // CONSTANTS
        
        // VARIABLES
        Card       c;
        Cards      cards;
        ScoreCard  scores;
        Player     p1 = new Player(player1);
        Player     p2 = new Player(player2);
        Player     p3 = new Player(player3);
        Player     p4 = new Player(player4);
        CardGame   game = new CardGame(p1, p2, p3, p4);
        
        
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
        System.out.println(p1.getName());
        System.out.println();
        System.out.printf("Number of cards in hand is : %d",p1.getNumberOfCards());
        System.out.println();
        
        // test CardGame class too?
        
        System.out.printf("\nThe score of player3 is: %d",game.getScore(3));
        System.out.println();
        System.out.printf("The name of player2 is: %s",game.getName(2));
        System.out.println();
        System.out.println(game.showScoreCard());
        System.out.println();


        
        // Once you have all the bits working, complete the MyCardGame program
        // that provides a menu allowing any of the players to play their card,
        // an option to see the score card, and one to quit the game at any time.
        // When the game is over it should print out the winners.
        
        System.out.println( "\nEnd of CardGameTest\n" );
        scan.close();
    }
    
    
} // end of class CardGameTest
