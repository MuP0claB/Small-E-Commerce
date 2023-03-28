package small_E_Commerce;

public class Apples implements Countable {

    private int count;
    private String name = "apple";
    private double pricePerKg = 3.60;

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

    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }
}
