package small_E_Commerce;

//      Да се състави онлайн магазин, в който може да се закупят два вида продукти - ябълки и круши.
//      В случай, че потребителя има 2 ябълки в количката, нека се добави трета като промоция безплатно.
//      В случай, че потребителят има 3 круши в количката, следващата нека да бъде добавена на половин цена.

public class Main {

    public static void main(String[] args) {

        ShoppingBasket basket = new ShoppingBasket();
        Apples apple1 = new Apples(2);
        basket.addItem(apple1);

        Pears pear1 = new Pears(3);
        basket.addItem(pear1);

        basket.applyPromotion();
        basket.getTotalPrice();
    }
}
