package small_E_Commerce;

//      Да се състави онлайн магазин, в който може да се закупят два вида продукти - ябълки и круши.
//      В случай, че потребителя има 2 ябълки в количката, нека се добави трета като промоция безплатно.
//      В случай, че потребителят има 3 круши в количката, следващата нека да бъде добавена на половин цена.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShoppingBasket shoppingBasket = new ShoppingBasket();

        System.out.println("Choose product");
        Instruction.printOptions();

        int choice = scanner.nextInt();
        while (choice == 1 || choice == 2) {
            Product product = new Product();

            switch (choice) {
                case 1:
                    product.setName("Apples");
                    System.out.println("How many apples");
                    product.setCount(scanner.nextInt());
                    shoppingBasket.addProduct(product);
                    break;
                case 2:
                    product.setName("Pears");
                    System.out.println("How many pears");
                    product.setCount(scanner.nextInt());
                    shoppingBasket.addProduct(product);
                    break;
            }
            Instruction.printOptions();
            choice = scanner.nextInt();
        }
        shoppingBasket.printProducts();
        System.out.printf("You have to pay: %.2f ", shoppingBasket.getProductPrice());

    }
}
