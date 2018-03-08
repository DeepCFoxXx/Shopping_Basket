package discount;

import java.util.ArrayList;
import basket.*;

public interface Discount {
    double totalDiscount(ArrayList<Item> items, double total);
}
