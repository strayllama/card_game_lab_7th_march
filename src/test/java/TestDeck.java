import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestDeck {

    //Deck deck;
    private ArrayList<Card> test_deck;

    @Before
    public void before(){
        test_deck = new ArrayList<>();
    }

    @Test
    public void canMakeDeck() {

        for (Suit each_suit : Suit.values()) {
            for (Rank each_rank : Rank.values()) {
//                System.out.println("Each Suit: " + each_suit);
//                System.out.println("Each Rank: " + each_rank);
//                System.out.println("");
                Card new_card = new Card(each_suit, each_rank);
                test_deck.add(new_card);

            }
        }

        System.out.println("Deck array: " + test_deck);
    }

} // end class TestDeck
