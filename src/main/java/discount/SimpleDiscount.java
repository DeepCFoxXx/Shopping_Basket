package discount;

import basket.Item;
import java.util.ArrayList;

public class SimpleDiscount implements IDiscount {
    private double saving;
    public SimpleDiscount(double saving) {
        this.saving = saving;
    }

    public double totalDiscount(ArrayList<Item> items, double total) {
        return this.saving;
    }

}
