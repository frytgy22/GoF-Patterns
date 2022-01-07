package patterns.creational.abstractFactory.factory.impl;

import patterns.creational.abstractFactory.dishes.dessert.Dessert;
import patterns.creational.abstractFactory.dishes.dessert.impl.AmericanDessert;
import patterns.creational.abstractFactory.dishes.firstDish.FirstDish;
import patterns.creational.abstractFactory.dishes.firstDish.impl.AmericanFirstDish;
import patterns.creational.abstractFactory.dishes.secondDish.SecondDish;
import patterns.creational.abstractFactory.dishes.secondDish.impl.AmericanSecondDish;
import patterns.creational.abstractFactory.dishes.thirdDish.ThirdDish;
import patterns.creational.abstractFactory.dishes.thirdDish.impl.AmericanThirdDish;
import patterns.creational.abstractFactory.factory.AbstractCuisineFactory;

public class AmericanCuisineFactory implements AbstractCuisineFactory {
    @Override
    public FirstDish createFirstDish() {
        return new AmericanFirstDish();
    }

    @Override
    public SecondDish createSecondDish() {
        return new AmericanSecondDish();
    }

    @Override
    public ThirdDish createThirdDish() {
        return new AmericanThirdDish();
    }

    @Override
    public Dessert createDessert() {
        return new AmericanDessert();
    }
}
