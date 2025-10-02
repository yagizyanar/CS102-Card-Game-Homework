package cardgame;

import java.util.ArrayList;

// Cardgame
// author:
// date:
public class CardGame {
    // properties
    Cards fullPack;
    ArrayList<Player> players;
    ScoreCard scoreCard;
    Cards[] cardsOnTable;
    int roundNo;
    int turnOfPlayer;

    // constructors
    public CardGame(Player p1, Player p2, Player p3, Player p4) {
        fullPack = new Cards(true);

        players = new ArrayList<>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);

        scoreCard = new ScoreCard(players.size());
        cardsOnTable = new Cards[players.size()];

        int i = 0;
        Card c;
        while( (c = fullPack.getTopCard()) != null) {
            players.get(i % 4).add(c);
            i++;
        }

        roundNo = 1;
        turnOfPlayer = 0;

    }

    // methods
    public boolean playTurn(Player p, Cards c) {

        if(!isTurnOf(p)){
            return false;
        }

        int playerIndex = players.indexOf(p);
        cardsOnTable[playerIndex] = c;

        turnOfPlayer = (turnOfPlayer + 1) % players.size();

        if(turnOfPlayer == 0){
            evaluateRound();
            roundNo++;
            cardsOnTable = new Cards[players.size()];
        }

        return true;
    }

    private void evaluateRound(){
        int maxVal = -1;
        int winnerIndex = -1;

        for(int i = 0; i < cardsOnTable.length; i++){
            Cards c = cardsOnTable[i];

            if(c != null && c.getCard() > maxVal){
                maxVal = c.getCard();
                winnerIndex = i;
            }

            if(winnerIndex != -1){
                scoreCard.update(winnerIndex, 1);
            }

        }
    }

    public boolean isTurnOf(Player p) {
        return players.get(turnOfPlayer) == p;
    }

    public boolean isGameOver() {

        for(Player player : players){
            if(player.getNumberOfCards() > 0){
                return false;
            }
        }

        return true;
    }

    public int getScore(int playerNumber) {
        return scoreCard.getScore(playerNumber);
    }

    public String getName(int playerNumber) {
        return players.get(playerNumber).getName();
    }

    public int getRoundNo() {
        return roundNo;
    }

    public int getTurnOfPlayerNo() {
        return turnOfPlayer;
    }

    public Player[] getWinners() {
        int[] winnerIndexes = scoreCard.getWinners();
        Player[] winners = new Player[winnerIndexes.length];

        for(int i = 0; i < winnerIndexes.length; i++){
            winners[i] = players.get(winnerIndexes[i]);
        }

        return winners;
    }

    public String showScoreCard() {
        return scoreCard.toString();
    }
}