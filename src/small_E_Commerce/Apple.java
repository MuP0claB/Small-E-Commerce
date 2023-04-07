package small_E_Commerce;

public class Apple implements Countable {
    private double price = 2.0;
    private int count;

    public Apple() {
        this.count = 0;
    }

    @Override
    public double getProductPrice() {
        int freeApples = count / 3;
        price = (count - freeApples) * 2;
        return price;
    }

    public int incrementCount(int quantity) {
        return this.count = this.count + quantity;
    }
}
