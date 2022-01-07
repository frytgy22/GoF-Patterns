package patterns.creational.abstractFactory.factory.impl;

import patterns.creational.abstractFactory.dishes.dessert.Dessert;
import patterns.creational.abstractFactory.dishes.dessert.impl.JapanDessert;
import patterns.creational.abstractFactory.dishes.firstDish.FirstDish;
import patterns.creational.abstractFactory.dishes.firstDish.impl.JapanFirstDish;
import patterns.creational.abstractFactory.dishes.secondDish.SecondDish;
import patterns.creational.abstractFactory.dishes.secondDish.impl.JapanSecondDish;
import patterns.creational.abstractFactory.dishes.thirdDish.ThirdDish;
import patterns.creational.abstractFactory.dishes.thirdDish.impl.JapanThirdDish;
import patterns.creational.abstractFactory.factory.AbstractCuisineFactory;

public class JapanCuisineFactory implements AbstractCuisineFactory {
    @Override
    public FirstDish createFirstDish() {
        return new JapanFirstDish();
    }

    @Override
    public SecondDish createSecondDish() {
        return new JapanSecondDish();
    }

    @Override
    public ThirdDish createThirdDish() {
        return new JapanThirdDish();
    }

    @Override
    public Dessert createDessert() {
        return new JapanDessert();
    }
}
