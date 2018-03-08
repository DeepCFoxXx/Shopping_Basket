package discount;

import java.util.ArrayList;
import basket.*;

public interface IDiscount {
    double totalDiscount(ArrayList<Item> items, double total);
}
