package applesAndPears;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("МОЛЯ, ВЪВЕДЕТЕ КИЛОГРАМИ И СИСТЕМАТА ЩЕ ИЗЧИСЛИ КРАЙНАТА ЦЕНА ЗА ВАС ->");

        List<Countable> countables = new ArrayList<>();
        countables.add(new Apples("Златна Превъзходна", 3.75));
        countables.add(new Apples("Смит", 2.90));

        countables.add(new Pears("Дива горска", 3.30));
        countables.add(new Pears("Аржентинска ДЕЛУКС", 6.90));

        for (var f : countables) {
            Countable.getInfo(f);
        }
    }
}
