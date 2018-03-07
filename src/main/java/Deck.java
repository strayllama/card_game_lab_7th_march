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

    public Card[] getDealtCards(int numberOfCards) {
        Card[] dealtCards = new Card[numberOfCards];

        Collections.shuffle(this.cards);

        for (int i = 0 ; i < (numberOfCards); i++) {
            dealtCards[i] = cards.get(i);
        }

        return dealtCards;
    }


} // end class Deck
