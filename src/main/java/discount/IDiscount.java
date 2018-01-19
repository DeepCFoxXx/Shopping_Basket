package discount;

import java.util.ArrayList;
import basket.*;

public interface IDiscount {

    double applyDiscount(ArrayList<Item> items, double total);

}
