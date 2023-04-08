package small_E_Commerce;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    public static Map<String, Double> shoppingBasket = new HashMap<>();

    public ShoppingBasket() {

    }
    public void addProduct(Product product) {
        if (shoppingBasket.containsKey(product.getName())) {
            double newPrice = shoppingBasket.get(product.getName()) + product.getProductPrice();
            shoppingBasket.put(product.getName(), newPrice);

        } else{
            shoppingBasket.put(product.getName(), product.getProductPrice());
        }
    }
    public void printProducts() {
        shoppingBasket.entrySet().forEach(product -> System.out.printf("%s - %.2f  lv.\n", product.getKey(), product.getValue()));
    }

    public double getProductPrice() {
        double totalPrice = 0;
        for (double price : shoppingBasket.values()) {
            totalPrice += price;
        }
        return totalPrice;

    }
}
