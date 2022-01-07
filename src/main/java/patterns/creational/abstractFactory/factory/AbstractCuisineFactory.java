package patterns.creational.abstractFactory.factory;

import patterns.creational.abstractFactory.dishes.dessert.Dessert;
import patterns.creational.abstractFactory.dishes.firstDish.FirstDish;
import patterns.creational.abstractFactory.dishes.secondDish.SecondDish;
import patterns.creational.abstractFactory.dishes.thirdDish.ThirdDish;

public interface AbstractCuisineFactory {
    FirstDish createFirstDish();

    SecondDish createSecondDish();

    ThirdDish createThirdDish();

    Dessert createDessert();
}
