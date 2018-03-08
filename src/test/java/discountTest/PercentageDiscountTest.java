package discountTest;

import basket.Item;
import discount.PercentageDiscount;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class PercentageDiscountTest {

    @Test public void percentageTotal() {
        PercentageDiscount tenPercentDiscount = new PercentageDiscount(0.1, 0.0);
        assertEquals( 10.0, tenPercentDiscount.totalDiscount(new ArrayList<Item>(), 100), 0.001);
    }

    @Test public void noDiscountBelowThreshold() {
        PercentageDiscount tenPercentDiscount = new PercentageDiscount(0.1, 100.00);
        assertEquals(0.0, tenPercentDiscount.totalDiscount(new ArrayList<Item>(),50), 0.001);
    }
}
