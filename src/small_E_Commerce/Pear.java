package small_E_Commerce;

public class Pear implements Countable {
    private int count;
    private double price = 3.0;

    public Pear() {
        this.count = 0;
    }

    @Override
    public double getProductPrice() {
        int discountQuantity = this.count / 4;
        double discountPearsPrice = discountQuantity * 1.5;
        double price = (this.count - discountQuantity) * 3 + discountPearsPrice;
        return price;
    }

    public int incrementCount(int quantity) {
        return this.count = this.count + quantity;
    }

}
