package itemTest;

import items.NaanBread;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NaanBreadTest {

    NaanBread naanBread;

    @Before
    public void before() {
        naanBread = new NaanBread("Naan Bread", 1.75);
    }

    @Test
    public void naanBreadHasName() {
        assertEquals("Naan Bread", naanBread.getName());
    }

    @Test
    public void naanBreadHasPrice() {
        assertEquals(1.75, naanBread.getPrice());
    }
}
