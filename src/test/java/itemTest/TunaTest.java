package itemTest;

import items.Tuna;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TunaTest {

    Tuna tuna;

    @Before
    public void before() {
        tuna = new Tuna("Tuna", 2.80);
    }

    @Test
    public void tunaHasName() {
        assertEquals("Tuna", tuna.getName());
    }

    @Test
    public void tunaHasPrice() {
        assertEquals(2.80, tuna.getPrice());
    }

}
