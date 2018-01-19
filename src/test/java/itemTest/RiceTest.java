package itemTest;

import items.Rice;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RiceTest {

    Rice rice;

    @Before
    public void before() {
        rice = new Rice("Rice", 1.00);
    }

    @Test
    public void riceHasName() {
        assertEquals("Rice", rice.getName());
    }

    @Test
    public void riceHasPrice() {
        assertEquals(1.00, rice.getPrice());
    }

}
