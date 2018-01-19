package itemTest;

import items.NonBrandGermanLilt;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NonBrandGermanLiltTest {

    NonBrandGermanLilt nonBrandGermanLilt;

    @Before
    public void before() {
        nonBrandGermanLilt = new NonBrandGermanLilt("Non Brand German Lilt", 0.65);
    }

    @Test
    public void nonBrandGermanLiltHasName() {
        assertEquals("Non Brand German Lilt", nonBrandGermanLilt.getName());
    }

    @Test
    public void nonBrandGermanLiltHasPrice() {
        assertEquals(0.65, nonBrandGermanLilt.getPrice());
    }

}
