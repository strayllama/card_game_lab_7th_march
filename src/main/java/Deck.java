import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

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

    public int deckSize() {
        return cards.size();
    }

    public ArrayList<Card> all_cards() {
        return cards;
    }


    public Card getRandomCard() {
        Collections.shuffle(this.cards);
        return cards.get(0);
    }

} // end class Deck
