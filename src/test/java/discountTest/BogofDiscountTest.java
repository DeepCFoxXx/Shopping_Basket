package discountTest;

import basket.Item;
import discount.BogofDiscount;
import discount.Discount;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class BogofDiscountTest {

    @Test public void zeroGivenIfNoBogof() {
        Discount bogof = new BogofDiscount();
        ArrayList<Item> items = new ArrayList<Item>();
        assertEquals(0.0, bogof.totalDiscount(items, 0.0), 0.001);
    }

}
