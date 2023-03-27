package applesAndPears;

import java.util.Scanner;

public class Apples implements Countable {

    private final String name;
    private final double pricePerKg;

    public Apples(String name, double pricePerKg) {
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
        double totalPriceApples = 0;

        if (kilos <= 0 || kilos > 2) {
            System.out.println("СИСТЕМАТА ОЧАКВА ДА ВЪВЕДЕТЕ ЧИСЛО 1 ИЛИ 2 !");
        } else {
            if (kilos % 2 == 0) {
                totalPriceApples += (kilos - 1) * pricePerKg;
                System.out.println("ВИЕ ПОЛУЧАВАТЕ 2 КИЛОГРАМА ЯБЪЛКИ НА ЦЕНАТА НА 1 КИЛОГРАМ !!!");
            } else {
                totalPriceApples += kilos * pricePerKg;
                System.out.println("КРАЙНА ЦЕНА : " + totalPriceApples);
            }
        }
        return totalPriceApples;
    }

    @Override
    public String showInfo() {
        return Countable.super.showInfo() + """
                , "ПЛОД": "%s", "ЦЕНА ЗА КГ": "%.2f" """.formatted(name, pricePerKg);
    }
}
