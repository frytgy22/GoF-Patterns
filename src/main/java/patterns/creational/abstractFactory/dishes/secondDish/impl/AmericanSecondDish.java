package patterns.creational.abstractFactory.dishes.secondDish.impl;

import patterns.creational.abstractFactory.dishes.CuisineType;
import patterns.creational.abstractFactory.dishes.DishType;
import patterns.creational.abstractFactory.dishes.secondDish.SecondDish;

public class AmericanSecondDish implements SecondDish {
    @Override
    public String getSecondDish() {
        return CuisineType.AMERICAN + " " + DishType.SECOND_DISH;
    }
}
