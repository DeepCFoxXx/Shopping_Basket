package itemTest;

import items.Chicken;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ChickenTest {

    Chicken chicken;

    @Before
    public void before() {
        chicken = new Chicken("Chicken", 10.0);
    }

    @Test
    public void chickenHasName() {
        assertEquals("Chicken", chicken.getName());
    }
}
