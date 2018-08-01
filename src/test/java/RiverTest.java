import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RiverTest {

    River river;
    Salmon salmon;
    @Before
    public void before(){

        river = new River();
        salmon = new Salmon();
    }

    //test it has salmon

    @Test
    public void hasSalmonEmpty(){
        assertEquals(0, river.salmonCount());
    }

    @Test
    public void getSalmon(){
        //we are first adding a fish
        river.addFish(salmon);
        //we test if a fish was added and therefore the salmon count increased
        assertEquals(1, river.salmonCount());
        //we remove one
        river.removeFish();
        //test if removed
        assertEquals(0, river.salmonCount());
    }
}
