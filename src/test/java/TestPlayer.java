import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayer {

    private Player player1;
    private Player player2;
    private Card a_card1;
    private Card a_card2;

    @Before
    public void before() {
        player1 = new Player("Ant");
        player2 = new Player("Dec");
        a_card1 = new Card(Suit.CLUBS, Rank.TWO);
        a_card2 = new Card(Suit.HEARTS, Rank.THREE);
    }

    @Test
    public void playerHasName() {
        assertEquals("Ant",player1.getName());
    }

    @Test
    public void playerCanReceiveAndShowCard() {
        player1.addCard(a_card1);
        assertEquals(a_card1,player1.card1());
    }

    @Test
    public void playerHasTwoCards() {
        player1.addCard(a_card1);
        player1.addCard(a_card2);
        String hand = (a_card1.cardInfo() + " and " + a_card2.cardInfo());
        assertEquals(hand, player1.getHand());
//        System.out.println(hand);
    }

    @Test
    public void playerCalcsHandValue() {
        player1.addCard(a_card1);
        player1.addCard(a_card2);
        assertEquals(5,player1.getHandValue());
    }

} // end class TestPlayer
