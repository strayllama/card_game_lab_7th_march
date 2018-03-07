import java.lang.reflect.Array;
import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;

    // Constructor Method
    public Deck() {
        cards = new ArrayList<>();

        for (Suit each_suit : Suit.values()) {
            for (Rank each_rank : Rank.values()) {
                Card new_card = new Card(each_suit, each_rank);
                cards.add(new_card);

            }
        }

    } // end constructor Deck





} // end class Deck
