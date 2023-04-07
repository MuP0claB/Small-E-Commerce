package small_E_Commerce;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    public static Map<String, Double> shoppingBasket = new HashMap<>();

    public ShoppingBasket() {

    }

    public void addProduct(Apple apple) {
        shoppingBasket.put("Apples", apple.getProductPrice());
    }

    public void addProduct(Pear pear) {
        shoppingBasket.put("Pears", pear.getProductPrice());
    }

    public void printProducts() {
        shoppingBasket.entrySet().forEach(product -> System.out.println(product.getKey() + " - " + product.getValue() + " lv."));
    }

    public double getProductPrice() {
        double totalPrice = 0;
        for (double price : shoppingBasket.values()) {
            totalPrice += price;
        }
        return totalPrice;

    }
}
