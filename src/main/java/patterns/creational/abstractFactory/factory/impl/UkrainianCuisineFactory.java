package patterns.creational.abstractFactory.factory.impl;

import patterns.creational.abstractFactory.dishes.dessert.Dessert;
import patterns.creational.abstractFactory.dishes.dessert.impl.UkrainianDessert;
import patterns.creational.abstractFactory.dishes.firstDish.FirstDish;
import patterns.creational.abstractFactory.dishes.firstDish.impl.UkrainianFirstDish;
import patterns.creational.abstractFactory.dishes.secondDish.SecondDish;
import patterns.creational.abstractFactory.dishes.secondDish.impl.UkrainianSecondDish;
import patterns.creational.abstractFactory.dishes.thirdDish.ThirdDish;
import patterns.creational.abstractFactory.dishes.thirdDish.impl.UkrainianThirdDish;
import patterns.creational.abstractFactory.factory.AbstractCuisineFactory;

public class UkrainianCuisineFactory implements AbstractCuisineFactory {
    @Override
    public FirstDish createFirstDish() {
        return new UkrainianFirstDish();
    }

    @Override
    public SecondDish createSecondDish() {
        return new UkrainianSecondDish();
    }

    @Override
    public ThirdDish createThirdDish() {
        return new UkrainianThirdDish();
    }

    @Override
    public Dessert createDessert() {
        return new UkrainianDessert();
    }
}
