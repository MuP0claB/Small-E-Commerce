package small_E_Commerce;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {

    private List<Countable> items = new ArrayList<>();

    public void addItem (Countable item) {
        items.add(item);
    }

    public void removeItem (Countable item) {
        items.remove(item);
    }

    public double getTotalPrice () {
        double totalPrice = 0;

        for (Countable item : items) {
            totalPrice += item.getPrice() * item.getCount();
        }
        return totalPrice;
    }

    public void applyPromotion () {
        int appleCount = 0;
        int pearCount = 0;

        for (Countable item : items) {
            if (item.getName().equals("apple")) {
                appleCount += item.getCount();
            } else if (item.getName().equals("pear")) {
                pearCount += item.getCount();
            }
        }
        if (appleCount >= 2) {
            Apples freeApple = new Apples(1);
            items.add(freeApple);
        }
        if (pearCount >= 3) {
            for (Countable item : items) {
                if (item.getName().equals("pear")) {
          //          item.setPrice(item.getPrice() / 2);
                    break;
                }
            }
        }
    }
}
