package patterns.structural.bridge;

import patterns.structural.bridge.cuisine.Cuisine;
import patterns.structural.bridge.dish.impl.Dessert;
import patterns.structural.bridge.dish.impl.FirstDish;
import patterns.structural.bridge.dish.impl.SecondDish;
import patterns.structural.bridge.dish.impl.ThirdDish;

public class Cafe {
    private final FirstDish firstDish;
    private final SecondDish secondDish;
    private final ThirdDish thirdDish;
    private final Dessert dessert;

    public Cafe(Cuisine cuisine) {
        firstDish = new FirstDish(cuisine);
        secondDish = new SecondDish(cuisine);
        thirdDish = new ThirdDish(cuisine);
        dessert = new Dessert(cuisine);
    }

    public String getFirstDish() {
        return firstDish.getDish();
    }

    public String getSecondDish() {
        return secondDish.getDish();
    }

    public String getThirdDish() {
        return thirdDish.getDish();
    }

    public String getDessert() {
        return dessert.getDish();
    }

    public String getComplexLunch() {
        return getFirstDish() + "\n"
                + getSecondDish() + "\n"
                + getThirdDish() + "\n"
                + getDessert();
    }
}
