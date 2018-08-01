import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card sevenOfHearts;
    @Before
    public void before(){
        //HEART is an enum. We do not need to initialize enums.
        sevenOfHearts = new Card(SuitType.HEART, NumberType.SEVEN);
    }

    @Test
    public void hasSuit(){
        assertEquals(SuitType.HEART, sevenOfHearts.getSuit());
    }

    @Test
    public void getValue(){
        //test getting the value(rank) for the enum
        assertEquals(2, sevenOfHearts.getSuit().getValue());
    }

    @Test
    public void getDeck(){
        //test getting the value for the enum
        assertEquals(52, Card.getDeck().size());
    }
}
