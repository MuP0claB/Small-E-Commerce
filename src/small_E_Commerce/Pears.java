package small_E_Commerce;

public class Pears implements Countable {

    private int count;
    private double price = 3.0;

    public Pears() {
        this.count = 1;
    }

    @Override
    public double getPrice() {
        if (count % 3 == 0) {
            return price / 2;
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
