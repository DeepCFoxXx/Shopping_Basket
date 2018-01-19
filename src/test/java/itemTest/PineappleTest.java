package itemTest;

import items.Pineapple;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PineappleTest {

    Pineapple pineapple;

    @Before
    public void before() {
        pineapple = new Pineapple("Pineapple", 0.90);
    }

    @Test
    public void pineappleHasName() {
        assertEquals("Pineapple", pineapple.getName());
    }

    @Test
    public void pineappleHasPrice() {
        assertEquals(0.90, pineapple.getPrice());
    }

}
