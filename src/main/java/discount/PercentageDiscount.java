package discount;

import basket.Item;

import java.util.ArrayList;

public class PercentageDiscount implements Discount {
    private double fraction = 0.0;
    private double threshold = 0.0;

    public PercentageDiscount(double fraction, double threshold) {
        this.fraction = fraction;
        this.threshold = threshold;
    }

    public double totalDiscount(ArrayList<Item> items, double total) {
        double saving = 0;
        if(total >= threshold) {
            saving = total * fraction;
        }
        return saving;
    }

}
