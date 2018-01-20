package basket;

import items.*;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Item> items;
    private ArrayList<String> names;

    public Basket() {
        items = new ArrayList();
        names = new ArrayList<>();
    }

    public int getCount() {
        return this.items.size();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void clearBasket(Item item) {
        this.items.clear();
    }

    public void addName(String names) {
        this.names.add(names);
    }

    public double getTotalValue() {
        double total = 0;

        for(String x: names) {

            if (x.equals("Chicken")) {
                    total += 10.0;
            } else if (x.equals("Curry Paste")) {
                    total += 1.80;
            } else if (x.equals("Naan Bread")) {
                    total += 1.75;
            } else if (x.equals("Non Brand German Lilt")) {
                    total += 0.65;
            } else if (x.equals("Pineapple")) {
                    total += 0.90;
            } else if (x.equals("Rice Cakes")) {
                    total += 1.30;
            } else if (x.equals("rice")) {
                    total += 1.00;
            } else if (x.equals("tuna")) {
                    total += 2.80;
            }

        }

            return total;
    }


}
