package patterns.creational.abstractFactory;

import patterns.creational.abstractFactory.dishes.dessert.Dessert;
import patterns.creational.abstractFactory.dishes.firstDish.FirstDish;
import patterns.creational.abstractFactory.dishes.secondDish.SecondDish;
import patterns.creational.abstractFactory.dishes.thirdDish.ThirdDish;
import patterns.creational.abstractFactory.factory.AbstractCuisineFactory;

public class Cafe {
    private final FirstDish firstDish;

    private final SecondDish secondDish;

    private final ThirdDish thirdDish;

    private final Dessert dessert;

    public Cafe(AbstractCuisineFactory cuisineFactory) {
        firstDish = cuisineFactory.createFirstDish();
        secondDish = cuisineFactory.createSecondDish();
        thirdDish = cuisineFactory.createThirdDish();
        dessert = cuisineFactory.createDessert();
    }

    public String getComplexLunch() {
        return getFirstDish() + "\n"
                + getSecondDish() + "\n"
                + getThirdDish() + "\n"
                + getDessert();
    }

    public String getDessert() {
        return dessert.getDessert();
    }

    public String getThirdDish() {
        return thirdDish.getThirdDish();
    }

    public String getSecondDish() {
        return secondDish.getSecondDish();
    }

    public String getFirstDish() {
        return firstDish.getFirstDish();
    }
}
