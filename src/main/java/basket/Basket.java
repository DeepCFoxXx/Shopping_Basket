package basket;


import discount.Discount;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Discount>  discounts = new ArrayList<Discount>();

    public Basket() {
        items = new ArrayList();
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

    public double total() {
        double sum = 0.0;
        for (Item item : this.items) {
            sum = sum + item.getPrice();
        }
        return sum - this.totalDiscount(sum);
    }

    public void applyDiscount(Discount discount) {
     discounts.add(discount);
    }

    private double totalDiscount(double totalWithoutDiscount) {
        double savings = 0.0;
        double totalToDiscount = totalWithoutDiscount;
        for (Discount discount: this.discounts) {
            totalToDiscount = totalWithoutDiscount - savings;
            savings = savings + discount.totalDiscount(this.items, totalToDiscount);
        }
        return savings;
    }


}
