import java.util.HashMap;
import java.util.Map;

public class Blackjack {

    private Map<String, Integer> cards;

    public Blackjack() {
        Map<String, Integer> newCards = new HashMap<String, Integer>();
        newCards.put("two", 2);
        newCards.put("three", 3);
        newCards.put("four", 4);
        newCards.put("five", 5);
        newCards.put("six", 6);
        newCards.put("seven", 7);
        newCards.put("eight", 8);
        newCards.put("nine", 9);
        newCards.put("ten", 10);
        newCards.put("jack", 10);
        newCards.put("queen", 10);
        newCards.put("king", 10);
        newCards.put("ace", 11);

        this.cards = newCards;
    }

    public int parseCard(String card) {
        return this.cards.get(card);
    }

    public boolean isBlackjack(String card1, String card2) {
        return this.parseCard(card1) + this.parseCard(card2) == 21;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack && dealerScore < 10) {
            return "W";
        }

        if (!isBlackjack) {
            return "P";
        }

        return "S";
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        }

        if (handScore <= 11) {
            return "H";
        }

        if (dealerScore >= 7) {
            return "H";
        }

        return "S";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the
    // cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls
    // the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
