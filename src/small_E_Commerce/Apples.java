package small_E_Commerce;

import java.util.HashMap;

public class Apples implements Countable {

    private int count;
    private double price = 2.0;

    public Apples() {
        this.count = 1;
    }

    @Override
    public double getPrice() {
        if (count % 3 == 0) {
            return 0;
        }
        return price;
    }

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public int getCount() {
        return count;
    }
}
