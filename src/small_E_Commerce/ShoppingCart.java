package small_E_Commerce;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
        private List<Countable> items;

        public ShoppingCart() {
            items = new ArrayList<>();
        }

        public void addItem(Countable item) {
            items.add(item);
        }

        public double getTotalPrice() {
            double totalPrice = 0;
            for (Countable item : items) {
                totalPrice += item.getTotalPrice();
            }
            return totalPrice;
        }

        public int getTotalCount() {
            int totalCount = 0;
            for (Countable item : items) {
                totalCount += item.getCount();
            }
            return totalCount;
        }
    }