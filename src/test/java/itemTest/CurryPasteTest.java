package itemTest;

import items.CurryPaste;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CurryPasteTest {

    CurryPaste curryPaste;

    @Before
    public void before() {
        curryPaste = new CurryPaste("Curry Paste", 1.80);
    }

    @Test
    public void curryPasteHasName() {
        assertEquals("Curry Paste", curryPaste.getName());
    }

    @Test
    public void curryPasteHasPrice() {
        assertEquals(1.80, curryPaste.getPrice());
    }
}
