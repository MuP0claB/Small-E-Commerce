package applesAndPears;

public interface Countable {

    String getLabel();

    double getYourDiscount();

    default String showInfo() {

        return """
                "ИЗБРАН ПЛОД": "%s", "ЦЕНА ТОТАЛ": "%.2f" """
                .formatted(getLabel(), getYourDiscount());
    }

    static void getInfo(Countable countable) {
        System.out.println(countable.showInfo());
    }
}
