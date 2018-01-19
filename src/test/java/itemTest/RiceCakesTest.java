package itemTest;

import items.RiceCakes;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RiceCakesTest {

    RiceCakes riceCakes;

    @Before
    public void before() {
        riceCakes = new RiceCakes("Rice Cakes", 1.30);
    }

    @Test
    public void riceCakesHasName() {
        assertEquals("Rice Cakes", riceCakes.getName());
    }

    @Test
    public void riceCakesHasPrice() {
        assertEquals(1.30, riceCakes.getPrice());
    }
}
