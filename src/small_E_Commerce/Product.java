package small_E_Commerce;

public class Product implements Countable {
    private String name;
    private double productPrice;

    private int count;

    public Product() {

    }

    @Override
    public double getProductPrice() {
        double price = 0;
        switch (this.name) {
            case "Apples":
                this.productPrice = 2;
                int freeApples = count / 3;
                price = (count - freeApples) * productPrice;
                return price;
            case "Pears":
                this.productPrice = 3;
                int discountQuantity = this.count / 4;
                double discountPearsPrice = discountQuantity * 1.5;
                price = (this.count - discountQuantity) * this.productPrice + discountPearsPrice;
                return price;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
