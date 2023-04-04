package small_E_Commerce;

public class Apples implements Countable {

    private int count;
    private double price = 3.0;

    public Apples() {
        this.count = 1;
    }

    @Override
    public double getTotalPrice() {
        if (count % 3 == 0) {
            return 0;
        }
        return price;
    }
}
