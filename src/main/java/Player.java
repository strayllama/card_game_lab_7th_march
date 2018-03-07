import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private int score;

    public Player(String a_name) {
        this.name = a_name;
        this.hand = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }


    public void addCard(Card a_card) {
        this.hand.add(a_card);
    }


    public Card card1() {
        return this.hand.get(0);
    }

    public Card card2() {
        return this.hand.get(1);
    }


    public int getHandValue() {
        int handValue = 0;
        handValue = (card1().getValue()) + (card2().getValue());
        return handValue;
    }

    public String getHand() {
        return (card1().cardInfo() + " and " + card2().cardInfo());
    }


} // end class Player
