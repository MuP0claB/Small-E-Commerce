package applesAndPears;

import java.util.Scanner;

public class Pears implements Countable {

    private final String name;
    private final double pricePerKg;

    public Pears(String name, double pricePerKg) {
        this.name = name;
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String getLabel() {
        return "1 КГ " + name + " СТРУВА $" + pricePerKg;
    }

    @Override
    public double getYourDiscount() {

        Scanner scanner = new Scanner(System.in);
        int kilos = scanner.nextInt();
        double totalPricePears = 0;

        if (kilos <= 0 || kilos > 2) {
            System.out.println("СИСТЕМАТА ОЧАКВА ДА ВЪВЕДЕТЕ ЧИСЛО 1 ИЛИ 2 !");
        } else {
            if (kilos % 2 == 0) {
                totalPricePears += (kilos - 1) * pricePerKg;
                System.out.println("ВИЕ ПОЛУЧАВАТЕ ВТОРИЯТ КИЛОГРАМ КРУШИ НА ПОЛОВИН ЦЕНА !!!");
            } else {
                totalPricePears += kilos * pricePerKg;
                System.out.println("КРАЙНА ЦЕНА : " + totalPricePears);
            }
        }
        return totalPricePears;
    }

    @Override
    public String showInfo() {
        return Countable.super.showInfo() + """
                , "ПЛОД": "%s", "ЦЕНА ЗА КГ": "%.2f" """.formatted(name, pricePerKg);
    }
}
