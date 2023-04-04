package small_E_Commerce;

//      Да се състави онлайн магазин, в който може да се закупят два вида продукти - ябълки и круши.
//      В случай, че потребителя има 2 ябълки в количката, нека се добави трета като промоция безплатно.
//      В случай, че потребителят има 3 круши в количката, следващата нека да бъде добавена на половин цена.

public class Main {

    public static void main(String[] args) {

        ShoppingCart basket = new ShoppingCart();
        basket.addItem(new Apples());
        basket.addItem(new Apples());
        basket.addItem(new Apples()); // третата ябълка е безплатна
        basket.addItem(new Pears());
        basket.addItem(new Pears());
        basket.addItem(new Pears());
        basket.addItem(new Pears()); // следващата круша е на половин цена
        System.out.println("Total price: " + basket.getTotalPrice());
        System.out.println("Total count: " + basket.getTotalCount());
    }
}
