package small_E_Commerce;

import java.util.Scanner;

public class Pears implements Countable {

    private int count;
    private String name = "pear";
    private double pricePerKg = 6.90;

    public Pears(int count) {
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
