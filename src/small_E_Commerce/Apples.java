package small_E_Commerce;

public class Apples implements Countable {

    private int count;
    private String name = "apple";
    private double pricePerKg = 3.00;

    public Apples(int count) {
        this.count = count;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return pricePerKg;
    }

    @Override
    public void setPrice(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }
}
