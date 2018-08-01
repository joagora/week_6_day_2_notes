import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    Bear bear;
    Salmon salmon;
    River river;
    @Before
    public void before(){
        bear = new Bear("Yogi");
        salmon = new Salmon();
        river = new River();

        river.addFish(salmon);
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eatFish(salmon);
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void shouldEmptyBellyAfterSleeping(){
        //eat a salmon
        bear.eatFish(salmon);
        //check the belly size 1
        assertEquals(1, bear.foodCount());
        //sleep
        bear.sleep();
        //Check belly size 0
        assertEquals(0, bear.foodCount());
    }

    //test if bear eats salmon and there is one less fish in the river
    @Test
    public void shouldEatFishFromRiver(){
        bear.eatFishFromRiver(river);
        assertEquals(1, bear.foodCount());

    }
}
