package small_E_Commerce;

public class Pears implements Countable {

    private int count;
    private double price = 5.0;

    public Pears() {
        this.count = 1;
    }

    @Override
    public double getTotalPrice() {
        if (count % 3 == 0) {
            return price / 2;
        }
        return price;
    }
}
